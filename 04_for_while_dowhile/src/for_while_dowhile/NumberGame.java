package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*숫자맞추기게임(while문)
1~100사이의 난수를 발생하여 맞추는 게임
[실행결과]
숫자입력:50
50보다 큽니다
숫자입력: 90
90보다 작습니다.
...
숫자입력: 87
딩동댕 xx번만에 맞추셨습니다.

*/
public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;
		int count = 0;
//		while (com != user) {
//			System.out.println("숫자입력: ");
//			user = Integer.parseInt(br.readLine());
//			count++;
//			if (com > user) {
//				System.out.println(user + "보다 큽니다.");
//			} else if (com < user) {
//				System.out.println(user + "보다 작습니다.");
//			} else if (com == user) {
//				System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.");
//				break;
//			}
//			System.out.println();
//		}//while (이렇게 끝나는 부분에 주석써주면 가독성이 좋아진다; 남들이 내 코드봤을떄 이해하기 편하게끔)
		int coin = 1;
		while (coin != 0) {
			com = (int) (Math.random() * 100) + 1;
			user = 0;
			count = 0;
			do {
				System.out.println(com);
				System.out.println("숫자입력: ");
				user = Integer.parseInt(br.readLine());
				count++;
				if (com > user) {
					System.out.println(user + "보다 큽니다.");
				} else if (com < user) {
					System.out.println(user + "보다 작습니다.");
				} else if (com == user) {
					System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.");
					break;
				}
				System.out.println();

			} while (com != user);
			
			coin = 0;
			System.out.print("또 할래?(Y/N) : ");
			String yn = br.readLine();
			if (yn.equalsIgnoreCase("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (yn.equalsIgnoreCase("Y")) {
				coin++;
			} else {System.out.println("잘못입력하셨습니다.");}
				 
		}//전체감싸는 while 끝
	}
}