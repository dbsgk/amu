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
	private void service() {
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
	}

	public static void main(String[] args) {
		new ChatClient().service();
	}
}
