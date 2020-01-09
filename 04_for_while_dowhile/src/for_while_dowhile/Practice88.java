package for_while_dowhile;
//잔고 지역변수로 (이게 진퉁)
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
public class Practice88 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice88 p88 = new Practice88();
		int balance=0;//잔액
		int choice;
		System.out.println("[실행결과]");
		while(true) {
			System.out.println("***************************");
			System.out.println("\t 1. 예금\n"+"\t 2. 출금\n"+"\t 3. 잔고\n"+"\t 4. 종료\n");
			System.out.println("***************************");
			System.out.print("번호 선택 : ");
			choice = Integer.parseInt(br.readLine());
			if(choice==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(choice==1) {
				//1.예금 메소드
				balance = p88.input(balance);
			}else if(choice==2) {
				//2.출금 메소드
				balance = p88.output(balance);
			}else if(choice==3) {
				//3.잔고
				System.out.println("당신의 잔액은 "+balance+"원 입니다.");continue;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}//가장 바깥쪽while
	}//main
	public int input(int balance) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("예금액 : ");
			int money = Integer.parseInt(br.readLine());
			if(money%10000==0) {//만원단위로 (만원이상이 아니라)
				balance+= money;
				System.out.println("당신의 잔액은 "+balance+"원 입니다."); break;
			}else {
				System.out.println("만원 단위로 입력하세요.");break;
			}//else(money<10000)
		}//input(while)
		return balance;
	}//input method
	public int output(int balance)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("출금액 : ");
			int money = Integer.parseInt(br.readLine());
			if(balance>=money) {
				balance-= money;
				System.out.println("당신의 잔액은 "+balance+"원 입니다."); break;
			}else {
				System.out.println("잔액이 부족합니다.");break;
			}//else(account<money)
		}//output(while)
		return balance;
	}//output method

}//class
