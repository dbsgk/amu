package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("ChildTest 기본생성자");
	}
	public void disp() {
		System.out.println("이름= "+name);
		System.out.println("나이= "+age);
		System.out.println("몸무게= "+weight);
		System.out.println("키= "+height);
	}
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height);//부모생성자 부르려면 첫줄에 써줘야 함.
		//위에 부모생성자로 몸무게,키 불러와서 아래처럼 할 필요없음.
		//super.weight = weight;//this.weight = weight;
		//super.height = height;//this.height = height;
		
		System.out.println("ChildTest 생성자");
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동",25,79.5,185.3);
		aa.disp();//부모한테도 같은 함수있지만 본인꺼에서 먼저 찾고 없으면 부모꺼 실행함.
		System.out.println();
		
		SuperTest bb = new ChildTest("또치",16,52.3,162.3);
		bb.disp();//부모꺼를 참조해서 disp부모꺼 불러올줄 알았는데 자식이 항상 우선임.
		
		
	}//main
}//class
