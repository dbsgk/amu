package Practice;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray666 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt;
		String subject[][];
		System.out.print("인원수 : ");
		cnt = Integer.parseInt(br.readLine());
		System.out.println();
		String name[] = new String[cnt];
		double jumsu[][];
		jumsu = new double[cnt][];
		subject = new String[cnt][];
		int subjectCnt[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			System.out.print("이름입력: ");
			name[i] = br.readLine();
			System.out.print("과목수 입력: ");
			subjectCnt[i] = Integer.parseInt(br.readLine());

			subject[i] = new String[subjectCnt[i]];
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print("과목명입력: ");
				subject[i][j] = br.readLine();

			} // for(과목명)

			jumsu[i] = new double[subjectCnt[i] + 2];
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j] + "점수 입력: ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				jumsu[i][jumsu[i].length - 2] += jumsu[i][j];
			} // for(점수입력)
			jumsu[i][jumsu[i].length - 1] = (double) jumsu[i][jumsu[i].length - 2] / subjectCnt[i];
			System.out.println("----------------------------------");
		} // for(입력전체)
		
		for (int i = 0; i < cnt; i++) {
			System.out.print("이름\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print(subject[i][j] + "\t");
			} // 안쪽
			System.out.print("총점\t평균");
			System.out.println();

			System.out.print(name[i] + "\t");
			for (int j = 0; j < subjectCnt[i]; j++) {
				System.out.print((int)jumsu[i][j] + "\t");
			}
			System.out.println((int)jumsu[i][jumsu[i].length - 2] + "\t" + String.format("%.2f", jumsu[i][jumsu[i].length - 1]));
			System.out.println("----------------------------------");
		} // 바깥쪽

	}// main
}
