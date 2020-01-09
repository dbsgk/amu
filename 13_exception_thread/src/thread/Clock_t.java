package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock_t extends Frame implements Runnable { //Clock�� ���� Frame�� ��ӹ޾Ƽ� Frame�̴�. Tv��ӹ����� ������Tv�ΰ�ó��.
	private String time,hour,min,sec;				//Thread�� ��ӹ����� �ƴ϶� Thread�� �ƴϴϱ� ���� Thread ��������� �Ѵ�.
	
	public Clock_t() {
		//���� �ý��۽ð� ǥ�� 
		setFont(new Font("����ü", Font.BOLD, 30));
		setForeground(new Color(255,100,150));
		setBounds(600,400,300,100);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		//������ ����
		Thread t = new Thread(this);//���� ������� ����� �ּ���. 
		//������ ����
		t.start();
		
	}
	
	@Override
	public void run() {
	//public void run() throws InterruptedException { - (����) �������̵� �� �������� throws ����ϸ� �ȵ�. �θ�� �޶����ϱ�.
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//����: 1/1000��
		}
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH�� mm�� ss��");
		Date d = new Date();
		g.drawString(sdf.format(d), 40, 70);
	}

	public static void main(String[] args) {
		new Clock_t();
	}

}
