package day02;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 e = new Ex11(); 
		//상속을 하면 부모클래스 자리 먼저 만들고 그다음에 자식클래스 메소드 덧붙임.
		//이름,나이,주민번호 등 공통된 특성을 묶어서 코딩을 조금이라도 적게하려는게 목적
		e.showMessage();
	}
}
