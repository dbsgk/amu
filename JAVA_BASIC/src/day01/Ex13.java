package day01;
//����ڷκ��� ������ �Է¹޾Ƽ�
//�������� ������� ����ϴ� ���α׷��� ������ּ���.
//������ 4�� ������������ 100���� �ȳ����������� 400���� ������������
// 4-> ����
// 100 -> ���
// 400 -> ����
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է� ����");
		int year = scan.nextInt();
		//1������: 4�� �������鼭 100���� �ȳ�����������
		//2������: 400���� ������������
		if(year%4 == 0 && year%100!=0 || year %400 ==0) {
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("����Դϴ�.");
		}
		scan.close();
	}
}
