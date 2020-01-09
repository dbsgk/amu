package constructor;

import java.util.Scanner;

public class MemberMain1 {
	Scanner sc = new Scanner(System.in);
	PersonDTO[] dto = new PersonDTO[5];// ��ü�迭 �⺻��:null
	int count;// ���� �ڸ���

	public static void main(String[] args) {
		MemberMain1 m1 = new MemberMain1();
		
		while(true) {
			m1.menu();//�޴� �ҷ�����
			int choice = m1.sc.nextInt();
			if(choice==5) {System.out.println("���α׷��� �����մϴ�.");break;}
			else if(choice==1) {m1.insert();continue;}
			else if(choice==2) {m1.list();continue;}
			else if(choice==3) {m1.update();continue;}
			else if(choice==4) {m1.delete();continue;}
		}//while
		
	}//main
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

	private void list() {
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number() + "\t"
						+ dto[i].getAddress());
			}//if
		} //for ������������� ����Ұž�.
	}//list

	private void update() {
		LOOP: while(true) {
			System.out.print("�ڵ��� ��ȣ �Է�: ");
			String input = sc.next();
			for (int i = 0; i < dto.length; i++) {
				if (dto[i]!=null && dto[i].getPhone_number().equals(input)) {
					System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
					System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number()
							+ "\t" + dto[i].getAddress());

					System.out.print("������ �̸� �Է� : ");
					dto[i].setName(sc.next());
					System.out.print("������ �ڵ��� �Է� : ");
					dto[i].setPhone_number(sc.next());
					System.out.print("������ �ּ� �Է� : ");
					dto[i].setAddress(sc.next());

					System.out.println("1 row(s) updated");
					break LOOP;
				} // if ����ȣ������ �ش� �ε����� �����̰� �ٽ� �Է�.
			}//for
			System.out.println("ã�� ȸ���� �����ϴ�.");
			break LOOP;
		}//while LOOP
	}//update

	private void delete() {
			LOOP: while (true) {
				System.out.print("�ڵ��� ��ȣ �Է�: ");
				String input = sc.next();
				for (int i = 0; i < dto.length; i++) {
					 if (dto[i]!=null&&dto[i].getPhone_number().equals(input)) {
						dto[i]=null;
						System.out.println("1 row deleted");
						continue LOOP;
					}//if
				} // for ����ȣ������ ������
				System.out.println("ã�� ȸ���� �����ϴ�.");break;
			} // while LOOP
	}//delete
	
	public void countCalc() {
		int count = 0;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] == null)
				count++;
		}//for
		this.count = count;
		System.out.println("�����ڸ���"+count);
	}// countCalc ���� �ڸ���

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
	
}//class