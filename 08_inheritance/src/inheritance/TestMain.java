package inheritance;
class Test{//class �տ� (default)�ִ°ž�.
	int a,b;//private int a,b;//�� Ŭ���� �ȿ���
	//�� ���� �ȿ� �ִ� �ֵ��� �ᵵ �ȴ� : (default)
	
}
//-------------------------  Ŭ���� ���� -----------------------------------------------------------------------------
public class TestMain {

	public static void main(String[] args) {
		Test aa = new Test();
		Test bb = aa; //���� �ּҰ��� ������.
		aa.a = 2;
		aa.b = 5;
		System.out.println(aa.a+"\t"+aa.b);// 2  5
		System.out.println(bb.a+"\t"+bb.b);// 2  5
		System.out.println();
		
		bb.a=7; //�׷��� bb���� ���� �����ϸ� aa�� ���� ����ȴ�. ���� �ּҰ��� ���� �ִ°Ŵϱ�.
		bb.b=9;
		System.out.println(aa.a+"\t"+aa.b);// 7  9
		System.out.println(bb.a+"\t"+bb.b);// 7  9
		System.out.println();
		
		bb= new Test();//�ٸ� �ּҰ��� ���ϱ� aa�� ���� ���þ���.
		bb.a=10; 
		bb.b=20;
		System.out.println(aa.a+"\t"+aa.b);// 7  9
		System.out.println(bb.a+"\t"+bb.b);// 10 20
		System.out.println();
		
	}

}
