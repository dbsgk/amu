package day02;
//�ݺ���2 - while loop
//while loop�� ��쿡��
//() ���� ������ �����ϴ� ����
//��� ����ǰ� �ȴ�.
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 5;
		while(i>0) {
			//while���� ��� ��Ȯ�ϰ� ���� �ְ� ���������� ���� ��� ���ѷ���
			System.out.println(i);
			i--;//�̰� ������ ���ѷ���
			
		}
		//������ �ܼ����α׷��ֿ����� �Ϻη� ���� loop����� ��찡 �ִ�.
		while(true) {
			//���ѷ����� ������ ������ ���� ������ �ϸ� ��.
			//ex) 1>0 , true , 1==1
			System.out.println("��Ʈ�л� ���� ���α׷�");
			System.out.println("1. �����Է� 2. ������� 3. ����");
			System.out.print(">");
			int choice = scan.nextInt();
			if(choice==3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}//1,2�� ������ ��� �Է��ϰ� �߰� 3������ ����.
			//�������� �츮�� ��û�Ҷ� �Ѿ�ϱ� �ֿܼ����� ���.
		}
		scan.close();
	}
}
