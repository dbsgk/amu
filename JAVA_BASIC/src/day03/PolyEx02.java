package day03;
//여기는 가져다 씀.
import java.sql.Connection;

//인터페이스 상속과 의존성 주입(Defendency Injection)
//다형성을 이렇게 쓰면 좀 편해진다!

//이번 예제는 Database와 통신을 하는 클래스를 만들어서
//그 클래스를 좀 특정 데이터베이스와 의존적인 관계가 아니게 만드는 예제
public class PolyEx02 {
	Connection conn;//이제 얘가 갖고있는거
	public PolyEx02(ConnectionMake c) {
		conn = c.makeConnection();
	}
	
	public static void main(String[] args) {
		//드디어 다형성!
		//인터페이스 객체는 상속받는 자식 클래스의 생성자로 초기화가 가능하다.
		ConnectionMake c = new MySqlConnectionMaker();
		//ConnectionMake c = new OracleConnectionMaker();하면 바로 오라클로 연결됨
		//같은 인터페이스 상속받은거라서 
		//인터페이스라서 자식클래스의 클래스의 생성자로 만들수 있음.
		PolyEx02 p = new PolyEx02(c);
	}
	
}
