package for_while_dowhile;
//구구단문제
public class MultiFor {

	public static void main(String[] args) {
		int dan,i;
		for(dan=2; dan<=9;dan++) {
			for(i=1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
			System.out.println();
		}
	}

}
