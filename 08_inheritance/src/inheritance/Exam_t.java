package inheritance;

import java.util.Scanner;

public class Exam_t {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";
	
	public Exam_t() {
		Scanner sc = new Scanner(System.in);
		ox = new char[5];
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("�� �Է� : ");
		dap = sc.next();
		System.out.println();
	}
	public void compare() {
		for(int i=0;i<JUNG.length();i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i]='O';
				score = score+20;
			}else {
				ox[i]='X';
			}
			
		}//for
		
	}//compare
	
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}

}

