package array;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest33 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		ArrayTest33 a33 = new ArrayTest33();
		int sum,max,min;
		System.out.print("배열크기 : ");
		int size =Integer.parseInt(a33.br.readLine());
		int ar[] =new int[size];
		a33.input();
		a33.output();
		
	}//main
	public void input() throws IOException{
		//배열크기, 숫자 입력
	}//input
	public void output() {
		//입력한 숫자 print로 나오고 합,최대값,최소값 출력
		ArrayTest33 a33 = new ArrayTest33();
		a33.big();
		a33.small();
	}//output	
	public void big() {
		//입력받은 숫자중 가장 큰 숫자 출력
		
	}//big
	public void small() {
		//입력받은 숫자중 가장 작은 숫자 출력
	}//small
}//class
