package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}//������(���� 2��)
	public void disp() {
		System.out.println("������= "+weight);
		System.out.println("Ű= "+height);
	}
	public SuperTest() {
		System.out.println("SuperTest �⺻������");
	}
}//class
