package day01;
//논리 연산자
//&&, ||
// 논리연산자는 2개의 boolean을 연산해서
// boolean 도출해냄.
// AND, OR, 부정 (3가지)가 있다
public class Ex06 {
	public static void main(String[]args) {
		
		boolean isTrue = true;
		boolean isFalse = false;
		// 아래의방식대로 2개의 boolean 타입변수에 대한 연산가능
		System.out.println(isTrue && isFalse);
		//하지만 더 많이 쓰이는 방법은 비교연산자나 return타입이 boolean인
		//메소드를 호출해서 사용되는걸 더 많이 씀
		String str  = "abc";
		System.out.println(str.equals("abc")&&str.equals("bcd"));
		
		//논리 연산자 3가지 종류
		//1. AND 연산(2개가 true 일때만 true가 나온다)
		//2. OR연산(2개중 1개가 true여도 true가 나온다)
		//3. !연산 ( true는 false로 false는 true로)
		
		//1. AND연산 (&&)
		// shift + 숫자7 -> &
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false &&false);//false
		
		//2. OR연산(||)
		//shift + 원화표시-> |
		System.out.println(true || true);//t
		System.out.println(true || false);//t
		System.out.println(false || false);//f
		
		//3. 부정연산(!)
		System.out.println(!true);//f
		System.out.println(!false);//t
		
	}
	
}