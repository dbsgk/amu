package day01;
//예제 : 사용자로부터 이름, 나이, 국영수 점수, 총점, 평균점수를 입력받아서
//이름은 5자리
//나이는 3자리
//점수는 4자리로 출력
//나이와 점수는 앞에 빈자리는 0으로 채우세요.
//평균점수는 소수점2번째 자리까지 출력하게 만드세요.
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력하세요");
		String name = scan.nextLine();
		System.out.print("나이입력하세요");
		int age	= scan.nextInt();
		System.out.print("국어점수 입력하세요");
		int kor = scan.nextInt();
		System.out.print("영어점수 입력하세요");
		int eng = scan.nextInt();
		System.out.print("수학점수 입력하세요");
		int math = scan.nextInt();
		
		System.out.printf("이름 : %5s 나이: %03d 국어: %04d점 영어: %04d점 수학: %04d점 총점: %04d점 평균: %.2f점", name,age,kor,eng,math,kor+eng+math,(kor+eng+math)/3.0);
		scan.close();
	}
}
