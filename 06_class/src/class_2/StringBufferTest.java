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
		System.out.print("���ϴ� ���� �Է�: ");
		dan=sc.nextInt();
	}
	public void output() {
		//for�������� ������ ���
		StringBuffer sb = new StringBuffer();
		
		for(int j=1;j<=9;j++) {
			//System.out.println(dan+"*"+j+"="+(dan*j));
			//����.append(�� ��) ���⿡ �� ���� �־��.
			sb.append(dan);
			sb.append("*");
			sb.append(j);
			sb.append("=");
			sb.append(dan*j);
			
			System.out.println(sb.toString());//sb.toString() : sb�� ���ڿ��� ��ȯ�ض�.
			sb.delete(0, sb.length());//start ~ end-1;
			//�� ũ��  sb.delete(0, 10); �̷��� �ص� �Ǵµ� ��Ȯ�� ���ַ��� sb.length��.
		}//for
	}
	
}//class
