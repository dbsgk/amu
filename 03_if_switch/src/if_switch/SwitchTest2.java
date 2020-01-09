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
//NumberFormatException : ���� �޴°��� ���� ��������, '���ڰ� �ƴմϴ�'ó���ϴ� ��.
public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�� �Է��ϼ���: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է��ϼ���: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������(+,-,*,/)  �Է��ϼ���: ");
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
			System.out.println("������ error");
		}
		DecimalFormat df = new DecimalFormat("#.###");//�Ҽ���3�ڸ��� �⺻��.

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
			System.out.println("������ error");
		}

	}

}
