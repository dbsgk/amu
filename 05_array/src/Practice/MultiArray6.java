package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt;
		int subjectCnt = 0;
		int total;
		double avg;
		String subject[][];
		System.out.print("�ο��� : ");
		cnt = Integer.parseInt(br.readLine());
		System.out.println();
		String name[] = new String[cnt];
		int jumsu[][];
		
		for(int i=0;i<cnt;i++) {
			System.out.print("�̸��Է�: ");
			name[i] = br.readLine();
			System.out.print("����� �Է�: ");
			subjectCnt= Integer.parseInt(br.readLine());
			
			subject = new String[cnt][];
			subject[i]= new String[subjectCnt];
			for(int j=0;j<subjectCnt;j++) {
				System.out.print("������Է�: ");
				subject[i][j]=br.readLine();
				
			}//for(�����)
			
			jumsu= new int[cnt][];
			
			for(int j=0;j<subjectCnt;j++) {
				jumsu[i]= new int[subjectCnt];
				System.out.print(subject[i][j]+"���� �Է�: ");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}//for(�����Է�)
			System.out.println("----------------------------------");
		}//for(�Է���ü)
		
		
		
		/*
		 * for(int i=0;i<cnt;i++) { System.out.print("�̸�\t"); for(int
		 * j=0;j<subjectCnt;j++) { System.out.print(subject[j]); }
		 * System.out.print("\t����\t���"); }
		 */
		
		
	}//main

}//class
