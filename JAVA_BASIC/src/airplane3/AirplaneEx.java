package airplane3;

import java.util.Scanner;

public class AirplaneEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("비행기 예약 프로그램");
			System.out.println("1.로그인 2.회원가입 3.종료");
			int choice = scan.nextInt();
			if(choice==1) {
				//로그인 메서드
				
			}else if(choice==2) {
				//회원가입 메서드
			}else if(choice==3) {
				//종료
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			
		scan.close();
		}//프로그램 while
	}//main
}//class
