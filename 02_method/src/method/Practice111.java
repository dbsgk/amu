package method;

/*10진수 a값을 입력받고 그 수의 2,8,16진수 구하기(Integer함수 이용하지 않고)*/
//전부 완성
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice111 {
	public static void main(String[] args) throws IOException {
		// 5;10을 2로 나눈다 ; 0;10%2나머지는 마지막칸에 저장
		// 2;(10/2)를 2로 나눈다; 1;(10/2)%2나머지는 마지막-1칸에 저장
		// ((10/2)/2)를 2로 나눈다; ((10/2)%2)/2나머지는 그전칸-1칸에 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10진수 숫자를 입력: ");
		int a = Integer.parseInt(br.readLine());
		int mok2 = a;// 입력받은 숫자를 2진수로 계산할 숫자
		int mok8 = a;// 입력받은 숫자를 8진수로 계산할 숫자
		int mok16 = a;// 입력받은 숫자를 16진수로 계산할 숫자
		String nam2 = "";
		String nam8 = "";
		String nam16 = "";
		// String mok=String.valueOf(a);
		// for문으로 값을 뽑아내서
		
		// 2진수
		if (mok2 < 2) {
			
			System.out.println("2진수 : " + mok2);

		} else if (mok2 >= 0) {
			while (mok2 / 2 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 2로 a를 나눌수 있을때)
				nam2 += String.valueOf(mok2 % 2);
				mok2 /= 2;
			}
			System.out.println("2진수 : " + mok2 + (reverseString(nam2)));
		}
		// 8진수
		if (mok8 < 8) {
			System.out.println("8진수 : 0" + mok8);
		} else if (mok8 >= 8) {
			while (mok8 / 8 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 8로 a를 나눌수 있을때)
				nam8 += String.valueOf(mok8 % 8);
				mok8 /= 8;
			}
			System.out.println("8진수 : 0" + mok8 + (reverseString(nam8)));
		}
		// 16진수
		if(mok16<10) {//입력받은 숫자가 9이하의 숫자일때
			System.out.println("16진수 : 0x" + mok16);

		}else if (mok16 < 16) {//입력받은 숫자가 15이하의 숫자일때
			int i = mok16 % 16;
			switch (i) {
			case 10:
				nam16 += "A";
				break;
			case 11:
				nam16 += "B";
				break;
			case 12:
				nam16 += "C";
				break;
			case 13:
				nam16 += "D";
				break;
			case 14:
				nam16 += "E";
				break;
			case 15:
				nam16 += "F";
				break;
			}//switch
			System.out.println("16진수 : 0x" + nam16);
		} else if (mok16 >= 16) {
			while (mok16 / 16 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 16으로 a를 나눌수 있을때)
				if (mok16 % 16 >= 10 && mok16 % 16 <= 15) {
					int i = mok16 % 16;
					switch (i) {
					case 10:
						nam16 += "A";
						break;
					case 11:
						nam16 += "B";
						break;
					case 12:
						nam16 += "C";
						break;
					case 13:
						nam16 += "D";
						break;
					case 14:
						nam16 += "E";
						break;
					case 15:
						nam16 += "F";
						break;
					}

				} else
					nam16 += String.valueOf(mok16 % 16);
				mok16 /= 16;
			}//16진수 while
			System.out.println("16진수 : 0x" + mok16 + (reverseString(nam16)));
		}//16진수 else if
	}//main

	public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}
}
