package day02;
//사용자로부터 입력을 받아서
//1부터 해당 숫자까지의 시그마를 보여주는 프로그램 작성
//시그마? 시작지점부터 끝지점까지의 합
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력ㄱㄱ");
		int num	= scan.nextInt();
		int sigma = 0;
		
		for(int i=1;i<=num; i++){
			sigma +=i;
		}
		System.out.println("합 :"+sigma);
		scan.close();
	}
}
