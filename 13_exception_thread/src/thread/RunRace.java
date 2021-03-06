package thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class RunRace extends Frame implements ActionListener{
	private int count;
	private String[] name;
	private Button btn;
	private Racer[] r;
	private String[] rank;
	
	public RunRace() {
	}
	public RunRace(int count, String[] name) {
		
		this.count = count;
		this.name = name;
		btn = new Button("  출발  ");
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		Panel p2 = new Panel(new GridLayout(count, 1));
		r = new Racer[count];
		for(int i=0;i<count;i++) {
			r[i]=new Racer();
			p2.add(r[i]);
		}
	
		add("South",p);
		add("Center",p2);
		//btn.setBounds(540,300,100,100);
		setBounds(540,300,600,500);
		setResizable(false);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btn.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);//버튼 못누르게
		Thread[] thread = new Thread[count];
		for(int i=0;i<count;i++) {
			thread[i] = new Thread(r[i],name[i]);
			thread[i].setPriority((int)(Math.random()*10+1));//1~10
			thread[i].start();
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("경주마 수를 입력: ");
		int count = sc.nextInt();
		
		String[] name = new String[count];
		for(int i=0;i<count;i++	) {
			System.out.println("경주마의 이름 입력: ");
			name[i]= sc.next();
		}
		
		new RunRace(count,name);
	}
}
