package array;
/*
[������]
�迭ũ��: 3
ar[0] : 25
ar[1] : 36
ar[2] : -78

25 36 -78
�� = xxx
�ִ밪 =
�ּҰ� =
input()
output()
big()
small()
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest33 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		ArrayTest33 a33 = new ArrayTest33();
		int sum,max,min;
		System.out.print("�迭ũ�� : ");
		int size =Integer.parseInt(a33.br.readLine());
		int ar[] =new int[size];
		a33.input();
		a33.output();
		
	}//main
	public void input() throws IOException{
		//�迭ũ��, ���� �Է�
	}//input
	public void output() {
		//�Է��� ���� print�� ������ ��,�ִ밪,�ּҰ� ���
		ArrayTest33 a33 = new ArrayTest33();
		a33.big();
		a33.small();
	}//output	
	public void big() {
		//�Է¹��� ������ ���� ū ���� ���
		
	}//big
	public void small() {
		//�Է¹��� ������ ���� ���� ���� ���
	}//small
}//class
