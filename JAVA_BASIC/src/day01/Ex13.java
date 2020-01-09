package day01;
//사용자로부터 연도를 입력받아서
//윤년인지 평년인지 출력하는 프로그램을 만들어주세요.
//윤년은 4로 나눠떨어지고 100으로 안나눠떨어지고 400으로 나눠떨어지고
// 4-> 윤년
// 100 -> 평년
// 400 -> 윤년
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도입력 ㄱㄱ");
		int year = scan.nextInt();
		//1번조건: 4로 떨어지면서 100으로 안나눠떨어지면
		//2번조건: 400으로 나눠떨어지면
		if(year%4 == 0 && year%100!=0 || year %400 ==0) {
			System.out.println("윤년입니다.");
		}else{
			System.out.println("평년입니다.");
		}
		scan.close();
	}
}
