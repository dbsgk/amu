package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("ChildTest �⺻������");
	}
	public void disp() {
		System.out.println("�̸�= "+name);
		System.out.println("����= "+age);
		System.out.println("������= "+weight);
		System.out.println("Ű= "+height);
	}
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height);//�θ������ �θ����� ù�ٿ� ����� ��.
		//���� �θ�����ڷ� ������,Ű �ҷ��ͼ� �Ʒ�ó�� �� �ʿ����.
		//super.weight = weight;//this.weight = weight;
		//super.height = height;//this.height = height;
		
		System.out.println("ChildTest ������");
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("ȫ�浿",25,79.5,185.3);
		aa.disp();//�θ����׵� ���� �Լ������� ���β����� ���� ã�� ������ �θ� ������.
		System.out.println();
		
		SuperTest bb = new ChildTest("��ġ",16,52.3,162.3);
		bb.disp();//�θ𲨸� �����ؼ� disp�θ� �ҷ����� �˾Ҵµ� �ڽ��� �׻� �켱��.
		
		
	}//main
}//class
