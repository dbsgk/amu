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
//NumberFormatException : 숫자 받는곳에 문자 들어왔을때, '숫자가 아닙니다'처리하는 애.
public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a값 입력하세요: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력하세요: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자(+,-,*,/)  입력하세요: ");
		String op = br.readLine();
		double d;
		System.out.println();

		switch (op) {
		
		case "+":
			d = (a + b);
			break;
		case "-":
			d = (a - b);
			break;
		case "*":
			d = (a * b);
			break;
		case "/":
			d = (a / b);
			break;
		default:
			System.out.println("연산자 error");
		}
		DecimalFormat df = new DecimalFormat("#.###");//소수점3자리가 기본값.

		switch (op) {
		// if(op.equals("+"))
		case "+":
			System.out.println(a + " " + op + " " + b + " = " + df.format(a + b));
			break;
		case "-":
			System.out.println(a + " " + op + " " + b + " = " + df.format(a - b));
			break;
		case "*":
			System.out.println(a + " " + op + " " + b + " = " + df.format(a * b));
			break;
		case "/":
			//System.out.println(a + " " + op + " " + b + " = " + String.format("%.3f", (double) a / b));
			System.out.println(df.format((double)a/b));
			break;
		default:
			System.out.println("연산자 error");
		}

	}

}
