package day02;

import java.util.ArrayList;
import java.util.Scanner;

//�Ʊ� ������� Student Ŭ������ �̿���
//�������� ���α׷��� ������.
public class StudentEx {
	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();//�ڿ� <>���⿣ ��� ����� ��� ����
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("��Ʈ�� �������� ���α׷�");
			System.out.println("1. �����Է� 2.��� 3. ����");
			System.out.print(">");
			int choice = scan.nextInt();
			if(choice ==1) {
				//���ο� �л���ü�� ���� list�� �߰����ش�
				Student s = new Student();
				System.out.println("�̸�");
				scan.nextLine();//enter ���ڿ��� �ν��ؼ� ���� �̸��� �Է¾ȵ�.
				s.setName(scan.nextLine());
				System.out.println("��ȣ");
				s.setId(scan.nextInt());
				System.out.println("�г�");
				s.setGrade(scan.nextInt());
				System.out.println("��");
				s.setRoom(scan.nextInt());
				System.out.println("����");
				s.setKor(scan.nextInt());
				System.out.println("����");
				s.setEng(scan.nextInt());
				System.out.println("����");
				s.setMath(scan.nextInt());
				list.add(s);
				
			}else if(choice==2) {
				//��ü�� ����ϴ� �ڵ带 �ۼ��Ѵ�.
				System.out.println("===========================================");
				//\t�� �ǰ���(�����̽�4��ũ��)
				System.out.println("��ȣ\t�̸�\t�г�\t��\t����\t����\t����\t����\t���\t");
				System.out.println("===========================================");
				for(Student s: list) {
					System.out.println(s);//getId()+"\t"+s.getName()+"\t"+s.getGrade());
				}
			}else if(choice==3) {
				System.out.println("������ּż� ������");
				break;
			}
		}
		scan.close();		
	}
}
