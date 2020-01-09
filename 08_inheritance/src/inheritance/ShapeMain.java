package inheritance;
//�������̵� ����
import java.util.Scanner;

class ShapeTest{
	protected Scanner scan = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest �⺻ ������");
	}
	public void calcArea() {
		System.out.println("������ ����մϴ�.");//SamTest���� �ش� �޼ҵ带 �������̵��ؼ� �� ������ ���� �ȳ���.
	}
	public void dispArea() {
		System.out.println("������ ����մϴ�.");//�̰͵� �ڽ�Ŭ�������� �������̵��ؼ� �� ���� ���� �ȳ���.
	}
	
	//�߻�޼ҵ尡 �ʿ��� ����.
	//�̷��� �ڽ��� �������̵� �� ��쿡 �θ�޼ҵ�� ���൵ �ȵǴµ� ������� 
	//�޸𸮸� �����ϰ� �ڽİ�ü �����Ҷ����� �ҷ��ͼ� �̸��� ����� �߻�޼ҵ带 ����� �Ŵ�.
	
	//��� �ڽ��� ������ �� �ִ°� �θ�ۿ� ����. �� �׷���..�������̵��ϸ� ������ �ڽĲ�..�� �׷�������
	//�ڽ��� �����ؼ� ����� �̰����� ���. ���ڽ� ���ڽ� Ŭ���� �ƹ��ų� �� ����. �θ� ������, �ڽ��� TV��
	
	
	
	
}//ShapeTest
//-----------------------------------------------------------------------------------------------------------------------
class SamTest extends ShapeTest {
	private int base,height;
	
	public SamTest() {
		System.out.println("SamTest �⺻������");
		System.out.print("�غ�: ");
		base = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = base*height/2.;
	}
	public void dispArea() {
		System.out.println("�ﰢ�� ����= "+area);
	}
	
}//SamTest
//--------------Ŭ���� ���-------------------------------------------------------------------------------------------------
class SaTest extends ShapeTest{
	//����*����
	int width,height;
	public SaTest() {
		System.out.println("SaTest �⺻������");
		System.out.print("����: ");
		width = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	public void calcArea() {
		area = width*height;
	}
	public void dispArea() {
		System.out.println("�簢�� ����= "+area);
	}
}//Satest

//-----------------------------------------------------------------------------------------------------------------------
class SadariTest extends ShapeTest{
	//(����+�غ�)*����/2
	int top,bottom,height;
	public SadariTest() {
		System.out.println("SadariTest �⺻������");
		System.out.print("����: ");
		top = scan.nextInt();
		System.out.print("�غ�: ");
		bottom = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	public void calcArea() {
		area = (top+bottom)*height/2;
	}
	public void dispArea() {
		System.out.println("��ٸ��� ����= "+area);
	}
}//SadariTest
//-----------------------------------------------------------------------------------------------------------------------
public class ShapeMain {

	public static void main(String[] args) {
		ShapeTest shape = new SamTest(); //���յ� ���߱� , �θ�� �ڽ�Ŭ���� ���� �ִ�. �ڽ��� Ŀ�� �θ�� �ڽ����� ����߸� ����. �ڽ� = (�ڽ�)�θ�
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		/*SamTest sam = new SamTest();//SamTest��ü�����ϸ� �ڵ������� �θ��� ShapeTest�����ڵ� ���� �ҷ���. ���� ����.
		sam.calcArea();
		sam.dispArea();
		
		SaTest sa = new SaTest();
		sa.calcArea();
		sa.dispArea();
		
		SadariTest sada = new SadariTest();
		sada.calcArea();
		sada.dispArea();*/
	}//main

}//ShapeMain
