package constructor;
//������
class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest(){//public void ConstructorTest() �� �޼ҵ�� ��.
		System.out.println("�⺻������");
		//name = null;
		//age = 0; c���� �̷��� �ʱ�ȭ ����� ��.
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public ConstructorTest(String name) {//������ �����ε�
		this();//���⼭ �⺻������ �ҷ��� "�⺻������"�� ���� ����Ʈ��
		this.name= name;
	}
	public ConstructorTest(int age) {//������ �����ε�
		this("�ڳ�");
		this.age= age;
	}
	//
}
//-------------
public class ConstructorMain {
	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest();
		System.out.println("�̸�: "+ct.getName()+"\t����: "+ct.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("ȫ�浿");
		System.out.println("�̸�: "+bb.getName()+"\t����: "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);//age�� ���޹޴� �����ڿ��� �̸����޹޴� �����ڸ� ȣ��. 
		System.out.println("�̸�: "+cc.getName()+"\t����: "+cc.getAge());
		System.out.println();
		
		
		
	}//main
}//class
