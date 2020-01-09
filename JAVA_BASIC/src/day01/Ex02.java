package day01;
//변수와 상수 만들어보기
public class Ex02 {
	public static void main(String[] args) {
		//변수 선언하기
		//데이터타입 변수명
		int myNumber;
		//변수에 값을 넣을때에는
		//변수명 = 값;
		myNumber= 10;
		System.out.println(myNumber);
		myNumber = 25;
		System.out.println(myNumber);
		
		//상수 선언하기
		//final 데이터타입 상수명
		final int MY_NUMBER;
		MY_NUMBER = 10;
		System.out.println(MY_NUMBER);
		//상수는 한번 값을 넣으면 그 값이 고정이 되기 때문에
		// 새로운 값을 할당해 줄 수 없다.
		//MY_NUMBER = 25; 따라서 이 코드는 에러가 난다.
		
		
		
	}
}
