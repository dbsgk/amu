package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제1] 가위바위보 게임 - if문

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위	나 : 보자기
You Win!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위	나 : 보자기
You Lose!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
컴퓨터 : 가위	나 : 가위
You Draw!!
또 할래(Y/N) : n
프로그램을 종료합니다


*/
public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
		
		//1가위<2바위<3보
		//내가 보자기 컴퓨터가 바위 내가 이겼어.
		while(true) {
//			String comS = null,meS = null;
			int me = Integer.parseInt(br.readLine()); 
			int com = (int)(Math.random()*3)+1;

			
			if(me==3&&com==1)System.out.println("나 : 보자기	컴퓨터 : 가위 \nYou Lose!!");
			if(me==3&&com==2)System.out.println("나 : 보자기	컴퓨터 : 바위 \nYou Win!!");
			if(me==2&&com==1)System.out.println("나 : 바위	컴퓨터 : 가위 \nYou Win!!");
			if(me==2&&com==3)System.out.println("나 : 바위	컴퓨터 : 보자기 \nYou Lose!!");
			if(me==1&&com==2)System.out.println("나 : 가위	컴퓨터 : 바위 \nYou Lose!!");
			if(me==1&&com==3)System.out.println("나 : 가위	컴퓨터 : 보자기 \nYou Win!!");
			if(me==1&&com==1)System.out.println("나 : 가위	컴퓨터 : 가위 \nYou Draw!!");
			if(me==2&&com==2)System.out.println("나 : 바위	컴퓨터 : 바위 \nYou Draw!!");
			if(me==3&&com==3)System.out.println("나 : 보자기	컴퓨터 : 보자기 \nYou Draw!!");
			//if(me==com)System.out.println("You Draw!!");
			System.out.print("또 할래(Y/N) : ");
			String yn = br.readLine();
			if(yn.equalsIgnoreCase("N")) {System.out.println("프로그램을 종료합니다.");break;
			}else if(yn.equalsIgnoreCase("Y")) {
				System.out.println("가위(1),바위(2),보(3) 중 번호 입력 : ");
			}
		}
		 	}

}
