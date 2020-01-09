package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*Switch ����ؼ� ����Ǯ��
a�� �Է�: 25
b�� �Է�: 36
������(+,-,*,/) �Է�: +
25 + 36 = xx

������(+,-,*,/) �Է�: /
25 / 36 = xx

������(+,-,*,/) �Է�: $
������ error
*/

public class SwitchTest2Ex {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("������(+,-,*,/) �Է� : ");
		String op = br.readLine();
		//System.out.println(" = ");
		DecimalFormat df = new DecimalFormat("#.###"); 
		switch(op) {
		case "+": System.out.println(a+op+b+" = "+df.format(a+b));break;
		case "-": System.out.println(a+op+b+" = "+df.format(a-b));break;
		case "*": System.out.println(a+op+b+" = "+df.format(a*b));break;
		case "/": System.out.println(a+op+b+" = "+df.format((double)a/b));break;
		default : System.out.println("������ error");
		}
	}

}
