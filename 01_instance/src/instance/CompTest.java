package instance;

public class CompTest {
	public static void main(String[] args) {
		//int score = 90;
		int score = 65;
		String result = score>=80 && score<=100 ? "합격": "불합격";
		System.out.println("결과 ="+result);
		
		//result = score가 짝수면? "짝수": "홀수";
		result = score%2==0? "짝수": "홀수";
		System.out.println("결과 ="+result);
		
		int b= 80;
		result = score>=b? "score": "b" ;
		result = score>=b? score+"": b+"" ;//이렇게 하면 값을 문자화시켜서 출력가능.
		System.out.println("큰 값 ="+result);

	}
}
//짝수 -2로 나누면 나머지가 0