package instance;

/*[문제4] 이름(name) 홍길동이고 국어점수(kor) 90 영어점수(eng) 85 수학점수(math) 100점 일때 총점(tot)과 평균(avg)을 구하시오
단 평균은 소수이하 2째자리까지 표시하시오

[실행결과]
이름	국어	영어	수학	총점	평균
홍길동	90	85	100	xxx	xx.xx
*/
public class Practice4 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90;
		int eng = 85;
		int math = 100;
		int tot = kor+eng+math;
		double avg = (double)tot/3;
		
		System.out.println("이름	국어	영어	수학	총점	평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+ String.format("%.2f", avg));
	}

}
