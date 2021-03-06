package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MultiArray6_t {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("인원수: ");
		int cnt= Integer.parseInt(br.readLine());
		
		String[] name = new String[cnt];
		String subject[][] =new String[cnt][];//사람마다 과목수 달라서 뒤에 배열은 가변.
		int jumsu[][] =new int[cnt][];
		double[] avg = new double[cnt];
		int subjectCnt;
		
		for(int i=0;i<cnt;i++) {
			System.out.print("이름입력: ");
			name[i]= br.readLine();
			
			System.out.print("과목수 입력: ");
			subjectCnt = Integer.parseInt(br.readLine());//배열로 안하고 한번씩 쓰고 버림
			
			subject[i]= new String[subjectCnt];
			for(int j=0;j<subjectCnt;j++) {
				System.out.print("과목명 입력: ");
				subject[i][j]=br.readLine();
			}//for j	
			
			jumsu[i]= new int[subjectCnt+1];
			for(int j=0;j<subjectCnt;j++) {
				System.out.print(subject[i][j]+" 점수 입력: ");
				jumsu[i][j]=Integer.parseInt(br.readLine());
				//총점
				jumsu[i][subjectCnt]+=jumsu[i][j];
			}//for j
			
			//평균
			avg[i] = (double)jumsu[i][subjectCnt]/subjectCnt;
			
			System.out.println("----------------------------------------");
		}//for i(입력)
		
		//출력
		for(int i=0;i<cnt;i++) {
			System.out.print("이름\t");
			for(int j=0;j<subject[i].length;j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균");
			
			System.out.print(name[i]+"\t");
			for(int j=0;j<jumsu[i].length;j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(df.format(avg[i]));
			System.out.println("--------------------------------------");
			
		}//for i
		
	}//main
}//class
