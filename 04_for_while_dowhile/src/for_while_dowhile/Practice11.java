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
public class Practice11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("가위(1),바위(2),보(3) 중 번호 입력 : ");
		for(int i =0; i<100;){
			int user = Integer.parseInt(br.readLine());
			int com = (int)(Math.random()*3)+1;
			int comme = com-user; 
		String comS = null,userS = null;
		switch(user) {
		case 1 : userS="가위";break;
		case 2 : userS="바위";break;
		case 3 : userS="보자기";break;
		default:
		}
		switch(com) {
		case 1 : comS="가위";break;
		case 2 : comS="바위";break;
		case 3 : comS="보자기";break;
		default:
		}
		
		System.out.println("컴퓨터 : "+comS+" 나 : "+userS);

		switch(comme) {
		case 1: case -2: 
			System.out.println("You Lose!!");break;
		case -1: case 2:
			System.out.println("You Win!!");break;
		case 0:
			System.out.println("You Draw!!");break;
		}
		System.out.print("또 할래(Y/N) : ");
		String yn = br.readLine();
		if(yn.equalsIgnoreCase("N")) {System.out.println("프로그램을 종료합니다.");break;
		}else if(yn.equalsIgnoreCase("Y")) {
			System.out.println("가위(1),바위(2),보(3) 중 번호 입력 : ");
		}
	}
		
	}

}
