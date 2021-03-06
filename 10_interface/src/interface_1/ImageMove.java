package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements WindowListener,ActionListener {
	/**
	 * <font style="color:red;">왼쪽, 오른쪽, 위, 아래로 이동시키는 버튼이다.</font>
	 */
	public Button cho, left, right, up, down;
	
	/**
	 * 이미지의 시작 위치
	 */
	public int x=100;
	public int y=100;
	
	/**
	 * <font style="color:blue;">메인화면을 꾸며주는 메소드</font>
	 */
	public void init() {
		cho = new Button("초기화");
		left = new Button("왼쪽");
		right = new Button("오른쪽");
		up = new Button("위");
		down = new Button("아래");
		setTitle("이미지 이동");
		
		Panel p = new Panel();
		p.setBackground(new Color(17,45,117));
		p.add(cho);
		p.add(left);
		p.add(right);
		p.add(up);
		p.add(down);
		setBounds(600,400,500,500);
		setVisible(true);
		
		this.addWindowListener(this);//여기서 구현부 읽어오라는 말.
		this.add("North",p);
		cho.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		
	}
	public static void main(String[] args) {
		ImageMove im =new ImageMove();
		im.init();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cho) {x=y=100;}
		else if(e.getSource()==left) {x-=10;if(x==-150)x=500;}
		else if(e.getSource()==right) {x+=10;if(x==500)x=-150;}
		else if(e.getSource()==up) {y-=10;if(y==-150)y=500;}
		else if(e.getSource()==down) {y+=10;if(y==500)y=-150;}
		
		repaint();
		System.out.println(x+":"+y);
	}
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("ball.jpg");
		g.drawImage(img, x, y,this);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
