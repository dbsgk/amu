package day02;
//����ڷκ��� �Է��� �޾Ƽ�
//1���� �ش� ���ڱ����� �ñ׸��� �����ִ� ���α׷� �ۼ�
//�ñ׸�? ������������ ������������ ��
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է¤���");
		int num	= scan.nextInt();
		int sigma = 0;
		
		for(int i=1;i<=num; i++){
			sigma +=i;
		}
		System.out.println("�� :"+sigma);
		scan.close();
	}
}
