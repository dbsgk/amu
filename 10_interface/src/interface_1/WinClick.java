package interface_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WinClick extends Frame implements MouseListener, MouseMotionListener{
	//String str;
	int x,y;
	@Override
	public void paint(Graphics g) {
		g.drawString("X: "+x+"  Y: "+y, x, y);
	}
	public WinClick() {
		setTitle("좌표 클릭");
		setBounds(600,200,300,400);
		setVisible(true);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		
	}
	public static void main(String[] args) {
		new WinClick();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//str = "X:"+e.getX()+"\tY:"+e.getY();
		x = e.getX();
		y = e.getY();
		System.out.println("마우스 클릭");
		repaint();
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
