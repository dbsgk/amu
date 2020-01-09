package constructor;

import java.util.Scanner;

public class MemberMain4 {
	Scanner sc  =new Scanner(System.in);
	static PersonDTO2[] dto = new PersonDTO2[5];
	int count;//�����ڸ���
	int arNum;//�迭��ȣ
	
	public void countCalc(){
		int count=0;
		for(int i=0;i<dto.length;i++){
			if(dto[i]==null)count++;
		}
		this.count=count;
	}//���� �ڸ��� ���ϴ� �޼ҵ�
	
	public void findMem(){
		int arNum=-1;
		System.out.print("�ڵ��� ��ȣ �Է�: ");
		String input = sc.next();
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null&& dto[i].getPhone_num().equals(input)){
				arNum=i; this.arNum=arNum; break;
			}//if
		}//for
		if(arNum==-1)System.out.println("ã�� ȸ���� �����ϴ�.");
		
	}//����ȣ ���� ȸ�� ���ϴ� �޼ҵ�

	private void insert() {
		while(true){
			countCalc();
			if(count==0)
			{System.out.println("5�� ������ á���ϴ�...");break;}
			for(int i=0;i<dto.length;i++){
				if(dto[i]==null){
					dto[i] = new PersonDTO2();
					System.out.print("�̸� �Է�: ");
					dto[i].setName(sc.next());
					System.out.print("���� �Է�: ");
					dto[i].setAge(sc.nextInt());
					System.out.print("�ڵ��� ��ȣ �Է�: ");
					dto[i].setPhone_num(sc.next());
					System.out.print("�ּ� �Է�: ");
					dto[i].setAddress(sc.next());
					break;
				}//if
			}//for
			System.out.println("1 row created");
			countCalc();
			System.out.println(count+"�ڸ� ���ҽ��ϴ�.");break;
		}//while
	}//insert
	
	private void list() {
		System.out.println("�̸�\t����\t�ڵ�����ȣ\t\t�ּ�");
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null)
			System.out.println(dto[i].getName()+"\t"
								+dto[i].getAge()+"\t"
									+dto[i].getPhone_num()+"\t"
										+dto[i].getAddress());
		}
	}//list
	
	private void update() {
		findMem();
		System.out.println("�̸�\t����\t�ڵ�����ȣ\t\t�ּ�");
		System.out.println(dto[arNum].getName()+"\t"
				+dto[arNum].getAge()+"\t"
					+dto[arNum].getPhone_num()+"\t"
						+dto[arNum].getAddress());
		System.out.print("������ �̸� �Է�: ");
		dto[arNum].setName(sc.next());
		System.out.print("������ �ڵ��� ��ȣ �Է�: ");
		dto[arNum].setPhone_num(sc.next());
		System.out.print("������ �ּ� �Է�: ");
		dto[arNum].setAddress(sc.next());
		System.out.println("1 row updated");
	}
	private void delete() {
		findMem();
		dto[arNum]=null;
		System.out.println("1 row deleted");
		findMem();
	}
	public void menu(){
		System.out.println("**************");
		System.out.println(" 1.����");
		System.out.println(" 2.���");
		System.out.println(" 3.����");
		System.out.println(" 4.����");
		System.out.println(" 5.������");
		System.out.println("**************");
		System.out.print("��ȣ: ");
	}//menu

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		
		while(true){
			mm.menu();
			int choice= mm.sc.nextInt();
			if(choice==5) {System.out.println("���α׷��� �����մϴ�.");break;}
			else if(choice==1) { mm.insert();continue;}
			else if(choice==2) { mm.list();continue;}
			else if(choice==3) { mm.update();continue;}
			else if(choice==4) { mm.delete();continue;}
		}//while
		
	}//main
}//class