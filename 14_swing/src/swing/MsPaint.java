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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint extends JFrame implements ActionListener, MouseListener, MouseMotionListener, ItemListener {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private Vector<Integer> vX1, vY1, vX2, vY2, vZ1, vZ2;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	public Color col = Color.BLACK;
	public int x1, x2, y1, y2, z1, z2;

	public JRadioButton drawType;
	public int count = 0;
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


		vX1 = new Vector<Integer>();
		vY1 = new Vector<Integer>();
		vX2 = new Vector<Integer>();
		vY2 = new Vector<Integer>();
		vZ1 = new Vector<Integer>();
		vZ2 = new Vector<Integer>();
		fill = new JCheckBox("채우기", false);

		line = new JRadioButton("선", false);
		circle = new JRadioButton("원", false);
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근사각형", false);
		drawType = new JRadioButton();

		Vector<String> vColor = new Vector<String>();
		vColor.add("빨강");
		vColor.add("초록");
		vColor.add("파랑");
		vColor.add("보라");
		vColor.add("하늘");
		combo = new JComboBox<String>(vColor);

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
		line.addActionListener(this);
		circle.addActionListener(this);
		rect.addActionListener(this);
		roundRect.addActionListener(this);
		drawType.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MsPaint msp = new MsPaint("미니 그림판");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == line) {
			circle.setSelected(false);
			rect.setSelected(false);
			roundRect.setSelected(false);
		}
		if (e.getSource() == circle) {
			line.setSelected(false);
			rect.setSelected(false);
			roundRect.setSelected(false);
		}
		if (e.getSource() == rect) {
			line.setSelected(false);
			circle.setSelected(false);
			roundRect.setSelected(false);
		}
		if (e.getSource() == roundRect) {
			line.setSelected(false);
			rect.setSelected(false);
			circle.setSelected(false);
		}
		if (e.getSource() == draw) {
			if (!x1T.getText().equals(""))
//				vX1.add(count, Integer.parseInt(x1T.getText()));
				x1 = Integer.parseInt(x1T.getText());
			if (!y1T.getText().equals(""))
//				vY1.add(count, Integer.parseInt(y1T.getText()));
				y1 = Integer.parseInt(y1T.getText());
			if (!x2T.getText().equals(""))
//				vX2.add(count, Integer.parseInt(x2T.getText()));
				x2 = Integer.parseInt(x2T.getText());
			if (!y2T.getText().equals(""))
//				vY2.add(count, Integer.parseInt(y2T.getText()));
				y2 = Integer.parseInt(y2T.getText());
			if (!z1T.getText().equals(""))
//				vZ1.add(count, Integer.parseInt(z1T.getText()));
				z1 = Integer.parseInt(z1T.getText());
			if (!z2T.getText().equals(""))
//				vZ2.add(count, Integer.parseInt(z2T.getText()));
				z2 = Integer.parseInt(z2T.getText());

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

			if (line.isSelected())
				drawType = line;
			else if (circle.isSelected())
				drawType = circle;
			else if (rect.isSelected())
				drawType = rect;
			else if (roundRect.isSelected())
				drawType = roundRect;
			count++;
		}
// System.out.println(e.getSource().toString());
// if()

	}

	public JCheckBox getFill() {
		return fill;
	}


	public JRadioButton getDrawType() {
		return drawType;
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
// Graphics g = getGraphics();
//
// g.setColor(Color.red);
//
// // get X and y position
// int x, y;
// // x1 = e.getX();
// // y1 = e.getY();
//
// // draw a Oval at the point
// // where mouse is moved
// // g.fillOval(x1, y1, 5, 5);


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

// Graphics g = getGraphics();
//
// g.setColor(Color.red);
//
// // get X and y position
// int x, y;
// x = e.getX();
// y = e.getY();
//
// // draw a Oval at the point where mouse is moved
// g.fillOval(x, y, 5, 5);


	}

	@Override
	public void mouseMoved(MouseEvent e) {

// TODO Auto-generated method stub

	}

}

