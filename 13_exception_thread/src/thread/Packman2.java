package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Packman2 extends Frame implements KeyListener,Runnable{
	private Image img, food[];
	private int[] X,Y;
	private int count;
//	private int X=(int)(Math.random()*460+20);
//	private int Y=(int)(Math.random()*430+50);
	private int sel=2;
	private int x=225, y=225;
	private int mx,my;
	public Packman2() {
		Y = new int[5];
		X = new int[5];
		for(int i=0;i<5;i++	) {
			X[i]= (int)(Math.random()*460+20);
			Y[i]= (int)(Math.random()*430+50);
			System.out.println("����"+i+"��ġ= "+X[i]+":"+Y[i]);
		}
		setBounds(540,300,500,500);
		setResizable(false);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(this);
		//������ ����
		Thread t = new Thread(this);
		t.start();
		
	}//const
	@Override
//			X = (int)(Math.random()*460+20);
//			Y = (int)(Math.random()*430+50);
	public void paint(Graphics g) {
		food = new Image[5];
	//	X = 		g.drawImage(food[0], X, Y, this);

		for(int i=0;i<5;i++) {
			food[i] = Toolkit.getDefaultToolkit().getImage("food.jpg"); 
			g.drawImage(food[i], X[i], Y[i], this);
		}
		img = Toolkit.getDefaultToolkit().getImage("packman.jpg"); 
		g.drawImage(img,x,y,x+50,y+50, //ȭ����ġ 225,225,275,275
				sel*50,0,sel*50+50,50, this);//�̹�����ġ 100,0,150,50 ������
	}
	
	@Override
	public void run() {
		while(true) {
			if(count==5) {
				JOptionPane.showMessageDialog(this, "����");
				break;
			}
			if(sel%2==0) {
				sel++;
			}else sel--;
				x+=mx;
				y+=my;
			if(x>500)x=0;
			else if(x<0)x=500;
			if(y>500)y=0;
			else if(y<0)y=500;
			
			for(int i=0;i<5;i++	) {
				if((x+10)<=X[i]&& ((x+40)>X[i]) &&(y+10)<=Y[i]&& ((y+40)>Y[i])) {
					X[i]=Y[i]=0; count++;
				}
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			sel=0;mx=-10;my=0;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			sel=2;mx=10;my=0;
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			sel=4;mx=0;my=-10;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			sel=6;mx=0;my=10;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	public static void main(String[] args) {
		new Packman2();
	}//main
}//class