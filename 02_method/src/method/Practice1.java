package method;
/*[문제1]
정수(dec)를 입력받아서 2진수(binary), 8진수(octor), 16진수(hexa) 변환하시오
Integer클래스 메소드를 이용하시오

[실행결과]
10진수를 입력하세요 : 250

2진수 = 11111010
8진수 = 372
16진수 = fa
*/
//2진수,8진수, 16진수를 구하는 함수 만들기.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10진수를 입력하세요 :");
		int dec = Integer.parseInt(br.readLine());//정수dec입력받음
		
		System.out.println("2진수 = "+Integer.toBinaryString(dec));
		//java.lang.Integer.toBinaryString 메소드의 return값은 String이라서 숫자로 사용하려면 Integer로 변환해줘야한다.
		System.out.println("8진수 = "+Integer.toOctalString(dec));
		System.out.println("16진수 = "+Integer.toHexString(dec));

		
	}
}
