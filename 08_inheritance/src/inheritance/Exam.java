package inheritance;

import java.util.Scanner;

public class Exam {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";//����-���ȭ
	int count;
	
	public Exam() {
		System.out.print("�̸� �Է� : ");
		name=sc.next();
		System.out.print("�� �Է� : ");
		dap = sc.next();
		compare();
	}
	public String getName() {
		return name;
		
	}
	public char[] getOx() { //ox����
		return ox;
	}
	public int getScore() {
		return count*20;
	}//getScore
	public void compare() {
		int count=0;
		char ox[]= new char[JUNG.length()+1];
		for(int i=0;i<JUNG.length();i++) {
			if(JUNG.charAt(i)==dap.charAt(i)) {
				ox[i]='O';
				System.out.print(ox[i]);
				count++;
			}else {
				ox[i]='X';
				System.out.print(ox[i]);
			}
		}//for
		this.ox=ox;
	}//compare

}//class
