package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock_t extends Frame implements Runnable { //Clock은 현재 Frame을 상속받아서 Frame이다. Tv상속받으면 디지털Tv인것처럼.
	private String time,hour,min,sec;				//Thread를 상속받은게 아니라 Thread가 아니니까 따로 Thread 생성해줘야 한다.
	
	public Clock_t() {
		//현재 시스템시간 표시 
		setFont(new Font("돋움체", Font.BOLD, 30));
		setForeground(new Color(255,100,150));
		setBounds(600,400,300,100);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		//스레드 생성
		Thread t = new Thread(this);//나를 스레드로 만들어 주세요. 
		//스레드 시작
		t.start();
		
	}
	
	@Override
	public void run() {
	//public void run() throws InterruptedException { - (오류) 오버라이드 된 구역에는 throws 사용하면 안됨. 부모와 달라지니까.
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//단위: 1/1000초
		}
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		Date d = new Date();
		g.drawString(sdf.format(d), 40, 70);
	}

	public static void main(String[] args) {
		new Clock_t();
	}

}
