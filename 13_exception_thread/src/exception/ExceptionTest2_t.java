package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2_t {
	private int dan;
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 입력: ");
		dan = Integer.parseInt(br.readLine());
		
	}
	public void output() {
		if( dan>=2 && dan<10 ) {
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}else 
			//System.out.println("범위를 벗어났습니다.");
			
			//개발자가 강제로 Exception 발생시킴
			try {
				//throw new Exception("범위를 벗어났습니다.");
				throw new MakeException("범위를 벗어났습니다.");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			
	}
	public static void main(String[] args) throws IOException {
		ExceptionTest2_t e2 = new ExceptionTest2_t();
		e2.input(); //Exception걸어놓은 메소드 부르면 호출부에서도 Exception처리해줘야함.
		e2.output();
	}
}
