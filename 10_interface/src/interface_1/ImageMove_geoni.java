package interface_1;
//이미지 두동강
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageMove_geoni extends Frame implements ActionListener{
	private Button initButton, leftButton, upButton, downButton, rightButton = null;
	private final int FRAME_WIDTH = 500, FRAME_HEIGHT = 500;
	private int imageX = 200, imageY = 200;
    public void init() {
    	
    	setTitle("이미지 이동");
    	setBounds(700,400,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	
    	initButton = new Button("초기화");
    	leftButton = new Button("왼쪽");
    	upButton = new Button("위");
    	downButton = new Button("아래");
    	rightButton = new Button("오른쪽");
    	
    	Panel p = new Panel();
    	p.add(initButton);
    	p.add(leftButton);
    	p.add(upButton);
    	p.add(downButton);
    	p.add(rightButton);
    	
    	this.add("North", p);
    	initButton.addActionListener(this);
    	leftButton.addActionListener(this);
    	upButton.addActionListener(this);
    	downButton.addActionListener(this);
    	rightButton.addActionListener(this);
    	this.addWindowListener(new WindowExit());
    }  // init()
	
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();// 이미지 불러오기
		Image img = t.getImage("lion.jpg");
		g.drawImage(img, imageX, imageY, this);
		if(imageX>400) {
			g.drawImage(img, imageX - 500, imageY, this);
		}
		if(imageX<0) {
			g.drawImage(img, 500 + imageX, imageY, this);
		}
		if(imageY>400) {
			g.drawImage(img, imageX, imageY - 440, this);
		}
		if(imageY<60) {
			g.drawImage(img, imageX, 440 + imageY, this);
		}
	} // paint()
	
	public static void main(String[] args) {
		new ImageMove().init();
	} // main()
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == initButton) {
			System.out.println("초기화");
			imageX = 200;
			imageY = 200;
			repaint();
		}else if(e.getSource() == leftButton) {
			imageX -= 10;
			if(imageX == -100) imageX = 400;
			repaint();
		}else if(e.getSource() == upButton) {
			imageY -=10;
			if(imageY == -40) imageY = 400;
			repaint();
		}else if(e.getSource() == downButton) {
			imageY +=10;
			if(imageY == 500) imageY = 60;
			repaint();
		}else if(e.getSource() == rightButton) {
			imageX += 10;
			if(imageX == 500) imageX = 0;
			repaint();
		}
	}  // actionPerformed()
}
