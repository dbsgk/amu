package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 구구단
 * 원하는 단을 입력: 2
 * 2*1=2
 * 2*2=4
 * int dan, i;
 * 
 * */
public class ForTest_Gugudan {

	public static void main(String[] args) throws IOException {
		int dan, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력: ");
		dan = Integer.parseInt(br.readLine());
		for (i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
}