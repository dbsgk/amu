package day02;
//반복문2 - while loop
//while loop의 경우에는
//() 안의 조건이 만족하는 동안
//계속 실행되게 된다.
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 5;
		while(i>0) {
			//while문의 경우 명확하게 끝이 있게 디자인하지 않을 경우 무한루프
			System.out.println(i);
			i--;//이게 없으면 무한루프
			
		}
		//하지만 콘솔프로그래밍에서는 일부로 무한 loop만드는 경우가 있다.
		while(true) {
			//무한루프는 조건이 무조건 참이 나오게 하면 됨.
			//ex) 1>0 , true , 1==1
			System.out.println("비트학생 관리 프로그램");
			System.out.println("1. 성적입력 2. 성적출력 3. 종료");
			System.out.print(">");
			int choice = scan.nextInt();
			if(choice==3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}//1,2를 누르면 계속 입력하게 뜨고 3누르면 종료.
			//웹에서는 우리가 요청할때 넘어가니까 콘솔에서만 사용.
		}
		scan.close();
	}
}
