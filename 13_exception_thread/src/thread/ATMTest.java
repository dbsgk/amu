package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositeMoney=100000;//잔액
	private long balance;//찾고자하는 금액
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm,"엄마");
		Thread son = new Thread(atm,"아들");
		
//		mom.setName("엄마");
//		son.setName("아들");
		mom.start();
		son.start();
	}
	@Override 
	public void run() { //public synchronized void run() { - 동기화 0
		synchronized (ATMTest.class) { //- 동기화 0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
		
		
		try {
			System.out.print("찾고자 하는 금액 입력: ");
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		withDraw();
		
		}
	}//run
	public void withDraw() {
		if(balance <= depositeMoney) {
			if(balance%10000 ==0) {
				depositeMoney -= balance;
				System.out.println("잔액은 "+depositeMoney+" 입니다.");
			}else System.out.println("만원 단위로 입력해주세요");
				
		}else System.out.println("잔액 부족");
		
		
		
//		if(balance%10000==0) {
//			if(balance>depositeMoney) {
//				System.out.println("잔액 부족");
//			}else depositeMoney -= balance;
//			System.out.println("현재잔액 : "+depositeMoney);
//		}else System.out.println("만원 단위로 입력해주세요");
	}//withDraw
}
