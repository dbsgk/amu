package nested;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain1 extends JFrame implements ActionListener{
	private JLabel dispL, inputL;   
	private JButton[] button;   
	StringBuffer sb = new StringBuffer();
	StringBuffer arsb = new StringBuffer();
	
	
	public CalculatorMain1() {
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
    		            "4","5","6","x",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
      }
      
      button[0].setBounds(9,130,185,50);// ←
      button[1].setBounds(199,130,185,50);// C
      
      button[2].setBounds(9,190,90,50);//7
      button[3].setBounds(104,190,90,50);//8
      button[4].setBounds(199,190,90,50);//9
      button[5].setBounds(294,190,90,50);// 나누기
      
      button[6].setBounds(9,250,90,50);//4
      button[7].setBounds(104,250,90,50);//5
      button[8].setBounds(199,250,90,50);//6
      button[9].setBounds(294,250,90,50);//*
      
      button[10].setBounds(9,310,90,50);//1
      button[11].setBounds(104,310,90,50);//2
      button[12].setBounds(199,310,90,50);//3
      button[13].setBounds(294,310,90,50);//-
      
      button[14].setBounds(9,370,90,50);//.
      button[15].setBounds(104,370,90,50);//0
      button[16].setBounds(199,370,90,50);//=
      button[17].setBounds(294,370,90,50);//+
      
      add(dispL);
      add(inputL);
      for(int i=0; i<button.length; i++) {
    	  add(button[i]);
      }
      for(int i=0; i<button.length; i++) {
    	  button[i].addActionListener(this);  
      }
      
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
      
      
   }

   public static void main(String[] args) {
      new CalculatorMain1();
   }
//
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==button[1]) {
			 dispL.setText("");
			 arsb.delete(0, arsb.length());
		 }
		if(e.getSource()==button[15]) {
			if(sb.length()==0) {
				inputL.setText("0");
			}else {
				sb.append("0");
			inputL.setText(sb.toString());
			}
		} else if(e.getSource()==button[10]) {
			sb.append("1");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[11]) {
			sb.append("2");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[12]) {
			sb.append("3");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[6]) {
			sb.append("4");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[7]) {
			sb.append("5");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[8]) {
			sb.append("6");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[2]) {
			sb.append("7");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[3]) {
			sb.append("8");
			inputL.setText(sb.toString()); 
		} else if(e.getSource()==button[4]) {
			sb.append("9");
			inputL.setText(sb.toString()); 
		}  else if(e.getSource()==button[5]) {
			sb.append("/");
			arsb.append(sb.toString());
			inputL.setText(sb.toString());
			
			dispL.setText(arsb.toString());
			sb.delete(0,sb.length());
			inputL.setText("0");
			
		} else if(e.getSource()==button[9]) {
			sb.append("x");
			arsb.append(sb.toString());
			inputL.setText(sb.toString());
			
			dispL.setText(arsb.toString());
			sb.delete(0,sb.length());
			inputL.setText("0");
			
			
			
		} else if(e.getSource()==button[13]) {
			sb.append("-");
			arsb.append(sb.toString());
			inputL.setText(sb.toString());
			
			dispL.setText(arsb.toString());
			sb.delete(0,sb.length());
			inputL.setText("0");
			
		} else if(e.getSource()==button[14]) {
			
			if(sb.toString().indexOf(".")==-1) {
				if(sb.length()==0) {
					sb.append("0");
				}sb.append(".");
			}
			inputL.setText(sb.toString());
			
		} else if(e.getSource()==button[16]) { 
			sb.append("=");
			arsb.append(sb.toString());
			inputL.setText(sb.toString());
			
			dispL.setText(arsb.toString());
			sb.delete(0,sb.length());
			inputL.setText("0");
			
		} else if(e.getSource()==button[17]) {
			sb.append("+");
			arsb.append(sb.toString());
			inputL.setText(sb.toString());
			
			dispL.setText(arsb.toString());
			sb.delete(0,sb.length());
			inputL.setText("0");
		}
		else if(e.getSource()==button[1]) {
			if(sb.length()==0) {
				inputL.setText("0");
			}else {
				sb.delete(0, sb.length());
			}inputL.setText("0");
			
		}
		else if(e.getSource()==button[0]) {
			if(sb.length()==1) {
				inputL.setText("0");
			}else {
			if(sb.length() != 0 ) {
				sb.delete(sb.length()-1, sb.length());
			}
			inputL.setText(sb.toString());
			}
			//String b = inputL.getText().substring(0, t - 1);
			
			}
		}
}











