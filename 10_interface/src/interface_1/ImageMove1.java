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

public class ImageMove1 extends Frame implements WindowListener, ActionListener{
	Button cho,left,right,up,down;
	int x=100;
	int y=100;
	int x2=x,y2=y;
	public void init() {
		cho = new Button("초기화");
		left = new Button("왼쪽");
		right = new Button("오른쪽");
		up = new Button("위");
		down = new Button("아래");
		setTitle("토요일 공부");
		setBounds(700,400,500,500);
		setVisible(true);
		
		
		Panel p = new Panel();
		p.add(cho);
		p.add(left);
		p.add(right);
		p.add(up);
		p.add(down);
		p.setBackground(new Color(17,45,110));
		
		this.add("North",p);
		this.addWindowListener(this);
		cho.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
	}
	public static void main(String[] args) {
		new ImageMove1().init();
	}
	
@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("ball.jpg");
		Image img2 = t.getImage("ball.jpg");
		g.drawImage(img, x, y,this);
		g.drawImage(img2,x2,y2,this);
	}
@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cho)x=y=100;
		else if(e.getSource()==left) {x-=10; if(x==-150)x=500; }
		else if(e.getSource()==right) {x+=10; if(x>360)y2=y;x2=-140;}
		else if(e.getSource()==up) {y-=10; if(y==-150)y=500;}
		else if(e.getSource()==down) {y+=10; if(y==500)y=-150;}
		System.out.println("x: "+x+"  y: "+y);
		repaint();
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
