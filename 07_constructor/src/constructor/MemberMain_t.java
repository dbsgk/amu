package constructor;

import java.util.Scanner;

public class MemberMain_t {
	Scanner sc = new Scanner(System.in);
	PersonDTO ar[] = new PersonDTO[5];

	public static void main(String[] args) {
		MemberMain_t mm = new MemberMain_t();
		mm.menu();
	}
	
	public void menu() {
		int num=0;
		while(true) {
			System.out.println("*************");
			 System.out.println("  1. ����");
			 System.out.println("  2. ���");
			 System.out.println("  3. ����");
			 System.out.println("  4. Ż��");
			 System.out.println("  5. ������");
			System.out.println("*************");
			System.out.print("  ��ȣ : ");
			num=sc.nextInt();
			if(num==5)break;
			
			if(num==1)insert();//this.insert();�� ����.
			else if(num==2)list();
	        else if(num==3)update();
	        else if(num==4)delete();
			
		}//while
	}//menu


	public void delete() {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone =sc.next();
		int i;
		
		for(i=0;i<ar.length;i++) {
			if(ar[i]!=null&& ar[i].getPhone_number().equals(phone)) {
				ar[i]=null;
				System.out.println("1 row(s) deleted");
				break;
			}
		}
		if(i==5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}//delete

	private void update() {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phone =sc.next();
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]!=null && ar[i].getPhone_number().equals(phone)) {
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getPhone_number() + "\t"
						+ ar[i].getAddress());
				
				System.out.print("���� �� �̸� �Է� : ");
				ar[i].setName(sc.next());
				System.out.print("���� �� �ڵ��� �Է� : ");
				ar[i].setPhone_number(sc.next());
				System.out.print("���� �� �ּ� �Է� : ");
				ar[i].setAddress(sc.next());
				 
				System.out.println("1 row(s) updated");
				break;
			}//if
		}//for
		
		if(i==5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}//update

	public void insert() {
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]==null)break;
		}
		
		
		if(i==ar.length) {
			System.out.println("5���� ������ �� á���ϴ�...");
			return;//insert()�޼ҵ� ��ü�� �����. void�϶� return�� Ż���.
		}
		
		//����
		System.out.print("�̸� �Է� : ");
		String name=sc.next();
		System.out.print("���� �Է� : ");
		int age=sc.nextInt();
		System.out.print("�ڵ��� �Է� : ");
		String phone=sc.next();
//		 if(!phone.matches("(01[016789])-(\\d{3,4})-(\\d{4})")) {
//			 System.out.println("ex)010-1234-5678");
//		 }
		System.out.print("�ּ� �Է� : ");
		String address=sc.next();
		
		ar[i]= new PersonDTO(name,age,phone,address);
		
		System.out.println("1 row created"); 
		
		int cnt=0;
		for(i=0; i<ar.length;i++) {
			if(ar[i]==null)
			cnt++;
		}
		System.out.println(cnt+"�ڸ� ���ҽ��ϴ�.");
	}//insert

	private void list() {
		System.out.println("name\tAge\tPhone\tAddress");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getPhone_number() + "\t"
						+ ar[i].getAddress());
			}
		}
	}//list
}//class
