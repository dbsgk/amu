package for_while_dowhile;
//구구단2
//자주변하는게 안쪽
//덜변하는게 바깥쪽
public class MultiFor2 {

	public static void main(String[] args) {
		int dan,i;
		for(i=1;i<=9;i++) {
			for(dan=2;dan<=9;dan++) {
				System.out.print(dan+"*"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}

}
