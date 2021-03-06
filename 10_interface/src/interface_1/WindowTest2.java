package interface_1;
//Class: ImageMove.java
//생성자 잡지말고 init메소드 잡아서 해라
//500,500 프레임창/ 오른쪽 상단 X
//왼쪽 상단 이미지 이동(title)
//이미지하나 저장해서 100,100에 이미지 띄우기
//타이틀 아래라인 (North) Panel로 버튼 5개 넣기.
//1. 초기화 : (100,100)으로 다시오게하기
//2. 왼쪽 3.위 4.아래 5. 오른쪽 
//버튼누르면 10씩 움직이게 하기.

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Frame은 BorderLayout(동서남북) : 동서남북 센터, 하나씩만 가능. 중첩되면 하나밖에 표시안됨.
public class WindowTest2 extends Frame implements WindowListener , ActionListener{
	private Button newB, exitB=null;//기본적으로  null값 가지고 있음 그래서 new 해줘야함.
	private TextArea area;//텍스트 여러줄; 나중에 채팅할떄 사용.
	
	public void init() {
		exitB = new Button("끝내기");//버튼은 물과 같이 어디에 담느냐에 따라 버튼크기가 변하나?
		newB = new Button("새로만들기");
		area = new TextArea();
		
		Panel p = new Panel();//FlowLayout(순서배치-중앙)가운데를 기준으로 맞춰서 들어감
		p.setBackground(new Color(255,60,30));
		p.add(newB);
		p.add(exitB);
		
		this.add("North",p);
		this.add("Center",area);
//		this.add("South", exitB);//this생략가능
//		add("North",newB);
		
		setBounds(900,200,300,400);
		setVisible(true);
		//이벤트
		this.addWindowListener(this);
		exitB.addActionListener(this);
		newB.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitB)System.exit(0);
		else if(e.getSource()==newB) {area.setText(" ");area.setText("");}//초기화
	}
	public static void main(String[] args) {
		new WindowTest2().init();
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
