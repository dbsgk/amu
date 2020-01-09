package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	public static void main(String[] args) {
		//StringBufferTest bt = new StringBufferTest();output();
		new StringBufferTest().output();
		
	}//main
	public StringBufferTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력: ");
		dan=sc.nextInt();
	}
	public void output() {
		//for문돌려서 구구단 계산
		StringBuffer sb = new StringBuffer();
		
		for(int j=1;j<=9;j++) {
			//System.out.println(dan+"*"+j+"="+(dan*j));
			//여기.append(이 값) 여기에 이 값을 넣어라.
			sb.append(dan);
			sb.append("*");
			sb.append(j);
			sb.append("=");
			sb.append(dan*j);
			
			System.out.println(sb.toString());//sb.toString() : sb를 문자열로 변환해라.
			sb.delete(0, sb.length());//start ~ end-1;
			//걍 크게  sb.delete(0, 10); 이렇게 해도 되는데 정확히 없애려면 sb.length로.
		}//for
	}
	
}//class
