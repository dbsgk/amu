package abstract_1;

import java.util.Scanner;

/*[문제2]
원을 입력하여 달러, 엔, 위안으로 변경하시오
계산은 calcMoney() , 출력은 dispMoney() 하도록 하시오
소수이하 둘째자리까지 표시하고 소수이하 숫자가 없으면 표시하지 않도록 하시오
통화기호도 표시하시오

클래스
Money.java //
USMoney.java
JapanMoney.java
ChinaMoney.java

MoneyMain.java

[실행결과]
현금 입력 : 500000
1. 달러   2. 엔화   3. 위안  : 1
￦500,000  →  $431.78


*/
public class MoneyMain {
	public MoneyMain() {
	}
	public void calcMoney() {
		
	}
	public void dispMoney() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Money mm;
		System.out.print("현금 입력:");
		int input= sc.nextInt();
		System.out.print("1. 달러  2. 엔화  3.위안 : ");
		int choice = sc.nextInt();
		if(choice==1)mm= new USMoney(input);
		if(choice==2)mm= new JapanMoney(input);
		if(choice==3)mm= new ChinaMoney(input);
		
		
		
	}
}
