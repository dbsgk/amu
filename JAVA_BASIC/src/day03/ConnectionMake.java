package day03;
//여기는 선언만
//인터페이스는 실질적으로 이 안에는
//이 인터페이스를 상속받는 클래스들이
//구현해야할 메소드들을 "선언"만 하게 된다.

import java.sql.Connection;

//즉 일종의 행동 규범으로써 만약 상속받는 클래스들이
//이 인터페이스가 선언한 메소드들을 구현하지 않으면
//에러가 나게 되는 것이다!

public interface ConnectionMake {
	//메소드를 선언만!
	public Connection makeConnection();//메소드랑 파라미터랑 Connection객체를 리턴해줌.
}
