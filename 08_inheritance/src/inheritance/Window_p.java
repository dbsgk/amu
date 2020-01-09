package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Window_p extends Frame {
	public Window_p() {
		super("내가 만든 윈도우");//부모 생성자 호출: Frame(String title)
		setBounds(500, 500, 500, 500); //왼쪽여백, 위쪽여백, 가로길이, 세로길이
		setBackground(new Color(17,45,255));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		Window_p w = new Window_p();

	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("D:\\java_se\\workspace\\09_abstract\\img.jpg");
		g.drawImage(img, 20, 100,this);
	}

}
