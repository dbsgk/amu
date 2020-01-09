package instance;
/*문제
 * 320, 258을 변수에 저장하여 합을 구하시오
 * 
 * [실행결과]
 * 320+258=xxx 변수 a,b, sum
 * 320-258=xxx (sub)
 * 320*258=xxx (mul)
 * 320/258=1.24xxxx (div) 이거 소수점 둘째자리까지 뽑아라.
 * */
public class NumberTest {
	public static void main(String[] args) {
		short a = 320;//short범위가 32767이라 괜히 int안쓰고 short씀
		short b = 258;
		int sum = a+b;
		//short sum = (short)(a+b);//정수연산의 기본타입은 int라서 short의 경우 형변환해줘야함.
		//ex) char'A'+ char'B'= int 131; char 계산도 int형
		int sub = a-b;
		int mul = a*b;
		double div = (double)a/b;//
		//String div = String.format("%.2f",(double)a/b);
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"+"+b+"="+ String.format("%.2f", div));
		
	}
}
