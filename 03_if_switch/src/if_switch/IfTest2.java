package if_switch;
//이걸로 가위 바위 보 게임 만들거임
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오
 * 
 * [실행결과]
 * a값 입력: 78
 * b값 입력: 25
 * c값 입력: 36
 * 25	36	78*/
public class IfTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a값 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c값 입력: ");
		int c = Integer.parseInt(br.readLine());

		/*
		 * if(a>=b && a>=c) {//a가 가장 크다면 if(b>=c)
		 * {System.out.print(c+"\t"+b+"\t"+a);//b가 c보다 크다면 }else
		 * System.out.println(b+"\t"+c+"\t"+a);//c가 b보다 크다면
		 * 
		 * }else if(b>=a && b>=c) {//b가 가장 크다면 if(a>=c)
		 * {System.out.print(c+"\t"+a+"\t"+b);//a가 c보다 크다면 }else
		 * System.out.println(a+"\t"+c+"\t"+b);//c가 a보다 크다면
		 * 
		 * }else if(c>=a && c>=b) {//c가 가장 크다면 if(a>=b)
		 * {System.out.print(b+"\t"+a+"\t"+c);//a가 b보다 크다면 }else
		 * System.out.println(a+"\t"+b+"\t"+c);//b가 a보다 크다면 }
		 */
		
		if(a<=b && a<=c) {//a가 가장 작다면
			if(b<=c) {System.out.print(a+"\t"+b+"\t"+c);//b가 c보다 작다면 
			}else System.out.println(a+"\t"+c+"\t"+b);//c가 b보다 작다면
			
		}else if(b<=a && b<=c) {//b가 가장 작다면
			if(a<=c) {System.out.print(b+"\t"+a+"\t"+c);//a가 c보다 작다면
			}else System.out.println(b+"\t"+c+"\t"+a);//c가 a보다 작다면
			
		}else if(c<=a && c<=b) {//c가 가장 작다면
			if(a<=b) {System.out.print(c+"\t"+a+"\t"+b);//a가 b보다 작다면
			}else System.out.println(c+"\t"+b+"\t"+a);//b가 a보다 작다면
		}
	}
}
