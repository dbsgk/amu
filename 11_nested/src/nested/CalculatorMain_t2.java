package nested;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain_t2 extends JFrame implements ActionListener {
	private JLabel dispL, inputL;   
	private JButton[] button;   
	private StringBuffer dispBuf, inputBuf;
	private double result;
	private int op;
	private boolean opCheck;
	private DecimalFormat df = new DecimalFormat("#.#######");
   public CalculatorMain_t2() {
      setLayout(null);
      dispL = new JLabel("", JLabel.RIGHT);
      dispL.setBackground(Color.WHITE);
      dispL.setOpaque(true);
      dispL.setBounds(9,10,375,50);
      dispL.setFont(new Font("Arial", Font.BOLD, 17));
      
      inputL = new JLabel("0", JLabel.RIGHT);
      inputL.setBackground(Color.WHITE);
      inputL.setOpaque(true);
      inputL.setBounds(9,70,375,50);
      inputL.setFont(new Font("Arial", Font.BOLD, 17));
      
      String[] title = {"←","C",
    		            "7","8","9","/",
    		            "4","5","6","*",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
      }
      
      dispBuf = new StringBuffer();
      inputBuf = new StringBuffer("0");
      
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
      
      Container c = this.getContentPane();
      c.add(dispL);
      c.add(inputL);
      for(int i=0; i<button.length; i++) {
    	  add(button[i]);
    	  
    	  //이벤트
    	  button[i].addActionListener(this);
      }
      
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   //숫자
	   String pushB  = e.getActionCommand();
	   
	   if(pushB=="1" ||
		  pushB=="2" ||
		  pushB=="3" ||
		  pushB=="4" ||
		  pushB=="5" ||
		  pushB=="6" ||
		  pushB=="7" ||
		  pushB=="8" ||
		  pushB=="9" ||
		  pushB=="0" ) {
		   if(dispBuf.length()==0 && inputBuf.length()==0) {
			   dispL.setText("");
			   inputL.setText("");
		   }
		   
		   if(inputBuf.toString().equals("0")) inputBuf.delete(0, 1); 
		   
		   inputBuf.append(pushB);
		   inputL.setText(inputBuf+"");
		   
		   opCheck = false;
		   
	   }else if(pushB=="←") {
		   inputBuf.delete(inputBuf.length()-1, inputBuf.length());
		   if(inputBuf.length()==0) inputBuf.append("0");
		   inputL.setText(inputBuf+"");
	   
	   }else if(pushB=="C") {
		   dispBuf.delete(0, dispBuf.length());
		   inputBuf.delete(0, inputBuf.length());
		   inputBuf.append("0");
		   
		   dispL.setText("");
		   inputL.setText("0");
		   
		   result=0;
		   op=0;
		   opCheck=false;
	   
	   }else if(pushB==".") {
		   if(inputBuf.indexOf(".")==-1) inputBuf.append(".");
		   inputL.setText(inputBuf+"");
	   
	   }else if(pushB=="+") {
		   if(!opCheck) {
			   calc(); //계산
			   
			   dispBuf.append(inputBuf+" + ");
			   op = '+';
			   
			   dispL.setText(dispBuf+"");
			   inputL.setText(df.format(result));
			   inputBuf.delete(0, inputBuf.length());
			   
		   	   opCheck = true;
		   }
	   }else if(pushB=="-") {
		   if(!opCheck) {
			   calc(); //계산
			   
			   dispBuf.append(inputBuf+" - ");
			   op = '-';
			   
			   dispL.setText(dispBuf+"");
			   inputL.setText(df.format(result));
			   inputBuf.delete(0, inputBuf.length());
			   
		   	   opCheck = true;
		   }
		   
	   }else if(pushB=="*") {
		   if(!opCheck) {
			   calc(); //계산
			   
			   dispBuf.append(inputBuf+" * ");
			   op = '*';
			   
			   dispL.setText(dispBuf+"");
			   inputL.setText(df.format(result));
			   inputBuf.delete(0, inputBuf.length());
			   
		   	   opCheck = true;
		   }
		   
	   }else if(pushB=="/") {
		   if(!opCheck) {
			   calc(); //계산
			   
			   dispBuf.append(inputBuf+" / ");
			   op = '/';
			   
			   dispL.setText(dispBuf+"");
			   inputL.setText(df.format(result));
			   inputBuf.delete(0, inputBuf.length());
			   
		   	   opCheck = true;
		   }
		   
	   }else if(pushB=="=") {
		   if(!opCheck) {
			   calc(); //계산
			   
			   dispBuf.append(inputBuf+" = ");
			   
			   dispL.setText(dispBuf+"");
			   inputL.setText(df.format(result));
			   
			   dispBuf.delete(0, dispBuf.length());
			   inputBuf.delete(0, inputBuf.length());
			   
			   op=0;
			   opCheck=false;
		   }
	   }
   }
   
   public void calc() {
	   if(op==0) result = Double.parseDouble(inputBuf+"");
	   else if(op=='+') result += Double.parseDouble(inputBuf+"");
	   else if(op=='-') result -= Double.parseDouble(inputBuf+"");
	   else if(op=='*') result *= Double.parseDouble(inputBuf+"");
	   else if(op=='/') result /= Double.parseDouble(inputBuf+"");
   }
   
   public static void main(String[] args) {
      new CalculatorMain_t2();
   }
}











