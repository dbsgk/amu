package day01;
//조건문01 - if문
//if문은 괄호안에 조건식을 적어주고
//해당 조건식이 true가 나오면 실행
//false가 나오면 실행하지 않음

public class Ex11 {
	public static void main(String[]args) {
		int age = 18;
		//코드 블락이란 {} 안 전체 내용을 뜻한다.
		if(age >= 18) {
			System.out.println("성년입니다.");
		} else if(age >= 13) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
	}
}
