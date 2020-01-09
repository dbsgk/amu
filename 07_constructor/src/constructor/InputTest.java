package constructor;

import java.util.Scanner;

public class InputTest {
	private int a ;
	private double b;
	
	public InputTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		System.out.print("실수 입력: ");
		b = sc.nextDouble();
	}//생성자
	public void display() {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner();다른 생성자처럼 기본생성자를 쓰면 error뜸. 이건 입력하는 애라 받는게 있어야함.
		InputTest it = new InputTest();
		it.display();
	}//main

}//class
