package day01;
//switch�� ����ϴ°� error������ (404�����߸� Ư�� �������� �����̷�Ʈ ���ٶ�)
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����ڷκ��� ���� �Է¹޾Ƽ�
		//�ش� ���� ���ϱ��� �ִ��� �����ִ� ���α׷�
		System.out.println("���� �Է��ϼ���: ");
		int month = scan.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ����Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ��� �Դϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ����Դϴ�.");
			break;
		}
		scan.close();
	}
}
