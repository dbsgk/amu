package nested;
//18개버튼 배열
//라벨 맨위에 2개
//frame크기는 알아서
//이름 계산기, x버튼 
//1. 계산기 창크기 고정
//2. 첫줄은 더해지는 수식 뜨고
//	 두번째줄은 합이 뜸
//3. 라벨의 색은 흰색
//if,for문만 사용.
//=하면 계산식
//기본숫자 0으로....
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Card {
	private Frame frame;
	private CardLayout card;
	
	public Card() {
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);
		
		String[] title = {"빨강","초록","파랑","노랑","보라","하늘"};
		Color[] color = {Color.red,Color.green,Color.blue,Color.yellow,Color.MAGENTA,Color.cyan };
		Panel[] p = new Panel[6];
		for(int i=0;i<p.length;i++) {
			p[i]= new Panel();
			p[i].setBackground(color[i]);
			frame.add(p[i],title[i]);
			
			//이벤트
			p[i].addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					//card.next(frame); //누를때마다 순서대로 다음카드 나옴
					card.show(frame, "노랑"); //클릭하면 특정한 카드 나옴
				}
				
			});
		}
		
		frame.setBounds(400,600,300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Card();
	}
}
