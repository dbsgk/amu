package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer extends JFrame implements ActionListener,Runnable{
	private JButton startBtn,stopBtn;
	private JLabel countL;
	private boolean bb =true;
	
	public Timer() {
		setLayout(null);
		
		startBtn = new JButton("Ω√¿€");
		stopBtn = new JButton("∏ÿ√„");
		
		startBtn.setBounds(200,20,80,50);
		stopBtn.setBounds(200,80,80,50);
		
		countL = new JLabel("0");
		setBounds(600,400,300,200);
		setBackground(Color.black);
		setVisible(true);
		
		countL.setBounds(80,20,150,100);
		countL.setFont(new Font("Blippo Blk BT",Font.PLAIN,80));
		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
		add(startBtn);
		add(stopBtn);
		add(countL);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Timer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startBtn) {
			bb = true; new Thread(this).start();
			startBtn.setEnabled(false);
			stopBtn.setEnabled(true);
		}
		else if(e.getSource()==stopBtn) {
			bb = false;
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
		}
	}
	@Override
	public void run() {
		
		for(int i=1;i<=20;i++) {
			countL.setText(i+"");
			if(!bb) break;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==20) {
				bb = false;
				startBtn.setEnabled(true);
				stopBtn.setEnabled(false);
				i=-1; countL.setText(i+"");
			}
		}
	}

}
