package day02;
//로또번호 제작기 1번
//배열을 사용한 원시적인 방법
import java.util.Random;
public class Ex07 {
	private final static int SIZE = 6;
	private final static int MAX = 45;//로또번호, 그냥 숫자로 입력하면 나중에 값을 변경할때 일일이 변경해야함.
	public static void main(String[] args) {
		//Random클래스는 난수 제작을 할때 쓰는 클래스이다.
		//내부적으로 0~1까지의 수많은 실수들이 있고
		//그 실수를 하나씩 뽑아서 곱해줘서 원하는 int나 double을 만들어주게 된다.
		Random r = new Random();
		//System.out.println(r.nextInt(45)+1);//0~44까지 나오니까 +1해줌
		int[] lottoNumbers = new int[SIZE];
		for(int i = 0; i< lottoNumbers.length; i++) {
			lottoNumbers[i] = r.nextInt(MAX)+1;
			//lottoNumbers[i] = r.nextInt(45)+1;
		}
		
		
		//향상된 for loop 써보기
		//for loop의 경우 배열이나 arrayList등의 같은 데이터타입이 모여있는
		//변수를 출력할 때 하나하나의 요소를 복사해서 출력하는 방법이 있다.
		System.out.println("--중복제거전--------");
		for(int i: lottoNumbers) {
			System.out.println(i);
		}
		
		//중복제거를 위해 2중 for loop를 쓸것이다.
		//i번째 요소를 기준으로 해서 j번째 요소가 같은지 비교를 하고
		//같으면 i번째 요소를 다시 난수생성해서 넣어준다.
		//넣고 나서는 j를 0으로 돌려보낸다.
		
		for(int i =0; i< lottoNumbers.length; i++) {
			for(int j =0;j<lottoNumbers.length;j++) {
				if(lottoNumbers[i] == lottoNumbers[j] && i != j ) {
					System.out.println(i+"번째가 중복입니다!");
					lottoNumbers[i] = r.nextInt(MAX)+1;
					j =-1;
				}
			}
			
		}
		System.out.println("---중복제거후---------");
		for(int i: lottoNumbers) {
			System.out.println(i);
		}
		//프로그램은 값을 주고받을 때 임시저장할 곳이 필요하다.
		/*int a=3;
		int b=5;
		int temp = a;
		int b= temp;*/
		for(int i=0; i<lottoNumbers.length-1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1]=temp;
				i=-1;
			}
		}
		System.out.println("---정렬후----");
		for(int i : lottoNumbers) {
			System.out.println(i);
		}
		
	}
	
}
