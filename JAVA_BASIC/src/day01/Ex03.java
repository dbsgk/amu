package day01;
//연산자?
//변수의 값을 토대로 해서 계산을 할때 사용하는 것
//연산자는 산술연산자, 증감연산자, 비교연산자, 논리연산자, 비트연산자 5가지가 있다.

//산술:  더하기	빼기		곱하기	나누기	나머지
//		 +	 	 -		 *		  /		  %
public class Ex03 {
	public static void main(String[] args) {
		//+
		int myNumber1 = 10;
		int myNumber2 = 20;
		System.out.println(myNumber1 + myNumber2);
		//-
		System.out.println(myNumber1 - myNumber2);
		//*
		System.out.println(myNumber1 * myNumber2);
		// /
		System.out.println(myNumber1 / myNumber2);
		//정수 나누기의 경우 몫만 출력. 따라서 10/20은 0나옴.
		
		// %
		System.out.println(myNumber1 % myNumber2);
		//몫이 0이니까 나머지 10 출력됨.
		
		//작은 데이터타입과 더 큰 데이터타입을 연산시키면 어떻게 될까?
		// 작은 데이터가 자동으로 큰 데이터타입으로 변환된다.
		//double myDouble = 20.0;// 0.5정상출력
		//System.out.println(myNumber1/myDouble);
		double myDouble = (double)myNumber1/myNumber2;
		//					int끼리의 연산이 먼저돼서 (double)을 안붙이면
		//					0이 나오고 그걸 myDouble에 넣으니까
		System.out.println(myDouble);//0.0출력
		
		//char는 실제로 숫자값을 가지고 있고 ASCII코드값과 대조해서 
		//해당 숫자값을 찾아서 그 위치에 글자를 출력하게 된다.
		char myChar = (char)('A'+32);
		System.out.println(myChar);
		//char는 글자 하나만 컨트롤 하는데 우리가 글자 하나만 쓰는 일이 없어서
		//여러개 문자를 이어 붙은 문자열 String 클래스를 쓴다.
		String str = "abc"+123;//String에서 +는 앞의 값
		System.out.println(str);
		
		// 해당 변수에 산술연산자를 실행시켜서 그 값을 다시 그 변수에 넣을 때
		myNumber1 = myNumber1+10;
		//myNumber1의 현재 값에 10을 더하고 그 값을 다시 myNumber1에 넣는다.
		myNumber1 += 10; //위의 코드를 줄여서 쓴 것
		System.out.println(myNumber1);
		
	}
}
