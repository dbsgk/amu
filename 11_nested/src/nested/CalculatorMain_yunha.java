package nested;

/*
result - 처음에 들어온 값 또는 중간결과

result 결과, op 연산자

1. op에 연산자가 0이면 result에 값을 넣는다.
2. 연산자를 op에 넣는다
3. op에 있는 값이 0이 아니면 덧셈 연산을 하여 결과를 result에 넣는다.
4. 연산자를 op에 넣는다.

3,4,3,4,3,4, 반복


*/
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain_yunha extends JFrame implements ActionListener{
	private JLabel dispL, inputL;   
	private JButton[] button;   
	private StringBuffer inputBuf,dispBuf;
	private double result;
	private int op;
	
	
   public CalculatorMain_yunha() {
      setLayout(null);
      
      dispL = new JLabel("", JLabel.RIGHT);
      dispL.setBackground(Color.WHITE);
      dispL.setOpaque(true);
      dispL.setBounds(9,10,375,50);
      
      inputL = new JLabel("0", JLabel.RIGHT);
      inputL.setBackground(Color.WHITE);
      inputL.setOpaque(true);
      inputL.setBounds(9,70,375,50);
      
      String[] title = {"←","C",
    		            "7","8","9","/",
    		            "4","5","6","*",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
    	//이벤트
    	  button[i].addActionListener(this);
      }
      inputBuf = new StringBuffer("0");
      dispBuf = new StringBuffer();
      button[0].setBounds(9,130,185,50);
      button[1].setBounds(199,130,185,50);
      
      button[2].setBounds(9,190,90,50);
      button[3].setBounds(104,190,90,50);
      button[4].setBounds(199,190,90,50);
      button[5].setBounds(294,190,90,50);
      
      button[6].setBounds(9,250,90,50);
      button[7].setBounds(104,250,90,50);
      button[8].setBounds(199,250,90,50);
      button[9].setBounds(294,250,90,50);
      
      button[10].setBounds(9,310,90,50);
      button[11].setBounds(104,310,90,50);
      button[12].setBounds(199,310,90,50);
      button[13].setBounds(294,310,90,50);
      
      button[14].setBounds(9,370,90,50);
      button[15].setBounds(104,370,90,50);
      button[16].setBounds(199,370,90,50);
      button[17].setBounds(294,370,90,50);
      
      add(dispL);
      add(inputL);
      for(int i=0; i<button.length; i++) {
    	  add(button[i]);
      }
      
      inputL.setFont(new Font("맑은 고딕", Font.BOLD, 35));
      dispL.setFont(new Font("맑은 고딕", Font.BOLD, 35));
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
      
      //이벤트
      addWindowListener(new WindowAdapter() {
    	  @Override
    	public void windowClosing(WindowEvent e) {
    		System.exit(0);
    	}
	});
      
   }
//---------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat df = new DecimalFormat("##.##########");
		//숫자
		String pushB = e.getActionCommand();
		if(pushB=="0" ||pushB=="1" ||pushB=="2" ||pushB=="3" ||pushB=="4" ||pushB=="5" ||pushB=="6" ||pushB=="7" ||pushB=="8" ||pushB=="9" ) {
			if(inputBuf.toString().equals("0"))inputBuf.delete(0,1);
			
			inputBuf.append(pushB);
			inputL.setText(inputBuf+"");
		}else if(pushB=="←") {
			inputBuf.delete(inputBuf.length()-1, inputBuf.length());
			if(inputBuf.length()==0) inputBuf.append("0");
			inputL.setText(inputBuf+"");
		}else if(pushB=="C") {
			inputBuf.delete(0, inputBuf.length());
			dispBuf.delete(0, dispBuf.length());
			
			dispL.setText("");
			inputL.setText("0");
			op=0;
			result=0;
		}else if(pushB==".") {
			if(inputBuf.indexOf(".")==-1) inputBuf.append(".");
			inputL.setText(inputBuf+"");
		}else if(pushB=="+" ||pushB=="-" ||pushB=="/" ||pushB=="*"){
			if(op==0){
				op = pushB.charAt(0);
				result = Double.parseDouble(inputBuf+"");
				dispBuf.append(inputBuf+""+(char)op);
				dispL.setText(dispBuf+"");
				inputBuf.delete(0, inputBuf.length());
			}else {
				if(op=='+'){
					result += Double.parseDouble(inputBuf+"");
				}else if(op=='-'){
					result -= Double.parseDouble(inputBuf+"");
				}else if(op=='*'){
					result *= Double.parseDouble(inputBuf+"");
				}else if(op=='/'){
					result /= Double.parseDouble(inputBuf+"");
				}
				inputL.setText(df.format(result));
				op = pushB.charAt(0);
				dispBuf.append(inputBuf+""+(char)op);
				inputBuf.delete(0, inputBuf.length());
				dispL.setText(dispBuf+"");
			}
			
		}if(pushB=="="){
			if(dispBuf.indexOf("=")==-1) {
			if(op=='+'){
				result += Double.parseDouble(inputBuf+"");
			}else if(op=='-'){
				result -= Double.parseDouble(inputBuf+"");
			}else if(op=='*'){
				result *= Double.parseDouble(inputBuf+"");
			}else if(op=='/'){
				result /= Double.parseDouble(inputBuf+"");
			}
			inputL.setText(df.format(result));
			op = pushB.charAt(0);
			dispBuf.append(inputBuf+""+(char)op);
			inputBuf.delete(0, inputBuf.length());
			dispL.setText(dispBuf+"");
			}
		}// "="
			
	}//actionPerformed	
			
	//숫자 + 연산자 누르면 result에 넣고 다음값이 들어오면 result와 연산하고
	//연산자 누르면 3+3
			

	public static void main(String[] args) {
      new CalculatorMain_yunha();
   }

}


