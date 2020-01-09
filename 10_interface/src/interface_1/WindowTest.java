package interface_1;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

//300.400
public class WindowTest extends JFrame implements MouseListener, MouseMotionListener{
	int x,y;
	String str="";
	public static void main(String[] args) {
		WindowTest w = new WindowTest();
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(str, x, y);
	}

	public WindowTest() {
		setTitle("���� ���� ������");
		//setBackground(new Color(17,45,110));
		setBounds(500, 400, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ
		this.addMouseListener(this);//���콺 ������{} ���� ������ �־�. ���⼭ ã�Ƽ� ó����.
		this.addMouseMotionListener(this);//���콺 ��� ������{} ������ �־�. ã�Ƽ� ó����
		this.addWindowListener(new WindowExit()); 
	}
	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
		x = e.getX();
		y = e.getY();
		str = "X:"+e.getX()+"\tY:"+e.getY();
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
		
		repaint();//update() - paint()������ ȣ��
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺 IN");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺 OUT");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//MouseMotionListener Override - Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("���콺 �巡��");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
