package class_1;

 class This {
	private String name;
	private int age;
	public void setName(String n) {//����
		name=n;//(this.)name this�� �׻� �پ��ִ�.
	}
	public void setAge(int age) {
		this.age=age;//���������� �̸��� ��ĥ ���� this�� �ٿ��༭ Ŭ��������(�ʵ�)�� �������� �������ش�.
	}
	public String getName() {//�� ������
		return name;
	}
	public int getAge() {
		return age;
	}
	
	

}
public class ThisTest{
	public static void main(String[] args) {//static���� this. ����; class�ȿ��� ����
		This tt = new This();
		System.out.println("��ütt: "+tt);
		tt.setName("ȫ�浿");
		tt.setAge( 28);
		System.out.println("�̸� = "+tt.getName()+"\t ����="+tt.getAge());
		System.out.println();
		
		This t2 = new This();
		System.out.println("��üt2: "+t2);
		t2.setName("��ġ");
		t2.setAge( 30);
		System.out.println("�̸� = "+t2.getName()+"\t ����="+t2.getAge());
	}
}
