package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray66 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		System.out.print("�ο��� : ");
		cnt = Integer.parseInt(br.readLine());// �ο����Է�
		String subject[][] =new String[cnt][];
		int subjectCnt[] = new int[cnt];
		double jumsu[][]=new double[cnt][];
		String name[] = new String[cnt];

		for (int i = 0; i < cnt; i++) {
			System.out.print("�̸��Է�: ");
			name[i] = br.readLine();
			System.out.print("����� �Է�: ");
			subjectCnt[i] = Integer.parseInt(br.readLine());
			// �̸�������Է�
			subject[i] = new String[subjectCnt[i]];
				
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print("������Է�: ");
				subject[i][j] = br.readLine();
			} // for(�����)

			jumsu[i] = new double[subjectCnt[i]+2];
				for (int j = 0; j < subjectCnt[i]; j++) {
					System.out.print(subject[i][j] + "���� �Է�: ");
					jumsu[i][j] = Integer.parseInt(br.readLine());
					jumsu[i][subjectCnt[i]]+=jumsu[i][j];
				}
				jumsu[i][subjectCnt[i]+1]=(double)jumsu[i][subjectCnt[i]]/subjectCnt[i];
				System.out.println("----------------------------------");
		} // for(��ü�Է�)


		for (int i = 0; i < cnt; i++) {
			System.out.print("�̸�\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("����\t���");
			
			System.out.print(name[i]);
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(jumsu[i][subjectCnt[i]]+"\t"+String.format("%.2f", jumsu[i][subjectCnt[i]+1]));
		} // for(��ü���)
		
	}// main

}// class
