package day01;
//switch문 사용하는건 error페이지 (404에러뜨면 특정 페이지를 리다이렉트 해줄때)
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//사용자로부터 월을 입력받아서
		//해당 월이 몇일까지 있는지 보여주는 프로그램
		System.out.println("월을 입력하세요: ");
		int month = scan.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 입니다.");
			break;
		case 2:
			System.out.println("28일까지입니다.");
			break;
		}
		scan.close();
	}
}
