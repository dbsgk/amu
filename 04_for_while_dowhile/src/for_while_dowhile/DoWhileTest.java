package for_while_dowhile;

public class DoWhileTest {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
//		int a=0;
//		do {
//			a++;
//			System.out.print(a+" ");
//		}while(a>=10);
		//A~Z까지 출력하되 1줄에 7개씩 출력하시오
		char c = 'A';
		int count=0;
		do {
			System.out.print(c+" ");
			c++;
			count++;
			if(count%7==0)System.out.println();
		}while(c<='Z') ;

	}

}
//count