package for_while_dowhile;
//this.account�� �Ѱ�
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
public class Practice8 {
	int account;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Practice8 p8 = new Practice8();
		int user;
		System.out.println("[������]");
		while(true) {
			System.out.println("***************************");
			System.out.println("\t 1. ����\n"+"\t 2. ���\n"+"\t 3. �ܰ�\n"+"\t 4. ����\n");
			System.out.println("***************************");
			System.out.print("��ȣ ���� : ");
			user = Integer.parseInt(p8.br.readLine());
			if(user==1) {
				//1.���� �޼ҵ�
				p8.input();
				System.out.println(p8.account);
				continue;
			}else if(user==2) {
				//2.��� �޼ҵ�
				p8.output();
				continue;
			}else if(user==3) {
				//3.�ܰ�
				System.out.println("����� �ܾ��� "+p8.account+"�� �Դϴ�.");continue;
			}else if(user==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}//else if(4)
		}//���� �ٱ���while
	}//main
	public void input()throws IOException {
		int money;
		System.out.println("���ݾ� : ");
			money = Integer.parseInt(br.readLine());
			if(money>=10000) {
				this.account+= money;
				System.out.println("����� �ܾ��� "+this.account+"�� �Դϴ�.");
			}else {
				System.out.println("���� ������ �Է��ϼ���.");
			}//else(money<10000)
	}//input method
	public void output()throws IOException {
		int money =0;
		System.out.println("��ݾ� : ");
			money = Integer.parseInt(br.readLine());
			if(this.account>=money) {
				this.account-= money;
				System.out.println("����� �ܾ��� "+this.account+"�� �Դϴ�.");
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
			}//else(account<money)
	}//output method

}//class
