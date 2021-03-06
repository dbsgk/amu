package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		if(args.length!=0) //이거 안넣으면 exception 발생.
			System.out.println("args[0] = "+args[0]);
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("숫자 입력: " );
		int num2 = sc.nextInt();
		int num = Integer.parseInt(args[0]);
		System.out.println(num+" / "+num2+" = "+num/num2);
		}catch(ArithmeticException e) {
			System.out.println("0은 나누기 안됨");
		} catch(InputMismatchException e) {
			System.out.println("숫자를 넣어주세요");
		} finally {
			System.out.println("에러가 있든 없든 무조건 실행");//마지막에 마무리 할 때 사용.
		}
	}
}
