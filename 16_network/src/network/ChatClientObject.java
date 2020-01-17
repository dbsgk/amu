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
		try {
			oos.writeObject(dto = new InfoDTO(nickName,"100"));//����
			oos.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		pw.println(nickName);
//		pw.flush();
		
		
		//������ ����
		Thread t = new Thread(this); //ChatClient�� ������ǰ�; �����°Ŵϱ� this�ٿ������.
		t.start();
		
		//�̺�Ʈ
		send.addActionListener(this);
		input.addActionListener(this);//�ؽ�Ʈ�ʵ忡���� �׼Ǹ����ʰ� ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					dto.setCode("200");
					oos.writeObject(dto);//����
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
		//�����κ��� �޴� ��
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
				output.setCaretPosition(pos);//Ŀ����ġ
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//run

	@Override
	public void actionPerformed(ActionEvent e) {//������ ������ ��
			//�ؽ�Ʈ�ʵ�κ��� ������ ��������
			String msg = input.getText();
			//������ ������
			pw.println(msg);
			//����&�ؽ�Ʈ�ʵ� ����ֱ�
			pw.flush();
			input.setText("");
	}
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}
}
