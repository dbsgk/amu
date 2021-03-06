package abstract_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame{
	public WindowTest(){
		setBounds(900, 200, 300, 400);
		setVisible(true);
	}
/*	기본생성자{
		창크기: 300,400
		보이기
		위치(50,80 여기에 "이미지"라고보이게 하기)
		*/
	@Override
	public void paint(Graphics g) {//Call back method: 콜백메소드;일정시점이 되면 뒤에서 JVM이 알아서 호출하는.
		//이미지 불러오기
		Toolkit t = Toolkit.getDefaultToolkit(); //생성
		//Image img = t.getImage("img.jpg");D:\java_se\workspace\09_abstract\img.jpg
		Image img = t.getImage("D:\\java_se\\workspace\\09_abstract\\img.jpg");
		//이미지 그리기
		
		g.drawImage(img, 20, 100, this);
	}
	public static void main(String[] args) {
		WindowTest w = new WindowTest();
		
	}
}
