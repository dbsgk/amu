package method;
//�̸�, ����, ����, ���� ������ �Է¹޾Ƽ� ����, ����� ���Ͻÿ�.
//������ calcTot()���� ���ؿ���
//����� calcAvg()���� ���ؿ���

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
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));
	}
	public int calcTot(int a, int b, int c) {
		return a+b+c;
	}
	public double calcAvg(int a) {
		return a/3.0;
	}

}
