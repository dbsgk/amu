package swing;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		new MsPaint("�̴� �׸���");
	}
}
