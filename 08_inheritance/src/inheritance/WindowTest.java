package inheritance;
//���� ���� : setBackground
//������ ���� 
//ũ�⼳��
//Ÿ��Ʋ����
//���̰� ����
//
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class WindowTest extends Frame {
	public WindowTest() {
		//setBackground(Color.CYAN);//color ����Ϸ��� Ŭ������ �ٿ������. Color.cyan
	    //new Frame("���� ���� ������").setVisible(true);
	    super("���� ���� ������");//�θ� ������ ȣ��
	    setForeground(Color.yellow);
		setBackground(new Color(17,45,255));//ColorŬ������ �����ڸ� ȣ���ؼ� ��������
		//this.setSize(300,400);
		setBounds(700,200,300,400);//(����, ��, �Ʒ� , ������)
		setVisible(true);//�����ּ���, false �����ּ���
		
	}

	
	public static void main(String[] args) {
		new WindowTest();
		
	}//main

	@Override
	public void paint(Graphics g) {//Call back method: �ݹ�޼ҵ�;���������� �Ǹ� �ڿ��� JVM�� �˾Ƽ� ȣ���ϴ�.
		//, repaint() - ������ �ٽø����...?
		//super.paint(g); �θ�θ���� ����
		g.drawLine(100, 100, 200, 200);g.drawLine(200, 100, 100, 200);
		g.drawRect(75, 75, 150, 150);
		g.drawOval(75, 75, 150, 150);
	}

}//class
