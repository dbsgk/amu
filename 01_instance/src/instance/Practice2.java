package instance;
/*[문제2] 삼각형넓이를 계산하시오 (base, height, area)
삼각형넓이 = (밑변 * 높이)/2

[실행결과]
**** 삼각형의 넓이 구하기  ****
밑변 :   5  
높이 :   7
넓이 :   XX.XX  	<--- 소수 2자리까지출력하시오*/

public class Practice2 {
	public static void main(String[] args) {
		int base = 5;
		int height = 7;
		double area = (double)base*height/2;
		System.out.println("**** 삼각형의 넓이 구하기 ****");
		System.out.println("밑변  :\t"+base);
		System.out.println("높이  :\t"+height);
		System.out.println("넓이  :\t"+ String.format("%2.2f", area));
		
		
		int base1 = 5;
		int height1= 7;
		double area1 = (double)base1*height1/2;
		System.out.println("넓이"+ String.format("%.2f", area1) );
	}
}
