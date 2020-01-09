package method;

/*10진수 a값을 입력받고 그 수의 2,8,16진수 구하기(Integer함수 이용하지 않고)*/
//16진수빼고 완성
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice11 {
	public static void main(String[] args) throws IOException {
		// 5;10을 2로 나눈다 ; 0;10%2나머지는 마지막칸에 저장
		// 2;(10/2)를 2로 나눈다; 1;(10/2)%2나머지는 마지막-1칸에 저장
		// ((10/2)/2)를 2로 나눈다; ((10/2)%2)/2나머지는 그전칸-1칸에 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10진수 숫자를 입력: ");
		int a = Integer.parseInt(br.readLine());
		int mok2 = a;//입력받은 숫자
		int mok8 = a;//입력받은 숫자
		int mok16 = a;//입력받은 숫자
		String nam2 ="";
		String nam8 ="";
		String nam16 ="";
		// String mok=String.valueOf(a);
		// for문으로 값을 뽑아내서
		//2진수
		while (mok2 / 2 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 2로 a를 나눌수 있을때)
			nam2 += String.valueOf(mok2 % 2);
			mok2 /= 2;
		}
		System.out.println("2진수 : "+mok2+(reverseString(nam2)));
		//8진수
		while (mok8 / 8 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 8로 a를 나눌수 있을때)
			nam8 += String.valueOf(mok8 % 8);
			mok8 /= 8;
		}
		System.out.println("8진수 : 0"+mok8+(reverseString(nam8)));
		//16진수
		while (mok16 / 16 > 0) {// 만약에 a를 나눈 정수값이0이 아닐때(= 16으로 a를 나눌수 있을때)
			nam16 += String.valueOf(mok16 % 16);
			mok16 /= 16;
		}
		System.out.println("16진수 : 0x"+mok16+(reverseString(nam16)));
	}

	public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}
}
//나눈 값을 또 저장해야 하는데?