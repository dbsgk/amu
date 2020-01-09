package method;
//이름, 국어, 영어, 수학 점수를 입력받아서 총점, 평균을 구하시오.
//총점을 calcTot()에서 구해오기
//평균은 calcAvg()에서 구해오기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest3 aa = new MethodTest3();// 이렇게 클래스 new시켜주는게 아주 중요하단다.

		System.out.print("이름을 입력하세요 : ");
		String name = br.readLine();
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수를 입력하세요 : ");
		int math = Integer.parseInt(br.readLine());
		int tot = aa.calcTot(kor, eng, math);
		double avg = aa.calcAvg(tot);
		System.out.println();
		System.out.println("*** " + name + " 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg));

		// System.out.println("총점은 "+aa.calcTot(kor,eng,math));
		// System.out.println("평균은 "+String.format("%.2f", aa.calcAvg(kor,eng,math)));
	}// main method 끝

	public int calcTot(int a, int b, int c) {// (int kor, int eng, int math)좀 더 잘 알아보라고 같게 맞춰준다. but 위 kor와 여기kor는 지역을
												// 벗어나서 다른 변수임.
		return a + b + c;
	}// calcTot 끝

	public double calcAvg(int a) {// int a를 int tot으로 바꿔도 됨. 어차피 저쪽에서 불러오는거 아니라서 걍 a라고 씀.
		return a / 3.0;
	}// calcAvg 끝

}
