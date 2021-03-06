package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Packman extends Frame implements KeyListener{
	private Image img;
	private int x1,x2,y1,y2;
	public Packman() {
		setBounds(540,300,500,500);
		setResizable(false);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(this);
	}//const
	@Override
	public void paint(Graphics g) {
		img = Toolkit.getDefaultToolkit().getImage("packman.jpg"); 
		g.drawImage(img,225,225,275,275, //화면위치 225,225,275,275
				x1,y1,x2,y2, this);//이미지위치 100,0,150,50 오른쪽
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x1=y1=0;
			x2=y2=50;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x1=100;y1=0;
			x2=150;y2=50;
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			x1=200;y1=0;
			x2=250;y2=50;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			x1=300;y1=0;
			x2=350;y2=50;
		}
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	public static void main(String[] args) {
		new Packman();
	}//main
}//class
