package method;
//문제4번을 substring으로 풀지않고 int변수 2개로 앞자리,뒷자리 따로 받아서 계산.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest5 {

	public static void main(String[] args)throws IOException {
		/* 이름(name), 주민번호(id)를 입력하여 성별을 출력하시오 
		 * 성별을 구별하는 comp()메소드와 나이를 계산하는 calcAge()메소드를 작성하시오
		 * 
		 * [실행결과]
		 * 이름 입력: 홍길동
		 * 주민번호 입력: 001023-3456789(문자열)
		 * 2019-2000+1=20
		 * 홍길동님은 남자이고 20살입니다
		 * 삼항연산자 사용해서 남자여자 구분하기 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest5 m4 =new MethodTest5();
		System.out.print("이름 입력: ");
		String name = br.readLine();
		System.out.print("주민번호 입력: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int num1= (id.charAt(0))-48, num2= id.charAt(1)-48;
		
		int age = m4.calcAge(num1,num2);
		System.out.println(name+"님은 "+gen+"이고 "+age+"살 입니다.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"남자":"여자";
		
		return gen;
	}
	public int calcAge(int num1, int num2) {
		
		int gg = num1*10+num2;
	
		//gg가 00~19년생이면 2019-(2000+gg)+1을 출력하고, gg가 20~99년생이면 2019-(1900+gg)+1을 출력한다.
		int age = gg>=20 && gg<100?2019-(1900+gg)+1:2019-(2000+gg)+1;
		return age;
	}

}
