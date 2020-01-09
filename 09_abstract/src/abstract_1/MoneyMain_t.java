package abstract_1;

import java.util.Scanner;

public class MoneyMain_t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Money mm=null;
		System.out.print("현금 입력:");
		int input= sc.nextInt();
		System.out.print("1. 달러  2. 엔화  3.위안 : ");
		int choice = sc.nextInt();
		if(choice==1)mm= new USMoney(input);
		if(choice==2)mm= new JapanMoney(input);
		if(choice==3)mm= new ChinaMoney(input);
		mm.calcMoney();
		mm.dispMoney();
	}
}
