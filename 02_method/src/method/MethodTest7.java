package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest7 m7	= new MethodTest7();
		System.out.println("주민번호를 입력하세요");
		String id = br.readLine();
		int age = m7.calcAge(id);
		String gender = m7.comp(id);
		System.out.println(gender+"고"+age+"살 입니다.");
	}
	private int calcAge(String id) {
		int year = Integer.parseInt(id.substring(0, 2));//91;
		char g = id.charAt(7);
		year += (g =='1'|| g=='2'? 1900:2000);
		int age = 2019-year+1;
		return age;
	}
	private String comp(String id) {
		String gen = id.charAt(7)=='1'||id.charAt(7)=='3'?"남자":"여자";
		return gen;
	}
}
