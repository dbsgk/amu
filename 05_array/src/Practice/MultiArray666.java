package Practice;
//������ ����ǥ ���� ������.
//�ο��� 2. ���� ���� �ٸ�(������� �ٸ�), �� ���� ����, ����, ��� 
/*
[����]
�ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
����� �Ҽ����� 2°�ڸ����� ���

[������]
�ο��� : 2 (cnt)

�̸��Է� : ȫ�浿 (name)
����� �Է� : 2   (subjectCnt)
����� �Է� : ���� (subject)
����� �Է� : ����
���� ���� �Է� : 95 (jumsu)
���� ���� �Է� : 100
---------------------
�̸��Է� : �̱���
����� �Է� : 3
����� �Է� : ����
����� �Է� : ����
����� �Է� : ����
���� ���� �Է� : 95
���� ���� �Է� : 100
���� ���� �Է� : 90
---------------------

�̸�     ����	  ����   	����     ���
ȫ�浿    95	  100   xxx	xx.xx

�̸�	����  	����   	����    	����     	���
�̱���   	95   	100	   90	 xxx      xx.xx


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray666 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt;
		String subject[][];
		System.out.print("�ο��� : ");
		cnt = Integer.parseInt(br.readLine());
		System.out.println();
		String name[] = new String[cnt];
		double jumsu[][];
		jumsu = new double[cnt][];
		subject = new String[cnt][];
		int subjectCnt[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			System.out.print("�̸��Է�: ");
			name[i] = br.readLine();
			System.out.print("����� �Է�: ");
			subjectCnt[i] = Integer.parseInt(br.readLine());

			subject[i] = new String[subjectCnt[i]];
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print("������Է�: ");
				subject[i][j] = br.readLine();

			} // for(�����)

			jumsu[i] = new double[subjectCnt[i] + 2];
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j] + "���� �Է�: ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				jumsu[i][jumsu[i].length - 2] += jumsu[i][j];
			} // for(�����Է�)
			jumsu[i][jumsu[i].length - 1] = (double) jumsu[i][jumsu[i].length - 2] / subjectCnt[i];
			System.out.println("----------------------------------");
		} // for(�Է���ü)
		
		for (int i = 0; i < cnt; i++) {
			System.out.print("�̸�\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j] + "\t");
			} // ����
			System.out.print("����\t���");
			System.out.println();

			System.out.print(name[i] + "\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print((int)jumsu[i][j] + "\t");
			}
			System.out.println((int)jumsu[i][jumsu[i].length - 2] + "\t" + String.format("%.2f", jumsu[i][jumsu[i].length - 1]));
			System.out.println("----------------------------------");
		} // �ٱ���

	}// main
}
