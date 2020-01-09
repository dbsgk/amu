package day03;
//진짜 코드만드는건 여기
import java.sql.Connection;

//인터페이스 상속은 extends가 아닌 implements라는 명령어로 이뤄지게 된다.
//오류나면 add unimplement method클릭
public class MySqlConnectionMaker implements ConnectionMake{

	@Override
	public Connection makeConnection() {
		// MySql과 통신을 시작하는 코드가 여기로 들어가게 된다!
		//PolyEx.java에 insert에 있는 Connection 객체를 생성하는 코드를 여기에 넣는다!
		System.out.println("대충 MySql이랑 연결함");
		return null;
	}

}
