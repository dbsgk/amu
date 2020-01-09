package constructor;

import java.util.Scanner;

/*

Ŭ�� ȸ������ ���α׷� �ۼ�
����� ������� �������� ȸ���� �� 5������ �Ѵ�
ȸ���� ������ �̸�, ����, �ڵ���, �ּҷ� �����Ѵ�
ȸ�� ����, ����, ��� ���α׷��� �ۼ��Ͻÿ�
������ �޼ҵ�� �����Ͻÿ�

[������]
menu()
*************
   1. ����
   2. ���
   3. ����
   4. Ż��
   5. ������
*************
  ��ȣ : 

[1�� ���]
insert()
5���� ������ �� á���ϴ�...//5���� �� ���� 
----------------------
�̸� �Է� :
���� �Է� :
�ڵ��� �Է� :
�ּ� �Է� :

1 row created
xx�ڸ� ���ҽ��ϴ�

[2�� ���]
list()
�̸�	����	�ڵ���		�ּ�

[3�� ���]
update()
�ڵ��� ��ȣ �Է� : 010-123-1234
ȫ�浿	25	xxx	xxx

���� �� �̸� �Է� : 
���� �� �ڵ��� �Է� : 
���� �� �ּ� �Է� : 

1 row(s) updated
--------------------
�ڵ��� ��ȣ �Է� : 010-123-1235
ã�� ȸ���� �����ϴ�

[4�� ���]
delete()
�ڵ��� ��ȣ �Է� : 
1 row deleted

�ڵ��� ��ȣ �Է� : 
ã�� ȸ���� �����ϴ�*/

public class MemberMain {
	static int count;// ���� �ڸ���
	static PersonDTO[] dto = new PersonDTO[5];// ��ü�迭 �⺻��:null
	Scanner sc = new Scanner(System.in);

	// ????;//�� 5�� salaryDTO �迭
	public void menu() {
		System.out.println("************");
		System.out.println("  1. ����");
		System.out.println("  2. ���");
		System.out.println("  3. ����");
		System.out.println("  4. Ż��");
		System.out.println("  5. ������");
		System.out.println("************");
		System.out.print("��ȣ : ");
	}// menu

	public void countCalc() {
		int count = 0;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] == null)
				count++;
			// System.out.println(dto[i]);
		} // ���� �ڸ���
		this.count = count;
	}// countCalc

	public void insert() {

		countCalc();// ���� �ڸ��� ���ϴ� �޼ҵ�
		if (count == 0)
			System.out.println("5���� ������ �� á���ϴ�...");
		else {

			int blankNum = 0;// ���ڸ� �迭��ȣ
			for (int i = 0; i < dto.length; i++) {
				if (dto[i] == null) {
					blankNum = i;
					break;
				}
			} // ���ڸ� �迭��ȣ ã�Ƽ� �־��ٰž�.
				// System.out.println(blankNum);
			dto[blankNum] = new PersonDTO();
			System.out.print("�̸� �Է� : ");
			dto[blankNum].setName(sc.next());
			System.out.print("���� �Է� : ");
			dto[blankNum].setAge(sc.nextInt());
			System.out.print("�ڵ��� �Է� : ");
			dto[blankNum].setPhone_number(sc.next());
			System.out.print("�ּ� �Է� : ");
			dto[blankNum].setAddress(sc.next());

			System.out.println("1 row created");
			count--;
			System.out.println((count) + "�ڸ� ���ҽ��ϴ�.");
		} // else
	}// insert

	public void list() {
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number() + "\t"
						+ dto[i].getAddress());
			}
		} // ���ڸ� �迭��ȣ ã�Ƽ� ����Ұž�.

		/*
		 * for(PersonDTO data: dto) { System.out.println(data.getName()+"\t"
		 * +data.getAge()+"\t" +data.getPhone_number()+"\t"+data.getAdress()); }
		 */

	}// list

	public void update() {
		LOOP: while (true) {
			System.out.print("�ڵ��� ��ȣ �Է�: ");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getPhone_number().equals(sc.next())) {
					System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number()
							+ "\t" + dto[i].getAddress());

					System.out.print("������ �̸� �Է� : ");
					dto[i].setName(sc.next());
					System.out.print("������ �ڵ��� �Է� : ");
					dto[i].setPhone_number(sc.next());
					System.out.print("������ �ּ� �Է� : ");
					dto[i].setAddress(sc.next());

					System.out.println("1 row(s) updated");
					break;
				} // if ����ȣ������ �ش� �ε����� �����̰� �ٽ� �Է�.
				else {
					System.out.println("ã�� ȸ���� �����ϴ�.");
					break LOOP;
				}
			} //

		} // while Loop

	}// update

	public void delete() {
		int dtoCnt = 0;// ��ϵ� ȸ����
		LOOP: while (true) {
			int arNum = 0;
			System.out.print("�ڵ��� ��ȣ �Է�: ");
			String input = sc.next();

			for (int i = 0; i < dto.length; i++) {
				if (dto[i] != null)
					dtoCnt++;
			} // for ȸ���� ���ϱ�
			if (dtoCnt == 0) {
				break LOOP;
			} // dto�� ���� �ϳ��� ������
			for (int i = 0; i < dto.length; i++) {
				if (!dto[i].getPhone_number().equals(input)) {
					System.out.println("ã�� ȸ���� �����ϴ�.");
					break LOOP;
				} else if (dto[i].getPhone_number().equals(input)) {
					// dto[arNum] = null;
					arNum = i;
					dto[arNum].setName(null);
					dto[arNum].setAge(0);
					dto[arNum].setPhone_number(null);
					dto[arNum].setAddress(null);
					System.out.println("1 row deleted");
					break;
				} // else if

			} // for ����ȣ������ ������
		} // while LOOP
		System.out.println("��ϵ� ȸ���� �����ϴ�.");
	}// delete

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();

		while (true) {
			mm.menu();
			int choice = mm.sc.nextInt();
			if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (choice == 1) {
				mm.insert();
				continue;
			} else if (choice == 2) {
				mm.list();
				continue;
			} else if (choice == 3) {
				mm.update();
				continue;
			} else if (choice == 4) {
				mm.delete();
				continue;
			} else
				continue;
		} // while

	}// main

}// class
