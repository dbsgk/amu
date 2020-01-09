package nested;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RGBTest extends JFrame{
	private JButton redB, greenB, blueB;
	private DrCanvas can;
	
	public RGBTest() {
		//redB = new JButton("빨강");
		redB = new JButton(new ImageIcon("병아리.gif"));//JButton(String str, Icon icon) ; 
		greenB = new JButton("초록");			//Icon은 interface라서 자식클래스인 ImageIcon을 new해서 넣어주면 됨. 
		blueB = new JButton("파랑");
		
		can = new DrCanvas();
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3,3,0));
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		
		Container c = this.getContentPane();
		c.add("North",p);
		c.add("Center",can);
		
		setBounds(600,200,400,400);
		setVisible(true);

		//이벤트
		addWindowListener(new WindowAdapter() { //원하는거 골라잡아서 쓰고싶은 메소드만 골라서 쓰라고 추상메소드로 만들지 않음.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		redB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255,0,0));
			}
		});
		greenB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,255,0));
			}
		});
		blueB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,0,255));
			}
		});
		
	}
	
	class DrCanvas extends Canvas{//이너클래스라 밖에 멤버 다 쓸수 있음.
		public DrCanvas() {
			setBackground(new Color(255,200,225));
		}
	}
	public static void main(String[] args) {
		new RGBTest();
	}
	
}
