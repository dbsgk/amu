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
<<<<<<< HEAD
//radiobutton�� �⺻�� �簢��
//���� ���� �����ϸ� �ڵ����� �簢�� �����ȴ�
//Canvas�� �⺻���� ����������� �Ѵ�
// x1T, y1T, x2T, y2T �̰��� ��ǥ�� �Է��ϸ� ���ϴ� �������� ĵ������ �׷�����.
//�ձٻ簢���Ҷ��� ���� 50,50�� �־�� �׷��� ���� ���η�����.
//���࿡ x1T, y1T, x2T, y2T(100,100,200,200)
//���̸� �밢��
//�簢���̸� x
//�̺�Ʈ �巡�״� ���̶� �սô�.
//������ �����Ѵ�.
=======
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
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0
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
<<<<<<< HEAD
	public JRadioButton drawType;
	public int count = 0;
// GraphicsContext gc;
=======
	// GraphicsContext gc;
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

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

<<<<<<< HEAD
		vX1 = new Vector<Integer>();
		vY1 = new Vector<Integer>();
		vX2 = new Vector<Integer>();
		vY2 = new Vector<Integer>();
		vZ1 = new Vector<Integer>();
		vZ2 = new Vector<Integer>();
		fill = new JCheckBox("ä���", false);

		line = new JRadioButton("��", false);
		circle = new JRadioButton("��", false);
		rect = new JRadioButton("�簢��", true);
		roundRect = new JRadioButton("�ձٻ簢��", false);
		drawType = new JRadioButton();

		Vector<String> vColor = new Vector<String>();
		vColor.add("����");
		vColor.add("�ʷ�");
		vColor.add("�Ķ�");
		vColor.add("����");
		vColor.add("�ϴ�");
		combo = new JComboBox<String>(vColor);

		draw = new JButton("�׸���");
=======
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
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0
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
<<<<<<< HEAD
		p1.add(fill = new JCheckBox("ä���"));
=======
		p1.add(fill = new JCheckBox("채우기"));
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

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
<<<<<<< HEAD
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
		MsPaint msp = new MsPaint("�̴� �׸���");

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

			if (combo.getSelectedItem().equals("����"))
				col = Color.RED;
			else if (combo.getSelectedItem().equals("�ʷ�"))
				col = Color.GREEN;
			else if (combo.getSelectedItem().equals("�Ķ�"))
				col = Color.BLUE;
			else if (combo.getSelectedItem().equals("����"))
				col = Color.MAGENTA;
			else if (combo.getSelectedItem().equals("�ϴ�"))
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
=======

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

>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0
	}

	public JCheckBox getFill() {
		return fill;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mouseEntered(MouseEvent e) {
<<<<<<< HEAD
// TODO Auto-generated method stub
=======
		// TODO Auto-generated method stub
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mouseExited(MouseEvent e) {
<<<<<<< HEAD
// TODO Auto-generated method stub
=======
		// TODO Auto-generated method stub
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mousePressed(MouseEvent e) {
<<<<<<< HEAD
// TODO Auto-generated method stub
=======
		// TODO Auto-generated method stub
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mouseReleased(MouseEvent e) {
<<<<<<< HEAD
// TODO Auto-generated method stub
=======
		// TODO Auto-generated method stub
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mouseDragged(MouseEvent e) {

<<<<<<< HEAD
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
=======
		Graphics g = getGraphics();

		g.setColor(Color.red);

		// get X and y position
		int x, y;
		x = e.getX();
		y = e.getY();

		// draw a Oval at the point where mouse is moved
		g.fillOval(x, y, 5, 5);
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0

	}

	@Override
	public void mouseMoved(MouseEvent e) {
<<<<<<< HEAD
// TODO Auto-generated method stub

	}

}
=======
		// TODO Auto-generated method stub

	}

}
>>>>>>> b4bee12b80c4fe185cc0d6ae3520313a825dd6b0
