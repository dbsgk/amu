package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제6]
문제5번에서 조건2, 조건3의 if문으로 처리한 것을 switch로 바꾸시오

[문제5] 성적 관리 프로그램
중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오

조건1) (중간+기말)/2    ---> 60%
          과제   	      ---> 20%
          출석               ---> 20%     
조건2)  90이상 'A'학점     		
          80이상 'B'학점        		  	 
          70이상 'C'학점        		  	 
          60이상 'D'학점        		  	 
          나머지 'F'학점
조건3)
         A, B학점  ---->"excellent"     
         C, D학점  ---->"good"
         F학점    ---->"poor"

[실행결과]
중간고사를 입력하시오 : 90
기말고사를 입력하시오 : 89
과제점수를 입력하시오 : 99
출석점수를 입력하시오 : 100

성적=93.20         <---소수이하 2째자리까지
학점=A              
평가=excellent

*/
public class Practice6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("중간고사 점수를 입력하시오 : ");
		int midExam = Integer.parseInt(br.readLine());
		System.out.print("기말고사 점수를 입력하시오 : ");
		int finExam = Integer.parseInt(br.readLine());
		System.out.print("과제 점수를 입력하시오 : ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("출석 점수를 입력하시오 : ");
		int attend = Integer.parseInt(br.readLine());
		
		double score = 0;
		String grade = null;
		String comment = null;
		
		score=((midExam+finExam)/2)*0.6 + report*0.2 + attend*0.2;//성적

		switch((int)score/10) {
		case 10 :
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		case 6 : grade="D";break;
		default : grade="f";
		}
		switch((int)score/10) {
		case 9 : case 8 : comment="exellent";break;
		case 7 : case 6 : comment="good";break;
		default : comment="poor";
		}
		
		System.out.println("성적 = "+String.format("%.2f", score));
		System.out.println("학점 = "+grade);
		System.out.println("평가 = "+comment);
	}//main

}//class
