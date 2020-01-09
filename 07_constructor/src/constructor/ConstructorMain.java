package constructor;
//생성자
class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest(){//public void ConstructorTest() 는 메소드로 됨.
		System.out.println("기본생성자");
		//name = null;
		//age = 0; c언어는 이렇게 초기화 해줘야 함.
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public ConstructorTest(String name) {//생성자 오버로드
		this();//여기서 기본생성자 불러서 "기본생성자"가 전부 프린트됨
		this.name= name;
	}
	public ConstructorTest(int age) {//생성자 오버로드
		this("코난");
		this.age= age;
	}
	//
}
//-------------
public class ConstructorMain {
	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest();
		System.out.println("이름: "+ct.getName()+"\t나이: "+ct.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.println("이름: "+bb.getName()+"\t나이: "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);//age만 전달받는 생성자에서 이름전달받는 생성자를 호출. 
		System.out.println("이름: "+cc.getName()+"\t나이: "+cc.getAge());
		System.out.println();
		
		
		
	}//main
}//class
