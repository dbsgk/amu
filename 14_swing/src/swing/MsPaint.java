package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

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

public class MsPaint extends JFrame implements ActionListener, MouseListener, MouseMotionListener, ItemListener {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	public Color col = Color.BLACK;
	public int x1, x2, y1, y2, z1, z2;
	// GraphicsContext gc;

	public MsPaint() {
	}

	public MsPaint(String title) {

		x1L = new JLabel("x1");
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");

		x1T = new JTextField();
		y1T = new JTextField();
		x2T = new JTextField();
		y2T = new JTextField();
		z1T = new JTextField();
		z2T = new JTextField();

		fill = new JCheckBox("채우기", false);
		line = new JRadioButton("선", false);
		circle = new JRadioButton("원", false);
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근사각형", false);

		Vector<String> v = new Vector<String>();
		v.add("빨강");
		v.add("초록");
		v.add("파랑");
		v.add("보라");
		v.add("하늘");
		combo = new JComboBox<String>(v);

		draw = new JButton("그리기");
		can = new DrCanvas(this);

		Panel p1 = new Panel(new GridLayout(1, 13, 0, 10));
		p1.add(x1L = new JLabel("x1", JLabel.CENTER));
		p1.add(x1T = new JTextField(JTextField.CENTER));
		p1.add(y1L = new JLabel("y1", JLabel.CENTER));
		p1.add(y1T = new JTextField(JTextField.CENTER));
		p1.add(x2L = new JLabel("x2", JLabel.CENTER));
		p1.add(x2T = new JTextField(JTextField.CENTER));
		p1.add(y2L = new JLabel("y2", JLabel.CENTER));
		p1.add(y2T = new JTextField(JTextField.CENTER));
		p1.add(z1L = new JLabel("z1", JLabel.CENTER));
		p1.add(z1T = new JTextField(JTextField.CENTER));
		p1.add(z2L = new JLabel("z2", JLabel.CENTER));
		p1.add(z2T = new JTextField(JTextField.CENTER));
		p1.add(fill = new JCheckBox("채우기"));

		Panel p2 = new Panel(new GridLayout(1, 6, 10, 10));
		p2.add(line);
		p2.add(circle);
		p2.add(rect);
		p2.add(roundRect);
		p2.add(combo);
		p2.add(draw);

		Container con = getContentPane();
		con.add("North", p1);
		con.add("Center", can);
		con.add("South", p2);

		col = Color.BLACK;
		setForeground(col);

		setBounds(600, 100, 800, 500);
		setTitle(title);
		setVisible(true);

		combo.addActionListener(this);
		draw.addActionListener(this);
		fill.addItemListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MsPaint msp = new MsPaint("미니 그림판");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == draw) {
			x1 = Integer.parseInt(x1T.getText());
			y1 = Integer.parseInt(y1T.getText());
			x2 = Integer.parseInt(x2T.getText());
			y2 = Integer.parseInt(y2T.getText());
			// z1 = Integer.parseInt(z1T.getText());
			// z2 = Integer.parseInt(z2T.getText());
		} else if (e.getSource() == combo) {
			if (combo.getSelectedItem().equals("빨강"))
				col = Color.RED;
			else if (combo.getSelectedItem().equals("초록"))
				col = Color.GREEN;
			else if (combo.getSelectedItem().equals("파랑"))
				col = Color.BLUE;
			else if (combo.getSelectedItem().equals("보라"))
				col = Color.MAGENTA;
			else if (combo.getSelectedItem().equals("하늘"))
				col = Color.CYAN;
			// System.out.println(e.getSource().toString());
			// if()
		}

	}

	public JCheckBox getFill() {
		return fill;
	}

	public JRadioButton getLine() {
		return line;
	}

	public JRadioButton getCircle() {
		return circle;
	}

	public JRadioButton getRect() {
		return rect;
	}

	public JRadioButton getRoundRect() {
		return roundRect;
	}

	public JComboBox getCombo() {
		return combo;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println(fill);
		} else {
			System.out.println(fill);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();

		g.setColor(Color.red);

		// get X and y position
		int x, y;
		// x1 = e.getX();
		// y1 = e.getY();

		// draw a Oval at the point
		// where mouse is moved
		// g.fillOval(x1, y1, 5, 5);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {

		Graphics g = getGraphics();

		g.setColor(Color.red);

		// get X and y position
		int x, y;
		x = e.getX();
		y = e.getY();

		// draw a Oval at the point where mouse is moved
		g.fillOval(x, y, 5, 5);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
