package inheritance;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p;
		System.out.print("인원수 입력: ");
		p = sc.nextInt();
		Exam[] ar= new Exam[p];
		for(int i=0;i<p;i++) {
			ar[i]= new Exam();
		}
		char callOx[] =new char[5];
		System.out.println("이름 1 2 3 4 5\t점수");
		
	}//main
}
/*
[문제1]
* 클래스 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";//정답-상수화

* 메소드
생성자
compare() - 비교
getName()- 이름 리턴
getOx() - ox 리턴
getScore() - 점수 리턴

* 클래스 : ExamMain
메인에서 찍어줌. syso는 쓰면안됨. 데이터 찍어주면 안됨.
입력받는건 생성자에서 ...
출력은 메인.

[실행결과]
인원수 입력 : 3 - main

이름 입력 : 홍길동 -이거 생성자(데이터입력)
답 입력 : 13211

이름 입력 : 코난
답 입력 : 11111

이름 입력 : 또치
답 입력 : 13242

이름	1 2 3 4 5		점수  -데이터 메인에서 찍어줌.
홍길동  	O X X O O	60
코난	O O O O O	100
또치	O X X X X	20


return만 시킴. 

*/
