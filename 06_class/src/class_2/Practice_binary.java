package class_2;

import java.util.Scanner;

public class Practice_binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] binary = new int[32];
		while(true) {
			
			System.out.print("십진수를 입력: ");
			int dec;
			dec = sc.nextInt();
			if(dec==0) {System.out.println("프로그램을 종료합니다.");break;}
			if(dec<0)continue;
			int i;
			for(i=0; dec!=0;i++) {
				binary[i]=dec%2;
				dec=dec/2;
			}
			
			for(int j=i-1; j>=0;j--) {
				System.out.print(binary[j]);
				if(j%4==0)System.out.print(" ");
			}
			System.out.println();
		}
	}//main
}
