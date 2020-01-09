package method;
//static, non-static 메서드 호출

public class MethodTest2 {
	public static void disp() {// 메소드 구현
		System.out.println("static method");
	}

	public void output() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		disp();// 메소드 호출; MethodTest2.disp()라고 안써도됨.
		// new MethodTest2().output();//이렇게만 써줘도 됨.

		MethodTest2 aa = new MethodTest2(); // new로 새로 만들어주고
		System.out.println("aa = " + aa);// 패키지명.클래스명@16진수
		System.out.println("aa = " + aa.toString());// 안써도됨. 어차피 toString 다 붙어있는데 생략되어있음
		System.out.println("aa = " + aa.hashCode());// 10진수로 표현

		aa.output();// 불러옴
		System.out.println();
		int sum = aa.plus(25, 36);
		int sub = aa.minus(25, 36);
		int mul = aa.multiply(25, 36);
		double div = aa.divide(25, 36);

		System.out.println("25 + 36 : " + sum);
		System.out.println("25 - 36 : " + sub);
		System.out.println("25 * 36 : " + mul);
		System.out.println("25 / 36 : " + div);

	}

	public int add(int a, int b) {
		return a + b;// 리턴은 반드시 1개; 파이썬은 리턴 여러개한다.
	}

	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		return (double)a / b;
	}
}
