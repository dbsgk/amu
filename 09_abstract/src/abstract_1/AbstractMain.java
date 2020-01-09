package abstract_1;

public class AbstractMain extends AbstractTest {

	//추상클래스 상속받으면 무조건 추상메소드 오버라이드 해줘야함.
	//오버라이드 하기 싫으면 본인도 abstract class해주면 됨. 
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//추상클래스는 new생성이 불가능하다.
		//AbstractTest at = new AbstractTest();
		AbstractTest at = new AbstractMain();//자식은 부모꺼도 만듦.
		at.setName("홍길동");//호출: at가 부모라도 setName 오버라이드해서 자식꺼 부름.
		System.out.println("이름 = "+at.getName());
	}
}
