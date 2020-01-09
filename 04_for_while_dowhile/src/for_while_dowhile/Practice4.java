package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제4] 덧셈 공부
10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임
문제수는 총 5문제를 제공한다
1문제당 점수 20점씩 계산
만약 틀리면 기회를 1번 더 제공한다(기회는 총 두번)

[실행결과]
[1] 25 + 36 = 45
틀렸다
[1] 25 + 36 = 61
딩동뎅

[2] 78 + 10 = 100
틀렸다
[2] 78 + 10 = 95
틀렸다...정답 :
...

당신의 총 x문제를 맞추어서 xx점 입니다

continue(y/n) : w //y,n아닌 다른값넣으면 계속 나옴
continue(y/n) : n
프로그램을 종료합니다
*/
public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn = null;
		//boolean sw =true;
		int count;
		LOOP: while(true) {//프로그램; 문제 처음부터 푸는거(토탈 초기화)
			int munje=0, jumsu=0;
			for(int i=1;i<=5;i++) {//5문제 for(문제값 초기화)
				int a = (int)(Math.random()*90)+10;
				int b = (int)(Math.random()*90)+10;
				while(true){//1문제 내는 while
					System.out.println(a+b);
					System.out.print("["+i+"] "+a+" + "+b+" = ");
					int user = Integer.parseInt(br.readLine());
					if((a+b)==user) {//맞췄을 때
						System.out.println("딩동댕 ");
						munje++;
						jumsu+=20;break;//1문제while탈출; 5문제for+1;
					}else if((a+b)!=user) {//틀렸을 때
						System.out.println("틀렸다");
						System.out.print("["+i+"] "+a+" + "+b+" = ");
						user = Integer.parseInt(br.readLine());
						if((a+b)==user) {
							System.out.print("틀렸다...정답 ");//틀렸다가 맞췄을 때
							munje++;
							jumsu+=20;break;//1문제while탈출; 5문제for+1;
						}//틀렸다가 맞춘 if
						else break;//두번틀리면 나가기
					}//틀렸을때
					
				}//1문제 while
			}//5문제for
			//5문제 다 풀고 결과띄움
			System.out.println("당신은 총 "+munje+"문제를 맞추어서 "+jumsu+"점 입니다.");
			while(true) {
				System.out.print("continue(y/n) : ");
				if(yn.equalsIgnoreCase("n")) break LOOP;//마지막while문 탈출
				else if(yn.equalsIgnoreCase("y"))continue LOOP;//마지막 while문 처음으로 감
				
			}
			//나와서 n이면 break
			//y면 continue
			
		
		}//문제 풀이 프로그램 while
		System.out.println("프로그램을 종료합니다.");
		
	}//main
}
