package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*���ڸ��߱����(while��)
1~100������ ������ �߻��Ͽ� ���ߴ� ����
[������]
�����Է�:50
50���� Ů�ϴ�
�����Է�: 90
90���� �۽��ϴ�.
...
�����Է�: 87
������ xx������ ���߼̽��ϴ�.

*/
public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;
		int count = 0;
//		while (com != user) {
//			System.out.println("�����Է�: ");
//			user = Integer.parseInt(br.readLine());
//			count++;
//			if (com > user) {
//				System.out.println(user + "���� Ů�ϴ�.");
//			} else if (com < user) {
//				System.out.println(user + "���� �۽��ϴ�.");
//			} else if (com == user) {
//				System.out.println("������ " + count + "������ ���߼̽��ϴ�.");
//				break;
//			}
//			System.out.println();
//		}//while (�̷��� ������ �κп� �ּ����ָ� �������� ��������; ������ �� �ڵ������ �����ϱ� ���ϰԲ�)
		int coin = 1;
		while (coin != 0) {
			com = (int) (Math.random() * 100) + 1;
			user = 0;
			count = 0;
			do {
				System.out.println(com);
				System.out.println("�����Է�: ");
				user = Integer.parseInt(br.readLine());
				count++;
				if (com > user) {
					System.out.println(user + "���� Ů�ϴ�.");
				} else if (com < user) {
					System.out.println(user + "���� �۽��ϴ�.");
				} else if (com == user) {
					System.out.println("������ " + count + "������ ���߼̽��ϴ�.");
					break;
				}
				System.out.println();

			} while (com != user);
			
			coin = 0;
			System.out.print("�� �ҷ�?(Y/N) : ");
			String yn = br.readLine();
			if (yn.equalsIgnoreCase("N")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (yn.equalsIgnoreCase("Y")) {
				coin++;
			} else {System.out.println("�߸��Է��ϼ̽��ϴ�.");}
				 
		}//��ü���δ� while ��
	}
}