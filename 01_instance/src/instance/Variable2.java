package instance;
//��ȿ����

public class Variable2 {
	int a;//field(��������),�ʱ�ȭ, �ν��Ͻ� ����
	//a=5; �̰� �ȵ�.
	//���𹮸� �����ϰ� ��ɹ��ȵ�.
	static int b;//field, �ʱ�ȭ, Ŭ���� ����
	String str;//�⺻�� null
	
	
	
	public static void main(String[] args) {
		int a; //local variable(��������),�����Ⱚ
		//��� ���������� �����Ⱚ�� ���� �־ �ݵ�� �ʱ�ȭ ���������.
		a=10;
		System.out.println("����a="+a);
		System.out.println("�ʵ�a="+new Variable2().a);//new�� �޸� ������ְ� a�� ������.
		System.out.println("�ʵ�b="+Variable2.b);//static���� �޸� �̸� �������� �״�� ������ �� �� ����.
		System.out.println("�ʵ� str="+new Variable2().str);//��ȸ��; new ���� ���°� ��ȣ.
		
		
		//8���� ǥ��int a=08;
		
		
		
		
		
		
	}
}