package swing;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JCheckBox;
//radiobutton의 기본은 사각형
//만약 원을 선택하면 자동으로 사각형 해제된다
//Canvas의 기본색은 연보라색으로 한다
// x1T, y1T, x2T, y2T 이곳에 좌표를 입력하면 원하는 도형으로 캔버스에 그려진다.
//둥근사각형할때는 값을 50,50을 넣어라 그래야 각이 구부러진대.
//만약에 x1T, y1T, x2T, y2T(100,100,200,200) 
//선이면 대각선
//사각형이면 x
//이벤트 드래그는 쌤이랑 합시다. 
//다음은 연필한대.
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint extends JFrame{
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	
	public MsPaint() {}
		
	public MsPaint(String title) {
		setTitle(title);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
		g.drawOval(x, y, width, height);
		g.drawRect(x, y, width, height);
		g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
	}
	public static void main(String[] args) {
		new MsPaint("미니 그림판");
	}
}
