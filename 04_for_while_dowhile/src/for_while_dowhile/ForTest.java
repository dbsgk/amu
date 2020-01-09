package for_while_dowhile;

public class ForTest {
	public static void main(String[] args) {
		// for(①초기치; ②조건; ④증감치(내용수행한 후)){③}
		int i;//main안에서만 살아있다.
		for (i = 1; i <=10; i++) {
			System.out.println("hello"+i);
		}
		System.out.println("탈출 i = "+i);
		System.out.println();
		
		//10987654321
		for(i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//ABCDE...Z
		//(int)('A')이렇게 int로 형변환해서 넣었는데 그렇게 할 필요없이 그냥 'A'이렇게 넣으면 된다.
		for(i='A';i<='Z';i++) {//int를 char타입으로 표현할 때는 형변환 해야하지만 char를 int로 표현할 때는 할 필요 없다고.
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		
	}

}
