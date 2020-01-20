package network_t;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClientObject extends JFrame implements ActionListener,Runnable{
	private JTextArea output;
	private JTextField input;
	private JButton send;
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public ChatClientObject() {//생성자는 틀만 만들었음
		output = new JTextArea();
		input = new JTextField();
		send = new JButton("전송");
		
		JPanel p = new JPanel(new BorderLayout());
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(scroll);
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add("Center",input);
		p2.add("East", send);
		
		add("Center",p);
		add("South",p2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		output.setEditable(false);
		setBounds(600,200,500,400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//서버가 응답하기 전까지는 종료해서는 안된다.
				if(oos==null || ois==null) {
					System.exit(0);
				}
				InfoDTO dto = new InfoDTO();
				dto.setCommand(Info.EXIT);
				
				try {
					oos.writeObject(dto);
					oos.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
//				pw.println("quit");
//				pw.flush();
			}
		});
		
	}
	private void service() {//모든 기능은 service가 가짐
		//서버IP
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요","192.168.0.27");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("서버IP가 입력되지 않았습니다.");
			System.exit(0);
		}
		//닉네임
		String nickName = JOptionPane.showInputDialog(this,"닉네임을 입력하세요","닉네임",JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}
		try {
			//소켓생성(Exception잡아줘야함)
			socket = new Socket(serverIP, 9500);
			//IO연결(Exception잡아줘야함)
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		//서버로 닉네임 전송
		InfoDTO dto = new InfoDTO();
		dto.setNickName(nickName);
		dto.setCommand(Info.JOIN);
		
		//스레드 생성
		Thread t = new Thread(this); //ChatClient가 스레드되고싶어서 가져온거니까 this붙여줘야함.
		t.start();
		
		//이벤트
		send.addActionListener(this);
		input.addActionListener(this);//텍스트필드에서도 액션리스너가 먹음
		
	}
	
	public void run() {
		//서버로 받는쪽 
		InfoDTO dto = null;//안들어오면 나중에 nullPointException 떨어지게 null로 설정.
		
		while(true) {
			try {
				dto = (InfoDTO)ois.readObject();
				if(dto.getCommand() == Info.EXIT) {
					ois.close();
					oos.close();
					socket.close();
					System.exit(0);
				}else if(dto.getCommand()==Info.SEND) {
					output.append(dto.getMsg() + "\n");
					int pos = output.getText().length();
					output.setCaretPosition(pos);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
		

	@Override
	public void actionPerformed(ActionEvent e) {//서버로 보내는 쪽
			//서버로 보내기
			String msg = input.getText();
			InfoDTO dto = new InfoDTO();
			if(msg.toLowerCase().equals("exit")) {
				dto.setCommand(Info.EXIT);
			}else {
				dto.setCommand(Info.SEND);
				dto.setMsg(msg);
				
			}
			try {
				oos.writeObject(dto);
				oos.flush();
				input.setText("");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}
}