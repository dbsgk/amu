package method;
//이름, 국어, 영어, 수학 점수를 입력받아서 총점, 평균을 구하시오.
//총점을 calcTot()에서 구해오기
//평균은 calcAvg()에서 구해오기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest33 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest33 m33 = new MethodTest33();
		String name = br.readLine();
		int kor = Integer.parseInt(br.readLine());
		int eng = Integer.parseInt(br.readLine());
		int math = Integer.parseInt(br.readLine());
		int tot = m33.calcTot(kor,eng,math);
		double avg = m33.calcAvg(tot);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));
	}
	public int calcTot(int a, int b, int c) {
		return a+b+c;
	}
	public double calcAvg(int a) {
		return a/3.0;
	}

}
