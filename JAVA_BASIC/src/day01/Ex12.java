package day01;
//���ǹ� 02 - ���� if��
//if�� �ȿ� if���� �� �� �ִ�.

public class Ex12 {
	public static void main(String[] args) {
		int age = 70;
		if(age>18) {
			if(age > 60) {
				System.out.println("��ǥ�� ������ ��� �Դϴ�.");
			}else {
				System.out.println("��ǥ�� ������ �����Դϴ�.");
			}
		}
		//���� ���ǽľȿ� �������ڸ� ����Ͽ� �������� ������ �� �� �ִ�.
		int score = 78;
		if(score >= 70 && score <80) {
			System.out.println("C�Դϴ�.");
		}
	}
}
