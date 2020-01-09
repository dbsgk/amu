package for_while_dowhile;
/*A~Z 무작위로 100개를 출력하시오
 * 1줄당 10개씩 출력하세요
 * [실행결과]
 * F S D L L W ... 
 * 이 중에서 A가 몇개인지 출력하시오
 * A의 개수 = 6;
 * */

public class ForTest_RandomEx {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=100; i++) {
			int r = (int)(Math.random()*26)+65;
			System.out.print((char)r+" ");
			if(i%10==0)System.out.println();
			if(r=='A')count++;
			
		}System.out.println("A의 개수 = "+count);
	}

}
