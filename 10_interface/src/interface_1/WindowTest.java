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
		setTitle("내가 만든 윈도우");
		//setBackground(new Color(17,45,110));
		setBounds(500, 400, 300, 400);
		setVisible(true);
		
		//이벤트
		this.addMouseListener(this);//마우스 구현부{} 내가 가지고 있어. 여기서 찾아서 처리해.
		this.addMouseMotionListener(this);//마우스 모션 구현부{} 나한테 있어. 찾아서 처리해
		this.addWindowListener(new WindowExit()); 
	}
	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
		x = e.getX();
		y = e.getY();
		str = "X:"+e.getX()+"\tY:"+e.getY();
		System.out.println("X:"+e.getX()+"\tY:"+e.getY());
		
		repaint();//update() - paint()순으로 호출
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 IN");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 OUT");
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
		System.out.println("마우스 드래그");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
