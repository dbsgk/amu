package network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private Socket socket;
	private InfoDTO dto;
	
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
		try {
			oos.writeObject(dto = new InfoDTO(nickName,"100"));//입장
			oos.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		pw.println(nickName);
//		pw.flush();
		
		
		//스레드 생성
		Thread t = new Thread(this); //ChatClient가 스레드되고싶어서 가져온거니까 this붙여줘야함.
		t.start();
		
		//이벤트
		send.addActionListener(this);
		input.addActionListener(this);//텍스트필드에서도 액션리스너가 먹음
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					dto.setCode("200");
					oos.writeObject(dto);//퇴장
					oos.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
//				pw.println("quit");
//				pw.flush();
			}
		});
	}
	
	@Override
	public void run() {
		//서버로부터 받는 쪽
		String line;
		while(true) {
			try {
				
				//line = br.readLine();
				if(line == null || line.toLowerCase().trim().equals("quit")) {
					oos.close();
					ois.close();
//					br.close();
//					pw.close();
					socket.close();
					
					System.exit(0);
					
				}
				output.append(line+"\n");
				
				int pos = output.getText().length();
				output.setCaretPosition(pos);//커서위치
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//run

	@Override
	public void actionPerformed(ActionEvent e) {//서버로 보내는 쪽
			//텍스트필드로부터 데이터 꺼내오기
			String msg = input.getText();
			//서버로 보내기
			pw.println(msg);
			//버퍼&텍스트필드 비워주기
			pw.flush();
			input.setText("");
	}
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}
}
