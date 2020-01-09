package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력해주세요: ");
		String str = br.readLine();
		System.out.println("정수를 입력해주세요: ");
		int aa = Integer.parseInt(br.readLine());
		System.out.println("실수를 입력해주세요: ");
		double bb = Double.parseDouble(br.readLine());
		
		System.out.println(str);
		System.out.println(aa);
		System.out.println(bb);
	}
}
//JVM - main
//	  - 모든 클래스를 java.lang에서 찾는다. 그래서 java.lang에 있는 메소드들은 import해줄 필요없음.

//Exception(예외처리)- JVM보고 알아서 하라고 함(throws IOException)
//1. 컴파일
//
//2. 실행
//
