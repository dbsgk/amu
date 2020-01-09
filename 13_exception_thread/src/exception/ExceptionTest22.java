package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest22 {
	private int dan;
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan=0;
		try {
		System.out.print("원하는 입력: ");
		dan = Integer.parseInt(br.readLine());
		//output(dan);
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
		this.dan = dan;
		
	}
//	public void output(int dan) {
//		for(int i=1;i<=9;i++) {
//			System.out.println(dan+"*"+i+"="+dan*i);
//		}
//	}
	public void output() {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	public static void main(String[] args) throws IOException {
		ExceptionTest22 e22 = new ExceptionTest22();
		e22.input();
		e22.output();
	}
}
