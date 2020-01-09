package day01;
// 다양한 콘솔 출력 방법
//콘솔 출력은 3가지 방법으로 하게 된다.
//1. print -> 괄호안의 내용을 출력한다.
//2. println -> 괄호안의 내용을 출력하고 줄을 바꾼다.
//3. printf -> 괄호안의 내용을 형식에 맞춰서 출력한다.
public class Ex08 {
	public static void main(String[]args) {
		//1. print
		System.out.println("----print()----");
		System.out.print("abc");
		System.out.print("def");
		
		//2. println -> "print a line"
		System.out.println("----println()----");
		System.out.println("abc");
		System.out.println("def");
		
		//3. printf -> "print in format"
		//printf는 우리가 원하는 내용을 %문자에 할당해서 출력하게 된다.
		//%문자에 우리가 원하는 형식을 입력해서 
		//형식을 맞출 수 있다.
		System.out.printf("%5s %5s","abc","def");
		
	}
}
