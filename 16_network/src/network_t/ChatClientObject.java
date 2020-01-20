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
	
	public ChatClientObject() {//�����ڴ� Ʋ�� �������
		output = new JTextArea();
		input = new JTextField();
		send = new JButton("����");
		
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
				//������ �����ϱ� �������� �����ؼ��� �ȵȴ�.
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
	private void service() {//��� ����� service�� ����
		//����IP
		String serverIP = JOptionPane.showInputDialog(this, "����IP�� �Է��ϼ���","192.168.0.27");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�.");
			System.exit(0);
		}
		//�г���
		String nickName = JOptionPane.showInputDialog(this,"�г����� �Է��ϼ���","�г���",JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}
		try {
			//���ϻ���(Exception��������)
			socket = new Socket(serverIP, 9500);
			//IO����(Exception��������)
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
		//������ �г��� ����
		InfoDTO dto = new InfoDTO();
		dto.setNickName(nickName);
		dto.setCommand(Info.JOIN);
		
		//������ ����
		Thread t = new Thread(this); //ChatClient�� ������ǰ�; �����°Ŵϱ� this�ٿ������.
		t.start();
		
		//�̺�Ʈ
		send.addActionListener(this);
		input.addActionListener(this);//�ؽ�Ʈ�ʵ忡���� �׼Ǹ����ʰ� ����
		
	}
	
	public void run() {
		//������ �޴��� 
		InfoDTO dto = null;//�ȵ����� ���߿� nullPointException �������� null�� ����.
		
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
	public void actionPerformed(ActionEvent e) {//������ ������ ��
			//������ ������
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