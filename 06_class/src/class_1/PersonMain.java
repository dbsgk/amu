package class_1;

class Person{//����� ������ �� �ֵ��� ���� Ŭ����
	//�̰� �׳� �޴���. ��������� �����ŷ�.
	//�� �Ʒ� ���ο��� �ֹ��ϸ� �����.(��ü����)
	private String name;//�ʵ�
	private int age;
//	name="";age=0; �ʵ�� �׻� �ʱ�ȭ �Ǿ�����
	
	public void setName(String n) {//����
		name=n;
	}public void setAge(int a) {
		age=a;
	}
	public void setData(String n, int a) {
		name=n;
		age=a;
	}
	public void setData() {}//	name="";age=0; �ʵ�� �׻� �ʱ�ȭ �Ǿ�����. �׷��� �ȿ� �ƹ��͵� ��� �ʱⰪ ��.

	public String getName() {//�� ������
		return name;
	}public int getAge() {
		return age;
	}
}
//-------------------------------------------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa;
		aa = new Person();//aa�� PersonŬ������ �ּҰ��� ������ �ִ� ��.(��ü: Ŭ������ �������� �׷��� �Ⱥθ��� �׳� ��ü��� ��.)
		//int i(������ ����), double d(�Ǽ��� ����), char ch(������ ����) �� �����͸� ���� ������ �ִ� ��.
		//aa.name="ȫ�浿";//aa�� �ֹ��� name
		//aa.age=25;
		System.out.println("��ü aa="+aa);
		aa.setName("ȫ�浿");//�޼ҵ� ȣ��: ������ �ƹ��� ���ǵ��̰� private�����ؼ� �޼ҵ带 ���ؼ� �� �Է�.
		aa.setAge(25);
		System.out.println("�̸� = "+aa.getName()+"\t ����="+aa.getAge());//�޼ҵ� ȣ���ؼ� �� �޾ƿ�.
		System.out.println();
		
		Person bb =new Person();//���� Ŭ������ �ٸ��ְ� �� �ֹ��߾�. �ٸ� �ִϱ� �ּҰ� �޶�.
		System.out.println("��ü bb="+bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸� = "+bb.getName()+"\t ����="+bb.getAge());
		System.out.println();
		
		Person cc =new Person();
		System.out.println("��ü cc="+cc);
		cc.setData("��ġ",30);
		System.out.println("�̸� = "+cc.getName()+"\t ����="+cc.getAge());
		//Person�̶�� ���忡�� aa,bb,cc��� ��ü�� ���� ���°ž�.
		
		Person dd =new Person();
		System.out.println("��ü dd="+dd);
		dd.setData();
//		name="";age=0; �ʵ�� �׻� �ʱ�ȭ �Ǿ�����. �׷��� �ȿ� �ƹ��͵� ��� �ʱⰪ ��.
		System.out.println("�̸� = "+dd.getName()+"\t ����="+dd.getAge());
		
	}//main

}//main class
