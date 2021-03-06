package interface_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;//확장패키지
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//awt(부모) - swing(자식) : 그래서 swing이 기능이 더 많다.
public class Login extends JFrame implements WindowListener, ActionListener{
	private JLabel idL, pwdL;//한줄 보여주는 ex) 찾기: , 바꾸기: 
	private JTextField idT;
	private JButton loginB, cancleB;
	String inputId,inputPwd;
	private JPasswordField pwdT;
	public Login() {
		this.setLayout(null);//레이아웃을 깨다(border layout이 아니다 ) = 우리가 좌표지정해줘야한다.
		
		idL = new JLabel("아이디");
		pwdL = new JLabel("비밀번호");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("로그인");
		cancleB = new JButton("취소");
		
//		idL.setLocation(50,80);
//		idL.setSize(50,30);
		//setBounds(시작x좌표, 시작y좌표, 가로길이, 세로길이)
		idL.setBounds(50,70,50,30);//위 두줄을 합한것.
		pwdL.setBounds(50,120,60,30);
		
		idT.setBounds(120,70,100,30);
		pwdT.setBounds(120,120,100,30);
		
		loginB.setBounds(40,190,100,30);
		cancleB.setBounds(150,190,100,30);
		
		Container c= this.getContentPane();
		c.add(idL);
		c.add(idT);
		
		c.add(pwdL);
		c.add(pwdT);
		
		c.add(loginB);
		c.add(cancleB);
		
		setBounds(900,100,300,300);
		setVisible(true);
		//swing은 X버튼 누르면 히든이 된다(실행은 계속 되고 있음)
		
		//이벤트
		this.addWindowListener(this);		
		cancleB.addActionListener(this);
		loginB.addActionListener(this);
	}
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cancleB) {
			idT.setText("");
			pwdT.setText("");
		}else if(e.getSource()==loginB) { //e.getActionCommand()=="로그인"  ; 로그인을 통해서 들어왔니?; 이걸로 사용해도 됨.
			String inputId = idT.getText();
			String inputPwd = pwdT.getText();
			
			new LoginResult(inputId, inputPwd);
			
			
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
