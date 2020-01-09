package day01;
//printf 예제
//printf는 %문자열을 사용해서 우리가 원하는 내용을 출력해줄 수 있다.
//%d: 10진법 숫자
//%x: 16진법 숫자
//%f: 실수
//%s: 문자열
public class Ex09 {
	public static void main(String[] args) {
		int myNumber = 233;
		//기본출력
		//\n을 입력하면 그전 내용을 출력하고 줄을 바꿔준다.
		System.out.printf("%d\n", myNumber);//233
		
		//특정칸만큼 고정해서 출력할때에는
		//%숫자d를 넣는다.
		System.out.printf("%5d\n", myNumber);//  233
		
		//형식중에서 왼쪽 빈자리를 0으로 채우고 싶으면
		//%0숫자d를 넣는다.
		System.out.printf("%05d\n", myNumber);//00233
		
		//왼쪽정렬이 필요하면 
		//%-숫자d를 넣는다.
		System.out.printf("%-5d\n", myNumber);//233  /여기 2칸 띄어서 출력됨.  
		
		//단!! %-05d는 안된다. 왜? 233인지 23300인지 헷갈리수 있어서.
		
		//16진법 출력하기
		//16진법의 경우 기본%문자는 d와 같지만 x를 소문자로 쓰냐 대문자로 쓰냐에 차이가 있게 된다.
		System.out.printf("%08x\n", myNumber);
		System.out.printf("%08X\n", myNumber);
		
		//실수 출력하기
		System.out.printf("%f\n", 3.141592);
		//소수점 3번쨰 자리까지 출력하기
		System.out.printf("%.3f\n", 3.141592);
		//10자리 출력하기
		System.out.printf("%10f\n", 3.141592);
		//10자리 + 소수점3자리
		System.out.printf("%10.3f\n", 3.141592);
		//문자열은 %s에 할당하게 된다.
		System.out.printf("%s\n", "안녕하세요");
	}
}
