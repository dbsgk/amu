package network;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame{
	JTextArea output;
	JTextField input;
	JButton send;
	
	public ChatClient() {
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
	private void service() {
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
	}

	public static void main(String[] args) {
		new ChatClient().service();
	}
}
