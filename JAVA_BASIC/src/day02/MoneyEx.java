package day02;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyEx{
	public static void main(String[] args) {
		ArrayList<Money> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("�뵷������");
			System.out.println("1. �Է� 2.���� 3.��� 4.����");
			System.out.println(">");
			int choice = scan.nextInt();
			if(choice ==1) {
				//Money ��ü�� ���� list�� �߰����ִ� �ڵ�
				Money m = new Money();
				System.out.println("��¥");
				scan.nextLine();
				m.setDate(scan.nextLine());
				System.out.println("�ݾ�");
				m.setPaid(scan.nextInt());
				scan.nextLine();
				System.out.println("����");
				m.setMemo(scan.nextLine());
				list.add(m);//�̰� ������ ����Ʈ�� ����ȵ�.
			} else if(choice==2) {
				System.out.println("=====��볻��====");
				for(int i=0; i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				System.out.println("������ ��ȣ�� �Է��ϼ���");
				int index = scan.nextInt();
				list.remove(index);//�̰ž����� ����Ʈ���� �����ȵ�.
				
			}else if(choice==3) {
				//����ϴ� �ڵ�
				System.out.println("===========");
				System.out.println("��볻��");
				System.out.println("===========");
				for(Money m:list) {
					System.out.println(m);
				}
				
				
			}else if(choice==4) {
				//�����ϴ� �ڵ�
				System.out.println("����");
				break;
			}
			
		}
		scan.close();
	}
}	
	