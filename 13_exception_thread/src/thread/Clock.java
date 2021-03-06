package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame {
	private String time,hour,min,sec;
	
	public Clock() {
		//현재 시스템시간 표시 
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		Date date = new Date();
		time = sdf.format(date);
		setBounds(600,400,300,100);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(time, 100, 60);
	}

	public static void main(String[] args) {
		new Clock();
	}
}
