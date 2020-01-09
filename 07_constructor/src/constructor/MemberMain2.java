package constructor;

import java.util.Scanner;

public class MemberMain2 {
	Scanner sc = new Scanner(System.in);
	static PersonDTO[] dto = new PersonDTO[5];// ��ü�迭 �⺻��:null
	static int count;// ���� �ڸ���

	public static void main(String[] args) {
		MemberMain2 m2 = new MemberMain2();
		
		while(true) {
			m2.menu();//�޴� �ҷ�����
			int choice = m2.sc.nextInt();
			if(choice==5) {System.out.println("���α׷��� �����մϴ�.");break;}
			else if(choice==1) {m2.insert();continue;}
			else if(choice==2) {m2.list();continue;}
			else if(choice==3) {m2.update();continue;}
			else if(choice==4) {m2.delete();continue;}
		}//while
		
	}//main
	private void insert() {
		countCalc();
		for(int i=0;i<dto.length;i++) {
			if(count!=0) {
				dto[i] = new PersonDTO();
				System.out.print("�̸� �Է� : ");
				dto[i].setName(sc.next());
				System.out.print("���� �Է� : ");
				dto[i].setAge(sc.nextInt());
				System.out.print("�ڵ��� �Է� : ");
				dto[i].setPhone_number(sc.next());
				System.out.print("�ּ� �Է� : ");
				dto[i].setAddress(sc.next());

				System.out.println("1 row created");
				count--;
				System.out.println((count) + "�ڸ� ���ҽ��ϴ�.");
				break;
			}//if �ڸ��� ������
			else {System.out.println("5���� ������ �� á���ϴ�...");break;}
		}//for
	}//insert

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
			}//for
		}//while LOOP
	}//update

	private void delete() {
			LOOP: while (true) {
				countCalc();//�����ڸ��� ���
				System.out.print("�ڵ��� ��ȣ �Է�: ");
				String input = sc.next();
				if(count==5)break LOOP;
				for (int i = 0; i < dto.length; i++) {
					if (!dto[i].getPhone_number().equals(input)) {
						System.out.println("ã�� ȸ���� �����ϴ�.");
						break LOOP;
					} else if (dto[i].getPhone_number().equals(input)) {
						dto[i]=null;
						System.out.println("1 row deleted");
						continue LOOP;
					} // else if
				} // for ����ȣ������ ������
			} // while LOOP
		System.out.println("ã�� ȸ���� �����ϴ�.");
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
