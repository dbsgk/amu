package abstract_1;

import java.util.Scanner;

/*[����2]
���� �Է��Ͽ� �޷�, ��, �������� �����Ͻÿ�
����� calcMoney() , ����� dispMoney() �ϵ��� �Ͻÿ�
�Ҽ����� ��°�ڸ����� ǥ���ϰ� �Ҽ����� ���ڰ� ������ ǥ������ �ʵ��� �Ͻÿ�
��ȭ��ȣ�� ǥ���Ͻÿ�

Ŭ����
Money.java //
USMoney.java
JapanMoney.java
ChinaMoney.java

MoneyMain.java

[������]
���� �Է� : 500000
1. �޷�   2. ��ȭ   3. ����  : 1
��500,000  ��  $431.78


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
		System.out.print("���� �Է�:");
		int input= sc.nextInt();
		System.out.print("1. �޷�  2. ��ȭ  3.���� : ");
		int choice = sc.nextInt();
		if(choice==1)mm= new USMoney(input);
		if(choice==2)mm= new JapanMoney(input);
		if(choice==3)mm= new ChinaMoney(input);
		
		
		
	}
}
