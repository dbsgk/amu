package for_while_dowhile;

public class WhileTest {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		int a=0;
//		while(a<10) {//a<=10으로 하면 11까지 나옴. 반복문 돌릴때는 앞2자리 뒷2자리 확인하기.
//			a++;
//			System.out.print(a+" ");
//		}
		while(true) {
			a++;
			System.out.print(a+" ");
			if(a==10)break;
		}
	}

}
