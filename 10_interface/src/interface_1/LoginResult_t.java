package interface_1;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginResult_t extends JFrame implements WindowListener{
	private String id,pwd;
	
	public LoginResult_t(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
		
		setBounds(1200,200,150,150);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
	}

	@Override
	public void paint(Graphics g) {
		if(id.equals("angel")&& pwd.equals("1004")) {
			g.drawString("로그인 성공", 40, 80);
			JOptionPane.showMessageDialog(this, "로그인 성공");
		
		}else {
			g.drawString("로그인 실패", 40, 80);
			JOptionPane.showMessageDialog(this, "로그인 실패");
			}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		setVisible(false);
		//System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
