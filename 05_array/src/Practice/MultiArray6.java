package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//각자의 성적표 따로 찍히게.
//인원수 2. 과목 각자 다름(과목수도 다름), 각 과목 점수, 총점, 평균 
/*
[문제]
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   	총점     평균
홍길동    95	  100   xxx	xx.xx

이름	국어  	영어   	과학    	총점     	평균
이기자   	95   	100	   90	 xxx      xx.xx


*/
public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt;
		int subjectCnt = 0;
		int total;
		double avg;
		String subject[][];
		System.out.print("인원수 : ");
		cnt = Integer.parseInt(br.readLine());
		System.out.println();
		String name[] = new String[cnt];
		int jumsu[][];
		
		for(int i=0;i<cnt;i++) {
			System.out.print("이름입력: ");
			name[i] = br.readLine();
			System.out.print("과목수 입력: ");
			subjectCnt= Integer.parseInt(br.readLine());
			
			subject = new String[cnt][];
			subject[i]= new String[subjectCnt];
			for(int j=0;j<subjectCnt;j++) {
				System.out.print("과목명입력: ");
				subject[i][j]=br.readLine();
				
			}//for(과목명)
			
			jumsu= new int[cnt][];
			
			for(int j=0;j<subjectCnt;j++) {
				jumsu[i]= new int[subjectCnt];
				System.out.print(subject[i][j]+"점수 입력: ");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}//for(점수입력)
			System.out.println("----------------------------------");
		}//for(입력전체)
		
		
		
		/*
		 * for(int i=0;i<cnt;i++) { System.out.print("이름\t"); for(int
		 * j=0;j<subjectCnt;j++) { System.out.print(subject[j]); }
		 * System.out.print("\t총점\t평균"); }
		 */
		
		
	}//main

}//class
