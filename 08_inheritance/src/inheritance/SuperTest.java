package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}//생성자(인자 2개)
	public void disp() {
		System.out.println("몸무게= "+weight);
		System.out.println("키= "+height);
	}
	public SuperTest() {
		System.out.println("SuperTest 기본생성자");
	}
}//class
