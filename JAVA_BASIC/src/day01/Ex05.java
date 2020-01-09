package day01;
//비교 연산자
//비교 연산자는 두 값을 비교한다.
// >, >=, <, <=, ==, !=
//만약 비교 결과값이 맞으면 true 틀리면 false가 나온다.
//즉 결과값은 데이터타입이 boolean이다.
public class Ex05 {
	public static void main(String[] args) {
		int myNumber1 = 10;
		int myNumber2 = 20;
		System.out.println(myNumber1 > myNumber2);
		System.out.println(myNumber1 < myNumber2);
		
		myNumber2 = 10;
		//>은 2개의 값이 같으면 false가 나온다.
		System.out.println(myNumber1>myNumber2);
		//>=은 2개의 값이 같을 떄에도 true가 나온다.
		System.out.println(myNumber1>=myNumber2);
		
		//2개의 값이 같은지 비교할때에는 == 사용
		System.out.println(myNumber1==myNumber2);
		
		//2개 값이 다른지 비교할때에는 != 사용
		System.out.println(myNumber1 != myNumber2);
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//String은 클래스(참조형)라서 equals메소드로 값 비교 해줘야 함.
	}
}
