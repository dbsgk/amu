package day01;
//�Է�
//�ڹٿ����� �Է����ڹٿ��� �⺻������ �����ϴ�
//�⺻ ���̺귯�� �� Scanner Ŭ������ ����Ͽ�
//�Է��� �ް� �ȴ�.
//������ Scanner�� �⺻������ �����Ǵ� Ŭ������ �ƴϱ� ������
//����Ϸ��� import��� ��ɾ ���ؼ� �ش� Ŭ������ �ε��ؾ��Ѵ�.
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		//Scanner�� Ŭ�����̱� ������
		//��ü�� ���������Ѵ�.
		//��ü�� Ŭ���� ������ ���Ѵ�.
		//��ü ����� �ʱ�ȭ �ϴ� ���:
		//Ŭ������ ��ü�̸� = new Ŭ������()
		Scanner scan = new Scanner(System.in);
		//��ĳ�ʿ� ���ǵǾ��ִ� �پ��� �޼ҵ���� �̿��ؼ� �츮�� ������ ���� �Է��� �� �ְ� �ȴ�.
		
		//���۸޸𸮿�  �츮�� �Է��� ������ ���� �ű� �ִ� ������ ������.
		
		System.out.print("���̸� �Է��ϼ���: ");//����+enter �ϸ� 
		int age= scan.nextInt();//nextInt�� ���ڸ� ������. \n ��������.
		System.out.print("�̸��� �Է��ϼ��� : ");
		//nextInt, nextDouble ���� ���ڸ� �Է¹޴� �޼ҵ��
		//���۸޸𸮿� �ԷµǾ� �ִ� enter(\n)�� ������ ���ڸ� �о.
		//���� nextInt, nextDouble ���Ŀ� ������ nextLine��
		//���� �޸𸮿� �����ִ� �ٹٲ� ���ڸ� ������
		//" �� ����ڰ� �ƹ��� �Է¾��� �Է��� ������ױ���!" ��� �����ϸ�
		//�ƹ��� ���ڿ����� �Է��� �� ���� ���װ� �߻��ϰ� �ȴ�.
		//�̷��� ���׸� �����ϱ� ���ؼ���
		//nextInt, nextDouble�� ����ϰ� ����
		//nextLine�� �ܵ� ������Ѽ� ���۸޸𸮸� ����ָ�
		//���� �޸𸮿� ����Ű�� �������� ������ ���������� ���ڿ��� �Է��� �� �ִ�.
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("��� ������ �Է��ϼ���:");
		double score = scan.nextDouble();
		System.out.println("�̸�: "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+score);
		
		scan.close();//Scanner�� �޸� ��Ƹ����ϱ� �޸� ������ �׸��϶�� ������.
		
	}
}
