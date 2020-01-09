package method;
//Math클래스
//둘중에 큰값,작은값(68,24)
//2의 5승
//난수를 사용해서 대문자 무작위로 뽑아내기
//문자열 타입의 숫자를 정수와 실수로 뽑아내서 계산하기

public class MethodTest1 {
	public static void main(String[] args) {
		int big = Math.max(68, 24);
		int small = Math.min(68, 24);
		double pow = Math.pow(2, 5);
		System.out.println(Math.random()+65);
		char ran = (char)((Math.random()*26)+65);//65~90, 90-65=25
		//이렇게 여기서 char로 해줘도 되고 출력할때 char로 해줘도 된다.
		
		//random에 +(더하기)는 처음 숫자, *(곱하기)는 범위에 들어가는 개수
		System.out.println(ran);
		String a="4", b="5.5";
		System.out.println(Integer.parseInt(a)+Double.parseDouble(b));
	}
}
