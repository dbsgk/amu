package interface_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame - BorderLayout
public class ImageMove_t extends Frame implements WindowListener,ActionListener{
	public static final int FRAME_WIDTH=500, FRAME_HEIGHT=500;
	private Button resetB, leftB, upB, downB, rightB;
	private int x=100,y=100;
	public void init() {
		setTitle("이미지 이동");
		setBounds(700,400,FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
		resetB = new Button("초기화");
    	leftB = new Button("왼쪽");
    	upB = new Button("위");
    	downB = new Button("아래");
    	rightB = new Button("오른쪽");
    	
    	Panel p = new Panel();//FlowLayout(순서배치 - 중앙중심)
    	p.setLayout(new GridLayout(1,5,3,0));//레이아웃설정(1줄 5칸(1행5열)) (행,열) (행,열,가로간격,세로간격)
    	p.add(resetB);
    	p.add(leftB);
    	p.add(upB);
    	p.add(downB);
    	p.add(rightB);
    	
    	this.add("North", p);

    	//이벤트
		this.addWindowListener(this);
		resetB.addActionListener(this);
    	leftB.addActionListener(this);
    	upB.addActionListener(this);
    	downB.addActionListener(this);
    	rightB.addActionListener(this);
	}

	@Override
	public void paint(Graphics g) {
		//Toolkit t = Toolkit.getDefaultToolkit();
		//Image img = t.getImage("ball.jpg");
		Image img = Toolkit.getDefaultToolkit().getImage("ball.jpg"); //위 두줄을 한줄로.
		g.drawImage(img, x, y, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetB) {x=y=100;}
		else if(e.getSource()==leftB) {
			x-=10;
			if(x<-150)x=480;}
		else if(e.getSource()==upB) {
			y-=10;
			if(y<-90)y=480;}
		else if(e.getSource()==downB) {
			y+=10;
			if(y>480)y=-90;}
		else if(e.getSource()==rightB) {
			x+=10;
			if(x>480)x=-150;}
		System.out.println("X:"+x+"\tY:"+y);
		
		repaint();
	}
	public static void main(String[] args) {
		new ImageMove_t().init();
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
