package interface_1;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 아이디 비번맞는지 여기서 비교.
// id: angel  pw: 1004 면 로긴 성공 아니면 실패
// x 누르면 로긴창 닫히고 login창이 열린다.
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginResult extends JFrame implements WindowListener{
	private String id = "angel";
	private String pwd = "1004";
	private JLabel sfL;
	
	public LoginResult(String inputId, String inputPwd) {
		if(inputId.equals(id)&& inputPwd.equals(pwd)) {
			sfL = new JLabel("로그인 성공");
		
		}else {sfL = new JLabel("로그인 실패");}
		//sfL.setBounds(100,70,50,30);
		Panel p = new Panel();
		
		p.add(sfL);
		add("Center",p);
		setBounds(900,300,200,200);
		setVisible(true);
		
		
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.setVisible(false);
		new Login().setVisible(true);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
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
