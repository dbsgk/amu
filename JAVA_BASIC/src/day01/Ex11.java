package day01;
//���ǹ�01 - if��
//if���� ��ȣ�ȿ� ���ǽ��� �����ְ�
//�ش� ���ǽ��� true�� ������ ����
//false�� ������ �������� ����

public class Ex11 {
	public static void main(String[]args) {
		int age = 18;
		//�ڵ� ����̶� {} �� ��ü ������ ���Ѵ�.
		if(age >= 18) {
			System.out.println("�����Դϴ�.");
		} else if(age >= 13) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}
