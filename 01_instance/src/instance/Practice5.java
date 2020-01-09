package instance;

/*[문제5]
변수 score의 값이 2와 3의 공배수인지 아닌지를 출력하시오

[실행결과]
25는 2와 3의 공배수가 아니다 (score=25일때)
또는
12는 2와 3의 공배수이다 (score=12일때)
*/
public class Practice5 {

	public static void main(String[] args) {
		int score= 24;
		String result = score%2==0 && score%3==0? "는 2와 3의 공배수이다":"는 2와 3의 공배수가 아니다";
		System.out.println(score+result);

	}

}
