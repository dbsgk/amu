package method;
//�̸�, ����, ����, ���� ������ �Է¹޾Ƽ� ����, ����� ���Ͻÿ�.
//������ calcTot()���� ���ؿ���
//����� calcAvg()���� ���ؿ���

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest3 aa = new MethodTest3();// �̷��� Ŭ���� new�����ִ°� ���� �߿��ϴܴ�.

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = br.readLine();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = Integer.parseInt(br.readLine());
		int tot = aa.calcTot(kor, eng, math);
		double avg = aa.calcAvg(tot);
		System.out.println();
		System.out.println("*** " + name + " ����ǥ ***");
		System.out.println("����\t����\t����\t����\t���");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg));

		// System.out.println("������ "+aa.calcTot(kor,eng,math));
		// System.out.println("����� "+String.format("%.2f", aa.calcAvg(kor,eng,math)));
	}// main method ��

	public int calcTot(int a, int b, int c) {// (int kor, int eng, int math)�� �� �� �˾ƺ���� ���� �����ش�. but �� kor�� ����kor�� ������
												// ����� �ٸ� ������.
		return a + b + c;
	}// calcTot ��

	public double calcAvg(int a) {// int a�� int tot���� �ٲ㵵 ��. ������ ���ʿ��� �ҷ����°� �ƴ϶� �� a��� ��.
		return a / 3.0;
	}// calcAvg ��

}
