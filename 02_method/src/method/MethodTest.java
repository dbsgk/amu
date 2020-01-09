package method;
//Math클래스
//둘중에 큰값,작은값(68,24)
//2의 5승
//난수를 사용해서 대문자 뽑아내기
//문자열 타입의 숫자를 정수와 실수로 뽑아내서 계산하기

public class MethodTest {
	public static void main(String[] args) {
		int big = Math.max(36,25);
//				  --------------- 호출
		System.out.println("큰값: "+big);
		int small = Math.min(36, 25);//min()이렇게만 쓰면 지금 클래스의 메소드라는 건데 Math꺼니까 Math.붙여준다.
		System.out.println("작은값: "+small);

		double power = Math.pow(2, 5);
//		^-----  pow메소드의 출력타입이 double이니까 int로 받으려하면 에러남.		
		System.out.println("2의 5승: "+power);
		System.out.println("2의 5승: "+(int)(power));

		//난수(random) - 컴퓨터가 불규칙하게 발생시키는 수를 말한다,
		//난수의 범위  - 0.0 <= 난수 < 1.0
		//double a = Math.random();
		//int a = (int)(Math.random()*100);//0~99
		//int a = (int)(Math.random()*100)+1;//1~100
		int a = (int)(Math.random()*26)+65;//대문자 뽑아내는법;65~90;90-65=25, 25+1=26을 
		//			 ----------------- 0~25 까지 나옴
		//
		System.out.println("난수: "+(char)a);
		
		System.out.println('2'+'5');//103(문자형태의 숫자라서)
		//System.out.println('2'-48+'5'-48);//7(-48을 해줘서 숫자형태로 바뀜)'0'(문자형태의 0)= 48,  0(숫자형태의 0) = 0
		System.out.println("2"+"5.7");//25
		//System.out.println("2"-48);(x)//문자형은 계산안됨. 문자형은 함수로만 계산가능
		
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));//7.7
		
		
		
	}
}
