package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray66 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		System.out.print("인원수 : ");
		cnt = Integer.parseInt(br.readLine());// 인원수입력
		String subject[][] =new String[cnt][];
		int subjectCnt[] = new int[cnt];
		double jumsu[][]=new double[cnt][];
		String name[] = new String[cnt];

		for (int i = 0; i < cnt; i++) {
			System.out.print("이름입력: ");
			name[i] = br.readLine();
			System.out.print("과목수 입력: ");
			subjectCnt[i] = Integer.parseInt(br.readLine());
			// 이름과목수입력
			subject[i] = new String[subjectCnt[i]];
				
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print("과목명입력: ");
				subject[i][j] = br.readLine();
			} // for(과목명)

			jumsu[i] = new double[subjectCnt[i]+2];
				for (int j = 0; j < subjectCnt[i]; j++) {
					System.out.print(subject[i][j] + "점수 입력: ");
					jumsu[i][j] = Integer.parseInt(br.readLine());
					jumsu[i][subjectCnt[i]]+=jumsu[i][j];
				}
				jumsu[i][subjectCnt[i]+1]=(double)jumsu[i][subjectCnt[i]]/subjectCnt[i];
				System.out.println("----------------------------------");
		} // for(전체입력)


		for (int i = 0; i < cnt; i++) {
			System.out.print("이름\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균");
			
			System.out.print(name[i]);
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(jumsu[i][subjectCnt[i]]+"\t"+String.format("%.2f", jumsu[i][subjectCnt[i]+1]));
		} // for(전체출력)
		
	}// main

}// class
