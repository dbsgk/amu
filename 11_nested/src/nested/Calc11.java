package nested;
//1.처음에 0을 누르면 0하나만
//.을 누르고 0을 누르면 0이 추가
//앞에 유효숫자가 있으면 0추가

//2. .이 있으면 더이상 .이 추가되면 안된다.
//3.  ← 더이상 지울거 없으면 0만 띄워주면 됨.
//4. 연산자 누르면 dispL에 올라가기.
//5. = 누르면 그것도 dispL에
//변수에 담아놨다가 연산할때 dispL에 뿌려주고 변수 비우기
//affend,indexOf,delete,if
//inputL.setText(inputBuf);

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calc11 extends JFrame implements ActionListener{
	JLabel dispL,inputL;
	JButton[] b = new JButton[18]; //b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bBack,bReset,bPlus,bMinus,bMul,bDiv,bDot,bResult;
	String input=0+"";
	StringBuffer inputBuf,dispBuf;
	DecimalFormat dcf;
	String dcfS;
	public Calc11() {
		this.setLayout(null);
		dispL = new JLabel("",SwingConstants.RIGHT);
		inputL = new JLabel("0",SwingConstants.RIGHT);
		for(int i=0;i<b.length;i++) {
			b[i]= new JButton(i+"");
		}//for
		inputBuf = new StringBuffer();
		dispBuf= new StringBuffer();
		dcf = new DecimalFormat();
		
		
		dispL.setOpaque(true); //JLabel 배경색 먹게 설정.
		inputL.setOpaque(true); 
		dispL.setBackground(Color.WHITE);
		inputL.setBackground(Color.WHITE);
		
		
		b[10].setText("←");
		b[11].setText("C");
		b[12].setText("+");
		b[13].setText("-");
		b[14].setText("×");
		b[15].setText("/");
		b[16].setText(".");
		b[17].setText("=");
		
		Container c= this.getContentPane();
		c.add(dispL);
		c.add(inputL);
		for(int i=0;i<b.length;i++) {
			c.add(b[i]);
		}
		
		dispL.setBounds(20,20,300,50);
		
		inputL.setBounds(20,80,300,50);
		inputL.setText(input+" ");
		inputL.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		
		
		
		b[0].setBounds(95,370,70,50);
		
		b[1].setBounds(20,310,70,50);
		b[2].setBounds(95,310,70,50);
		b[3].setBounds(170,310,70,50);
		
		b[4].setBounds(20,250,70,50);
		b[5].setBounds(95,250,70,50);
		b[6].setBounds(170,250,70,50);
		
		b[7].setBounds(20,195,70,50);
		b[8].setBounds(95,195,70,50);
		b[9].setBounds(170,195,70,50);

		b[10].setBounds(20,140,145,50);// ←
		b[11].setBounds(175,140,140,50); //C (시작x좌표, 시작y좌표, 가로길이, 세로길이)
		
		b[12].setBounds(245,370,70,50);// +
		b[13].setBounds(245,310,70,50);// -
		b[14].setBounds(245,250,70,50);// '*'
		b[15].setBounds(245,195,70,50);// '/'
		
		b[16].setBounds(20,370,70,50);// .
		b[17].setBounds(170,370,70,50);// =
		
		
		
		
		setTitle("계산기");
		setBounds(700,200,340,475);
		setResizable(false);//사이즈 고정
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		for(int i=0;i<b.length;i++) {
			b[i].addActionListener(this);
			
			
		}
	}//calc
	
	
	public static void main(String[] args) {
		new Calc11();
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=1;i<10;i++) {
			if(e.getSource()==b[i]) {
				if(inputBuf.length()==1 && inputBuf.toString().equals("0"))
					inputBuf.delete(0, inputBuf.length());
					inputBuf.append(i);
			}
		}//for(1~9)
		if(e.getSource()==b[0]) {
			if(inputBuf.length()==1 && inputBuf.toString().equals("0"))
				inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
			
		}else if(e.getActionCommand()=="←") {
			if(inputBuf.length()!=0) {
				inputBuf.delete(inputBuf.length()-1, inputBuf.length());
				if(inputBuf.length()==0)
					inputBuf.append("0");
			}
			
		}else if(e.getActionCommand()=="C") {
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
			dispBuf.delete(0, dispBuf.length());
			dispBuf.append("");
			
		}else if(e.getActionCommand()=="/") {
			dispBuf.append(inputBuf.toString());
			dispBuf.append("/");
			inputBuf.delete(0, inputBuf.length());
			
		}else if(e.getActionCommand()=="×") {
			dispBuf.append(inputBuf.toString());
			dispBuf.append("×");
			inputBuf.delete(0, inputBuf.length());
			
		}else if(e.getActionCommand()=="-") {
			dispBuf.append(inputBuf.toString());
			dispBuf.append("-");
			inputBuf.delete(0, inputBuf.length());
			
		}else if(e.getActionCommand()=="+") {
			dispBuf.append(inputBuf.toString());
			dispBuf.append("+");
			inputBuf.delete(0, inputBuf.length());
			
		}else if(e.getActionCommand()=="=") {
			dispBuf.append(inputBuf.toString());
			dispBuf.append("=");
			inputBuf.delete(0, inputBuf.length());
			
		}else if(e.getActionCommand()==".") {
			if(inputBuf.toString().indexOf(".")==-1) {
				if(inputBuf.length()==0)
					inputBuf.append("0");
				inputBuf.append(".");
			}
		}
		dispL.setText(dispBuf.toString());
		inputL.setText(inputBuf.toString());
		
	}//action
}//class
