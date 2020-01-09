package day01;
//조건문 02 - 다중 if문
//if문 안에 if문이 들어갈 수 있다.

public class Ex12 {
	public static void main(String[] args) {
		int age = 70;
		if(age>18) {
			if(age > 60) {
				System.out.println("투표가 가능한 어르신 입니다.");
			}else {
				System.out.println("투표가 가능한 성인입니다.");
			}
		}
		//또한 조건식안에 논리연산자를 사용하여 복합적인 조건을 쓸 수 있다.
		int score = 78;
		if(score >= 70 && score <80) {
			System.out.println("C입니다.");
		}
	}
}
