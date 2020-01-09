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
		//redB = new JButton("����");
		redB = new JButton(new ImageIcon("���Ƹ�.gif"));//JButton(String str, Icon icon) ; 
		greenB = new JButton("�ʷ�");			//Icon�� interface�� �ڽ�Ŭ������ ImageIcon�� new�ؼ� �־��ָ� ��. 
		blueB = new JButton("�Ķ�");
		
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

		//�̺�Ʈ
		addWindowListener(new WindowAdapter() { //���ϴ°� �����Ƽ� ������� �޼ҵ常 ��� ����� �߻�޼ҵ�� ������ ����.
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
	
	class DrCanvas extends Canvas{//�̳�Ŭ������ �ۿ� ��� �� ���� ����.
		public DrCanvas() {
			setBackground(new Color(255,200,225));
		}
	}
	public static void main(String[] args) {
		new RGBTest();
	}
	
}
