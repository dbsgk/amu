package day01;
//���� : ����ڷκ��� �̸�, ����, ������ ����, ����, ��������� �Է¹޾Ƽ�
//�̸��� 5�ڸ�
//���̴� 3�ڸ�
//������ 4�ڸ��� ���
//���̿� ������ �տ� ���ڸ��� 0���� ä�켼��.
//��������� �Ҽ���2��° �ڸ����� ����ϰ� ���弼��.
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��Է��ϼ���");
		String name = scan.nextLine();
		System.out.print("�����Է��ϼ���");
		int age	= scan.nextInt();
		System.out.print("�������� �Է��ϼ���");
		int kor = scan.nextInt();
		System.out.print("�������� �Է��ϼ���");
		int eng = scan.nextInt();
		System.out.print("�������� �Է��ϼ���");
		int math = scan.nextInt();
		
		System.out.printf("�̸� : %5s ����: %03d ����: %04d�� ����: %04d�� ����: %04d�� ����: %04d�� ���: %.2f��", name,age,kor,eng,math,kor+eng+math,(kor+eng+math)/3.0);
		scan.close();
	}
}
