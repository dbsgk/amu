package instance;
//

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25>36;//false
		System.out.println("a"+a);//false
		System.out.println("!a="+!a);//true
		System.out.println();//���� ���ڴٴ� ���
		
		//Ŭ���� �޸� ���� - new
		String b = "apple";//���ڿ� literal
		String c = new String("apple");
		System.out.println("b==c: "+(b==c? "����":"�ٸ���"));//�ּҰ�(������)�� ����? �ƴϿ�
		System.out.println("b!=c: "+(b!=c? "��":"����"));
		System.out.println("b.equals(c) : "+(b.equals(c)?"����":"�ٸ���"));
		System.out.println("!b.equals(c) : "+(!b.equals(c)?"����":"�ٸ���"));//equals �����Ҷ��� �Ǿտ� !�ٿ���.

	}
}
