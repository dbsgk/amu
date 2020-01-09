package day02;
//클래스 상속
//자바에는 2가지 상속이 있다.
//클래스 상속과 인터페이스 상속이 있는데
//클래스 상속은 코드의 재사용성을 위해서 사용되고
//인터페이스 상속은 다형성을 위해서 사용된다.

//클래스 상속은 extends라는 명령어를 통해서 '
//부모클래스의 필드와 메소드를 자식클래스가 그대로 사용할 수 있게 하는 것을 뜻함.

//상속,다형성(다양한 모양의 성격)
//다양하게 모양을 바꿀수 있게끔
public class Ex10 {
	String str;
	public Ex10() {
		System.out.println("부모클래스 생성자 호출!");
	}
	public void showMessage() {
		System.out.println("부모클래스의 showMessage() 메소드 입니다.");
	}
}
