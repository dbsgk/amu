package inheritance;

import java.util.Scanner;

public class ExamTest {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";//정답-상수화
	int count;
	
	public ExamTest() {
		this.name = getName();
		this.ox = getOx();
		this.score = getScore();
		
	}
	public String getName() {
		System.out.print("이름 입력 : ");
		return sc.next();
		
	}
	public char[] getOx() { //ox리턴
		System.out.print("답 입력 : ");
		dap = sc.next();
		compare();
		return ox;
	}
	public int getScore() {
		return count*20;
	}//getScore
	public void compare() {
		System.out.println("compare들어왔다.");
		int count=0;
		char dp[] = new char[dap.length()];
		
		for(int i=0;i<dap.length();i++	) {
			dp[i] = dap.charAt(i);
			System.out.println(dp[i]);
		}
	}//compare

}//class
