package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배열크기 32개 2진수
/*[문제2]
10진수를 입력하여 2진수로 변환하시오
0이 입력되면 프로그램을 종료하세요
음수가 입력되면 재입력하세요
4개씩 끊어서 보여주기
Integer.toBinaryString() 쓰지마삼

[실행결과]
10진수 입력 : -5

10진수 입력 : 250
1111 1010 

10진수 입력 : 12
1100

10진수 입력 : 0
프로그램을 종료*/
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int ar[] = new int[32];
			System.out.print("10진수를 입력 : ");
			int input = Integer.parseInt(br.readLine());
			int index = 0;
			if (input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			while (input != 1) {
				ar[index++] = input % 2;//0번째부터
				input = input / 2;
			}
			ar[index] = input;
			for (int j = index; j >= 0; --j) {
				System.out.print(ar[j]);
				if(j%4==0)System.out.print(" ");
			}System.out.println();
			
		}//while
	}// main

}// class
