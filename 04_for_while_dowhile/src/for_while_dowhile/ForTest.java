package for_while_dowhile;

public class ForTest {
	public static void main(String[] args) {
		// for(���ʱ�ġ; ������; ������ġ(��������� ��)){��}
		int i;//main�ȿ����� ����ִ�.
		for (i = 1; i <=10; i++) {
			System.out.println("hello"+i);
		}
		System.out.println("Ż�� i = "+i);
		System.out.println();
		
		//10987654321
		for(i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//ABCDE...Z
		//(int)('A')�̷��� int�� ����ȯ�ؼ� �־��µ� �׷��� �� �ʿ���� �׳� 'A'�̷��� ������ �ȴ�.
		for(i='A';i<='Z';i++) {//int�� charŸ������ ǥ���� ���� ����ȯ �ؾ������� char�� int�� ǥ���� ���� �� �ʿ� ���ٰ�.
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		
	}

}
