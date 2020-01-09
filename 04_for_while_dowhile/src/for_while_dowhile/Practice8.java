package for_while_dowhile;
//this.account로 한거
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제8] 계좌관리 프로그램//여기에 스레드 쓰면 진짜 은행프로그램처럼 된다.
예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오.
조건) 예금은 input(), 출금은 output()에서 처리하세요

[실행결과]
****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 1
예금액 : 10000
당신의 잔액은 10000원 입니다
또는
예금액 : 12000
만원 단위로 입력하세요

****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 2
출금액 : 8000
당신의 잔액은 2000원 입니다
또는 
출금액 : 18000
잔액이 부족합니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 3
당신의 잔액은 2000원 입니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 4
프로그램을 종료합니다.
*/
public class Practice8 {
	int account;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Practice8 p8 = new Practice8();
		int user;
		System.out.println("[실행결과]");
		while(true) {
			System.out.println("***************************");
			System.out.println("\t 1. 예금\n"+"\t 2. 출금\n"+"\t 3. 잔고\n"+"\t 4. 종료\n");
			System.out.println("***************************");
			System.out.print("번호 선택 : ");
			user = Integer.parseInt(p8.br.readLine());
			if(user==1) {
				//1.예금 메소드
				p8.input();
				System.out.println(p8.account);
				continue;
			}else if(user==2) {
				//2.출금 메소드
				p8.output();
				continue;
			}else if(user==3) {
				//3.잔고
				System.out.println("당신의 잔액은 "+p8.account+"원 입니다.");continue;
			}else if(user==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//else if(4)
		}//가장 바깥쪽while
	}//main
	public void input()throws IOException {
		int money;
		System.out.println("예금액 : ");
			money = Integer.parseInt(br.readLine());
			if(money>=10000) {
				this.account+= money;
				System.out.println("당신의 잔액은 "+this.account+"원 입니다.");
			}else {
				System.out.println("만원 단위로 입력하세요.");
			}//else(money<10000)
	}//input method
	public void output()throws IOException {
		int money =0;
		System.out.println("출금액 : ");
			money = Integer.parseInt(br.readLine());
			if(this.account>=money) {
				this.account-= money;
				System.out.println("당신의 잔액은 "+this.account+"원 입니다.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}//else(account<money)
	}//output method

}//class
