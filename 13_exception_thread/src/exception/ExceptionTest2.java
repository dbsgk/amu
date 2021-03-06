package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("원하는 입력: ");
		dan = Integer.parseInt(br.readLine());
		output(dan);
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
		
	}
	public void output(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	public static void main(String[] args) throws IOException {
		ExceptionTest2 e2 = new ExceptionTest2();
		e2.input(); //Exception걸어놓은 메소드 부르면 호출부에서도 Exception처리해줘야함.
	}
}
