package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ������
 * ���ϴ� ���� �Է�: 2
 * 2*1=2
 * 2*2=4
 * int dan, i;
 * 
 * */
public class ForTest_Gugudan {

	public static void main(String[] args) throws IOException {
		int dan, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ϴ� ���� �Է�: ");
		dan = Integer.parseInt(br.readLine());
		for (i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
}