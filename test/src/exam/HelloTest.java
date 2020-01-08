package exam;

class HelloTest{
	public static void main(String[] args){
		System.out.print("안녕하세요!!\n");
		System.out.println("반갑습니다.");
		System.out.println("사과"+"오렌지");
		System.out.println(25+36);
		System.out.println("25"+"36");
		System.out.println("25+36="+25+36); // 문자+숫자(25)= 문자, 문자+숫자(36)=문자
		System.out.println("25+36="+(25+36));//문자+(숫자연산) 괄호안치면 숫자우선순위밀림
		System.out.println("25/36="+(25/36));// 0 정수계산이라 몫만 나옴.
		System.out.println("25/36="+(25.0/36));// 둘중하나만이라도 실수면 실수계산함
		System.out.println("25/36="+ (int)(25.0/36*10+0.5) /10.0);//소수이하 첫째자리까지 반올림
		System.out.println("25/36="+ String.format("%.1f",(25.0/36)));
		
	}
}
