package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_t {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn;
		int com[] = new int[3];
		int user[] = new int[3];
		int strike;
		int ball;
		String inputStr;
		do {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			yn = br.readLine();
		}	while(!yn.equals("y")&&!yn.equals("Y")&&!yn.equals("n")&&!yn.equals("N"));
		
		//y면실행
		if(yn.equals("y")||yn.equals("Y")) {
		
		System.out.println();
		System.out.println("게임을 시작합니다.");
		
		//난수발생
		for(int i=0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9+1);
			//중복
			//난수 생성 후, 0번은 비교할 대상 없음
			//1번은 0번이랑 비교
			//2번은 0번,1번이랑 비교
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}//중복for문
		}//난수발생for문
		
		System.out.println(com[0]+", "+com[1]+", "+com[2]);
			while(true) {
				//입력
				System.out.println();
				System.out.print("숫자입력 : ");
				inputStr = br.readLine();
				for(int i=0;i<user.length;i++) {
					user[i]= inputStr.charAt(i)-48;
				}
				//System.out.println(user[0]+", "+user[1]+", "+user[2]); //입력받은 값을 제대로 뽑아냈나 확인.
				
				strike= ball=0;//스트라이크,볼 초기화
				for(int i=0;i<com.length;i++) {
					for(int j=0; j<user.length;j++ ) {
						if(com[i]==user[j]) {
							if(i==j)strike++;
							else ball++;
						}
					}//안for
				}//밖for
				System.out.println(strike+"스트라이크 "+ball+"볼");
				if(strike==3)break;
			}//while
		}//if y아니면 종료
		System.out.println("프로그램을 종료합니다."); 
		
	}//main

}//class
