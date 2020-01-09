package inheritance;
//자식한테 부모생성자 생성하기를 요구함.

//부모꺼가 먼저 만들어져야 자식꺼를 사용할 수 있기 때문에
//부모생성자 생성하기를 요구하는거네
//왜냐하면 어차피 전부다 메뉴판만 있는거라 객체생성해야됨.

public class SubTest extends SuperTest{
	//자식클래스의 변수개수: 4개(지꺼 2개, 부모꺼2개)
	private String name;
	private int age;
	public SubTest() {
		System.out.println("SubTest 기본 생성자");

	}
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight;
		super.height = height;//this.height = height;
	}
	
	public void output() {
		System.out.println("이름= "+name);
		System.out.println("나이= "+age);
		System.out.println("몸무게= "+weight);
		System.out.println("키= "+height);
	}
	
	public static void main(String[] args) {
		SubTest aa = new SubTest("홍길동",25,79.5,185.3);//생성자2번호출(자식본인꺼,부모꺼[디폴트생성자])
		//aa를 통해서 {SuperTest, SubTest} 둘다접근가능
		aa.output();
		System.out.println("------------------------");
		aa.disp();//나부터 찾고 없으면 부모한테 찾는다.
		System.out.println();
		
		SuperTest bb = new SubTest("또치",16,52.3,162.3);
		//주소의 참조값이 부모클래스를 참조해서 들어오라고 함.(=부모타입 객체라는말)
		//그래서 bb.output()메소드 부르려고 하면 없다고 나옴.
		
	}//main
}//class
