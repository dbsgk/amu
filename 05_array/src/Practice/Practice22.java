package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ar[] = new String[32];
		while (true) {
		for (int i = 1; i <= 32; i++) {
			ar[i - 1] = "0";
		}
			System.out.print("10진수 입력 : ");
			int input = Integer.parseInt(br.readLine());
			int mok=input;
			int index=31;
			if (input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (input < 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} else if (input == 1) {
				ar[31] = "1";
			} else 
				while(mok/2>0) {
					ar[index]=mok%2+"";	
					mok = mok/2;
					index--;
				
				} 
			ar[index]=mok+"";
			
			for (int i = 1; i <= 32; i++) {//2진수로 된 수들 쫙 뽑아줌.
				System.out.print(ar[i - 1]);
				if (i % 4 == 0)//4자리씩
					System.out.print(" ");
			}
			System.out.println();
		} // while
		/*
		 * System.out.println("거꾸로출력"); for(int i = (ar.length)-1;i>=0;i-- ) {
		 * System.out.println("ar["+i+"] = "+ar[i]); }
		 */
	}// main

}// class