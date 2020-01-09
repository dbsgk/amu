package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest3 a3 = new ArrayTest3();

		System.out.println("�迭ũ��: ");
		int size = Integer.parseInt(a3.br.readLine());
		
		int[] ar = new int[size];
		int sum = a3.input(ar);// ȣ��
		int max, min;
		max = a3.big(ar);
		min = a3.small(ar);
		a3.output(ar, sum, max, min);

		
		// System.out.print("�迭ũ��: ");
		min = ar[0];

	}

	public int big(int[] ar) { // �⺻ max���̶� ���ؼ� �Է¹��� ���� ũ�� �Է��ϰ� �����ؾ� �ϴµ� �⺻ max����
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;

	}// big

	public int small(int[] ar) { // �⺻ max���̶� ���ؼ� �Է¹��� ���� ũ�� �Է��ϰ� �����ؾ� �ϴµ� �⺻ max����
		int min = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] <= min) {
				min = ar[i];
			}
		}
		return min;

	}// small

	public int input(int[] ar) throws IOException{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar["+i+"] : ");
			ar[i] = Integer.parseInt(br.readLine());
			sum+= ar[i];
		}//for
		return sum;
		
	}// input

	public void output(int[] ar,int sum,int max,int min) {
		for (int i : ar) {
			System.out.print(i+"	");
		}
		System.out.println();
		System.out.println("�� = " + sum);
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}// output

}
