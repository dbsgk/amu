package for_while_dowhile;
//�ܰ� ���������� (�̰� ����)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����8] ���°��� ���α׷�//���⿡ ������ ���� ��¥ �������α׷�ó�� �ȴ�.
����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�.
����) ������ input(), ����� output()���� ó���ϼ���

[������]
****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 1
���ݾ� : 10000
����� �ܾ��� 10000�� �Դϴ�
�Ǵ�
���ݾ� : 12000
���� ������ �Է��ϼ���

****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 2
��ݾ� : 8000
����� �ܾ��� 2000�� �Դϴ�
�Ǵ� 
��ݾ� : 18000
�ܾ��� �����մϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 3
����� �ܾ��� 2000�� �Դϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 4
���α׷��� �����մϴ�.
*/
public class Practice88 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice88 p88 = new Practice88();
		int balance=0;//�ܾ�
		int choice;
		System.out.println("[������]");
		while(true) {
			System.out.println("***************************");
			System.out.println("\t 1. ����\n"+"\t 2. ���\n"+"\t 3. �ܰ�\n"+"\t 4. ����\n");
			System.out.println("***************************");
			System.out.print("��ȣ ���� : ");
			choice = Integer.parseInt(br.readLine());
			if(choice==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(choice==1) {
				//1.���� �޼ҵ�
				balance = p88.input(balance);
			}else if(choice==2) {
				//2.��� �޼ҵ�
				balance = p88.output(balance);
			}else if(choice==3) {
				//3.�ܰ�
				System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");continue;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}//���� �ٱ���while
	}//main
	public int input(int balance) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("���ݾ� : ");
			int money = Integer.parseInt(br.readLine());
			if(money%10000==0) {//���������� (�����̻��� �ƴ϶�)
				balance+= money;
				System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�."); break;
			}else {
				System.out.println("���� ������ �Է��ϼ���.");break;
			}//else(money<10000)
		}//input(while)
		return balance;
	}//input method
	public int output(int balance)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("��ݾ� : ");
			int money = Integer.parseInt(br.readLine());
			if(balance>=money) {
				balance-= money;
				System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�."); break;
			}else {
				System.out.println("�ܾ��� �����մϴ�.");break;
			}//else(account<money)
		}//output(while)
		return balance;
	}//output method

}//class
