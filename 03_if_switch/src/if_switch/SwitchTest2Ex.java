package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*Switch 사용해서 문제풀기
a값 입력: 25
b값 입력: 36
연산자(+,-,*,/) 입력: +
25 + 36 = xx

연산자(+,-,*,/) 입력: /
25 / 36 = xx

연산자(+,-,*,/) 입력: $
연산자 error
*/

public class SwitchTest2Ex {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("연산자(+,-,*,/) 입력 : ");
		String op = br.readLine();
		//System.out.println(" = ");
		DecimalFormat df = new DecimalFormat("#.###"); 
		switch(op) {
		case "+": System.out.println(a+op+b+" = "+df.format(a+b));break;
		case "-": System.out.println(a+op+b+" = "+df.format(a-b));break;
		case "*": System.out.println(a+op+b+" = "+df.format(a*b));break;
		case "/": System.out.println(a+op+b+" = "+df.format((double)a/b));break;
		default : System.out.println("연산자 error");
		}
	}

}
