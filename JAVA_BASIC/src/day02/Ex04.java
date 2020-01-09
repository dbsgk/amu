package day02;
//1~100까지의 소수를 출력하는 프로그램
//소수란? 1과 자기 자신 외에는 약수가 없는 숫자
//소수=약수의 개수가 2개인숫자
//약수= 나머지가 0인숫자
public class Ex04 {
	public static void main(String[] args) {
		Ex03.main(args);//static 예제. static붙어있으면 다른 메소드에서도 얼마든지 불러다 쓸 수 있음
		for(int i=1;i<=100;i++) {
			//i는 약수인지 아닌지 검사받을 숫자가 된다.
			int count = 0;//약수의 개수를 저장할 공간.
			for(int j=1; j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+"는 소수입니다.");
			}
		}
	}
}
