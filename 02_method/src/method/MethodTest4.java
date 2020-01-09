package method;
/* 이름(name), 주민번호(id)를 입력하여 성별을 출력하시오 
		 * 성별을 구별하는 comp()메소드와 나이를 계산하는 calcAge()메소드를 작성하시오
		 * 
		 * [실행결과]
		 * 이름 입력: 홍길동
		 * 주민번호 입력: 001023-3456789(문자열)
		 * 2019-2000+1=20
		 * 홍길동님은 남자이고 20살입니다
		 * 삼항연산자 사용해서 남자여자 구분하기 */
		
		/* aa="orange";
		 * aa.substring(0,2); 0번부터 2번이전까지 뽑아온다.
		 * 
		 */	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

	public static void main(String[] args)throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 m4 =new MethodTest4();
		System.out.print("이름 입력: ");
		String name = br.readLine();
		System.out.print("주민번호 입력: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int age = m4.calcAge(id);
		System.out.println(name+"님은 "+gen+"이고"+age+"살 입니다.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"남자":"여자";
		
		return gen;
	}
	public int calcAge(String a) {
		
		int gg = Integer.parseInt(a.substring(0, 2));//앞두자리
		//gg가 00~19년생이면 2019-(2000+gg)+1을 출력하고, gg가 20~99년생이면 2019-(1900+gg)+1을 출력한다.
		int age = gg>=20 && gg<100?2019-(1900+gg)+1:2019-(2000+gg)+1;
		return age;
	}

}
