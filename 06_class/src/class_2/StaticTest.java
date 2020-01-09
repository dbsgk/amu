package class_2;
//�ڵ�

//static(����ƽ): ���α׷��� ����ɋ� �Ҹ�.(=�ѹ���Ƴ����� ������ ����ִ�)
//				this�� ������. ����ƽ����(Ŭ��������)�� �ν��Ͻ������� �ٸ� ������ �־ �θ� �� ����.
//				��� ��ü�� �����ϴ� ����(�ƹ��� ���� ��ü�� ���ܵ� b�� �ϳ�, a�� �ν��Ͻ������� ��ü����ŭ ����),����ƽ�޼ҵ� �ȿ��� �ν��Ͻ����� �θ��� ����.

//Stack(����) : �޸� ���� ���� ��� ����. ; �޼ҵ�ȿ� �ִ� �������� ����־�. ��������� �Ҹ�.

//�������� heap����: new�ؼ� �����, ����ڰ� ��������� JVM(Garbage Collector)�� ������Ŵ.

/*
 * [������]
a=1	 b=1

a=1	 b=2

a=1	 b=3
  
*/
public class StaticTest {
	private int a;//�ʵ�, �ν��Ͻ� ����
	private static int b;//�ʵ�, Ŭ��������; ����ƽ������ �ƹ��� Ŭ���� ��ü������ �����ص� 1���� �����ȴ�.
	
	static {
		System.out.println("static �ʱ�ȭ ����");
		b=3;
		//����ƽ������ ����ƽ�������� �ʱ�ȭ����.
	}
	public static void output() {
		System.out.println("static method....");
		//System.out.println("a="+this.a+"\t b="+StaticTest.b);
		//static �޼ҵ� �ȿ��� this.a ����Ϸ��� �ϸ� ������. static���� static��.
	}
	public void disp() {
		System.out.println("a="+this.a+"\t b="+StaticTest.b);
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		//����ƽ �޼ҵ� �θ��� �� 3����
		StaticTest.output();//Ŭ����.
		output();//�׳� �Լ���
		st.output();//��ü. �ٵ� st.b /st2.b/st3.b ���δ� ���� b�� ����Ŵ. 
		
		
	}
	private void calc() {
		a++;
		b++;
	}
	public StaticTest() {//���� �����ִ� ������ �ʱ�ȭ �����ִ� ��.
		System.out.println("�⺻ ������");
		a=3;
	}//�����ڴ� new�Ҷ� �ҷ���.(Ŭ���� ��ü ������ ��)
	
}
