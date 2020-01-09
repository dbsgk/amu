package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[실행결과]
배열크기: 3
ar[0] : 25
ar[1] : 36
ar[2] : -78

25 36 -78
합 = xxx
최대값 =
최소값 =
input()
output()
big()
small()
*/
public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest3 a3 = new ArrayTest3();

		System.out.println("배열크기: ");
		int size = Integer.parseInt(a3.br.readLine());
		
		int[] ar = new int[size];
		int sum = a3.input(ar);// 호출
		int max, min;
		max = a3.big(ar);
		min = a3.small(ar);
		a3.output(ar, sum, max, min);

		
		// System.out.print("배열크기: ");
		min = ar[0];

	}

	public int big(int[] ar) { // 기본 max값이랑 비교해서 입력받은 값이 크면 입력하고 리턴해야 하는데 기본 max값을
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;

	}// big

	public int small(int[] ar) { // 기본 max값이랑 비교해서 입력받은 값이 크면 입력하고 리턴해야 하는데 기본 max값을
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
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}// output

}
