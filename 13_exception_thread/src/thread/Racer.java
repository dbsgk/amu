package thread;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Racer extends Canvas implements Runnable{//말 1마리
	private Image img;
	private int pos=0;
	static int rank=1;
	//private int x= 25;
	//private ArrayList<String> rank = new ArrayList<String>();
	
	public Racer() {
		//setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
	}
	@Override
	public void paint(Graphics g) {
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		g.drawImage(img,pos,0,25,this.getHeight(),this);
		g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	}
	@Override
	public synchronized void run() {
		for(int i=0;i<600;i+=(int)(Math.random()*10+1)) {
			pos =i;
//			if((pos+25)==this.getWidth()) {
//				
//			}
			repaint();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}//for
		System.out.println(rank+"등 말은 "+Thread.currentThread().getName()+"입니다.");
		rank++;
	}//run
}
