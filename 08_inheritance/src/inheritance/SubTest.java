package inheritance;
//�ڽ����� �θ������ �����ϱ⸦ �䱸��.

//�θ𲨰� ���� ��������� �ڽĲ��� ����� �� �ֱ� ������
//�θ������ �����ϱ⸦ �䱸�ϴ°ų�
//�ֳ��ϸ� ������ ���δ� �޴��Ǹ� �ִ°Ŷ� ��ü�����ؾߵ�.

public class SubTest extends SuperTest{
	//�ڽ�Ŭ������ ��������: 4��(���� 2��, �θ�2��)
	private String name;
	private int age;
	public SubTest() {
		System.out.println("SubTest �⺻ ������");

	}
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest ������");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight;
		super.height = height;//this.height = height;
	}
	
	public void output() {
		System.out.println("�̸�= "+name);
		System.out.println("����= "+age);
		System.out.println("������= "+weight);
		System.out.println("Ű= "+height);
	}
	
	public static void main(String[] args) {
		SubTest aa = new SubTest("ȫ�浿",25,79.5,185.3);//������2��ȣ��(�ڽĺ��β�,�θ�[����Ʈ������])
		//aa�� ���ؼ� {SuperTest, SubTest} �Ѵ����ٰ���
		aa.output();
		System.out.println("------------------------");
		aa.disp();//������ ã�� ������ �θ����� ã�´�.
		System.out.println();
		
		SuperTest bb = new SubTest("��ġ",16,52.3,162.3);
		//�ּ��� �������� �θ�Ŭ������ �����ؼ� ������� ��.(=�θ�Ÿ�� ��ü��¸�)
		//�׷��� bb.output()�޼ҵ� �θ����� �ϸ� ���ٰ� ����.
		
	}//main
}//class
