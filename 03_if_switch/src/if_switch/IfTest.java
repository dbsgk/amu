package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//간단한 경우에는 삼항연산자 사용하고 그외에 경우에 if사용

public class IfTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a :");
		int a = Integer.parseInt(br.readLine());
		if (a >= 50)
			System.out.println(a + "는 50보다 크거나 같다.");
		System.out.println(a + "는 50보다 작다");
		System.out.println();
		// if조건이 참이면 모든 라인이 출력되고
		// 조건이 거짓이면 다음줄부터 출력
		
		if(true)//여기가 false면 C가 나온다.
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();

		if(a%2 != 0) System.out.println(a+"는 홀수");
		else System.out.println(a+"는 짝수");
		
		//다중if :if중첩.윗 라인이 참이든 거짓이든 다음 if라인 수행하는 것을 말한다.
		//else는 윗라인이 참이면 실행하지 않는데 다중if는 전부 실행.
		if(a>='A'&& a<='Z')//65~90)
			System.out.println((char)a+"는 대문자");
		else if(a>='a'&& a<='z')
			System.out.println((char)a+"는 소문자");
		else
			System.out.println((char)a+"는 숫자이거나 특수문자");
		
	}
}
