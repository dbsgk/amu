package class_1;

 class This {
	private String name;
	private int age;
	public void setName(String n) {//구현
		name=n;//(this.)name this가 항상 붙어있다.
	}
	public void setAge(int age) {
		this.age=age;//지역변수와 이름이 겹칠 때는 this를 붙여줘서 클래스변수(필드)와 지역변수 구분해준다.
	}
	public String getName() {//값 보내줌
		return name;
	}
	public int getAge() {
		return age;
	}
	
	

}
public class ThisTest{
	public static void main(String[] args) {//static에는 this. 없음; class안에만 있음
		This tt = new This();
		System.out.println("객체tt: "+tt);
		tt.setName("홍길동");
		tt.setAge( 28);
		System.out.println("이름 = "+tt.getName()+"\t 나이="+tt.getAge());
		System.out.println();
		
		This t2 = new This();
		System.out.println("객체t2: "+t2);
		t2.setName("또치");
		t2.setAge( 30);
		System.out.println("이름 = "+t2.getName()+"\t 나이="+t2.getAge());
	}
}
