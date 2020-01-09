package inheritance;
//배경색 설정 : setBackground
//사이즈 설정 
//크기설정
//타이틀설정
//보이게 설정
//
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class WindowTest extends Frame {
	public WindowTest() {
		//setBackground(Color.CYAN);//color 사용하려면 클래스명도 붙여줘야함. Color.cyan
	    //new Frame("내가 만든 윈도우").setVisible(true);
	    super("내가 만든 윈도우");//부모 생성자 호출
	    setForeground(Color.yellow);
		setBackground(new Color(17,45,255));//Color클래스의 생성자를 호출해서 색꺼내기
		//this.setSize(300,400);
		setBounds(700,200,300,400);//(왼쪽, 위, 아래 , 오른쪽)
		setVisible(true);//보여주세요, false 감춰주세요
		
	}

	
	public static void main(String[] args) {
		new WindowTest();
		
	}//main

	@Override
	public void paint(Graphics g) {//Call back method: 콜백메소드;일정시점이 되면 뒤에서 JVM이 알아서 호출하는.
		//, repaint() - 프레임 다시만들기...?
		//super.paint(g); 부모부르라는 말임
		g.drawLine(100, 100, 200, 200);g.drawLine(200, 100, 100, 200);
		g.drawRect(75, 75, 150, 150);
		g.drawOval(75, 75, 150, 150);
	}

}//class
