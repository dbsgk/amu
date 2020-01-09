package instance;
//

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25>36;//false
		System.out.println("a"+a);//false
		System.out.println("!a="+!a);//true
		System.out.println();//한줄 띄우겠다는 얘기
		
		//클래스 메모리 생성 - new
		String b = "apple";//문자열 literal
		String c = new String("apple");
		System.out.println("b==c: "+(b==c? "같다":"다르다"));//주소값(참조값)이 같니? 아니요
		System.out.println("b!=c: "+(b!=c? "참":"거짓"));
		System.out.println("b.equals(c) : "+(b.equals(c)?"같다":"다르다"));
		System.out.println("!b.equals(c) : "+(!b.equals(c)?"같다":"다르다"));//equals 부정할때는 맨앞에 !붙여줌.

	}
}
