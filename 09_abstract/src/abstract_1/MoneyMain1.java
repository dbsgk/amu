package abstract_1;

import java.util.Scanner;

public class MoneyMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Money1 mm;
		System.out.print("현금 입력:");
		int input= sc.nextInt();
		while(true) {
			System.out.print("1. 달러  2. 엔화  3.위안 : ");
			int choice = sc.nextInt();
			if(choice==1) {
				mm= new USMoney1(input);
				mm.calcMoney();
				mm.dispMoney();break;
			}
			else if(choice==2) {
				mm= new JapanMoney1(input);
				mm.calcMoney();
				mm.dispMoney();break;
			}
			else if(choice==3) {
				mm= new ChinaMoney1(input);
				mm.calcMoney();
				mm.dispMoney();break;
			}else {
				System.out.println("번호 다시 입력");continue;
			}
		}//while
	}//main
}//MoneyMain
