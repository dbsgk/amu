package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JButtonEx extends JFrame{
	private Icon icon1 = new ImageIcon("image/���丮.jpg");
	private Icon icon2 = new ImageIcon("image/�����ϸ�.jpeg");
	private Icon icon3 = new ImageIcon("image/���ƾ�.jpeg");
	private Icon icon4 = new ImageIcon("image/������.gif");
	private JRadioButton[] jButton = new JRadioButton[4];
	private ButtonGroup bg = new ButtonGroup();

	public JButtonEx() {
		super("Test");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2,2));
		for(int i=0;i<4; i++) {
			jButton[i] = new JRadioButton(i+1+"�� ��ư",icon1);
			con.add((jButton[i]));
			jButton[i].setToolTipText(i+1+"��° ��ư�̴�. ����...");
			jButton[i].setMnemonic(i+49);
			jButton[i].setRolloverIcon(icon2);
			jButton[i].setPressedIcon(icon3);
			jButton[i].setSelectedIcon(icon4);
			bg.add(jButton[i]);
		}
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx();
	}//main
}//public class
