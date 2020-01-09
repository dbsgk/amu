package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest6 {

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
		
		/* aa="orange";
		 * aa.substring(0,2); 0번부터 2번이전까지 뽑아온다.
		 * 
		 */		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest6 m4 =new MethodTest6();
		System.out.print("이름 입력: ");
		String name = br.readLine();
		System.out.print("주민번호 입력: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int age = m4.calcAge1(id);
		System.out.println(name+"님은 "+gen+"이고"+age+"살 입니다.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"남자":"여자";
		
		return gen;
	}
	public int calcAge(String a) {
		//8번째 숫자가 1,2면 a( 20~99년생 )계산식을 사용하고 3,4면 b( 00~19년생 )계산식을 사용
		//num가 00~19년생이면 2019-(2000+num)+1을 출력하고, num가 20~99년생이면 2019-(1900+num)+1을 출력한다.
		String num = a.substring(0, 2);//00년;0번째부터 2번째 이전까지
		int age = a.charAt(7)=='1' || a.charAt(7)=='2'?  2019-(1900+Integer.parseInt(num))+1: 2019-(2000+Integer.parseInt(num))+1; //20~99년생이면
		
		
		return age;
	}
	public int calcAge1(String a) {
		//주민번호 숫자를 뽑아온다.
		//그 숫자를 계산해서 나이를 뽑아서 리턴한다.
		int num = Integer.parseInt(a.substring(0, 2));
		//num이 20과 같거나 크고, 100보다 작으면? 1900년대 계산식: 2000년대 계산식;
		int age= num >= 20 && num < 100 ? 2019-(num+1900)+1:2019-(num+2000)+1;
		return age;
	}
	
	

}
