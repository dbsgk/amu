package class_1;

class Person{//사람을 구별할 수 있도록 만든 클래스
	//이건 그냥 메뉴판. 만들어지진 않은거래.
	//저 아래 메인에서 주문하면 만든대.(객체생성)
	private String name;//필드
	private int age;
//	name="";age=0; 필드는 항상 초기화 되어있음
	
	public void setName(String n) {//구현
		name=n;
	}public void setAge(int a) {
		age=a;
	}
	public void setData(String n, int a) {
		name=n;
		age=a;
	}
	public void setData() {}//	name="";age=0; 필드는 항상 초기화 되어있음. 그래서 안에 아무것도 없어도 초기값 뜸.

	public String getName() {//값 보내줌
		return name;
	}public int getAge() {
		return age;
	}
}
//-------------------------------------------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa;
		aa = new Person();//aa는 Person클래스의 주소값을 가지고 있는 애.(객체: 클래스형 변수지만 그렇게 안부르고 그냥 객체라고 함.)
		//int i(정수형 변수), double d(실수형 변수), char ch(문자형 변수) 는 데이터를 직접 가지고 있는 애.
		//aa.name="홍길동";//aa가 주문한 name
		//aa.age=25;
		System.out.println("객체 aa="+aa);
		aa.setName("홍길동");//메소드 호출: 변수를 아무나 못건들이게 private설정해서 메소드를 통해서 값 입력.
		aa.setAge(25);
		System.out.println("이름 = "+aa.getName()+"\t 나이="+aa.getAge());//메소드 호출해서 값 받아옴.
		System.out.println();
		
		Person bb =new Person();//같은 클래스를 다른애가 또 주문했어. 다른 애니까 주소값 달라.
		System.out.println("객체 bb="+bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름 = "+bb.getName()+"\t 나이="+bb.getAge());
		System.out.println();
		
		Person cc =new Person();
		System.out.println("객체 cc="+cc);
		cc.setData("또치",30);
		System.out.println("이름 = "+cc.getName()+"\t 나이="+cc.getAge());
		//Person이라는 몰드에서 aa,bb,cc라는 객체를 각각 찍어내는거야.
		
		Person dd =new Person();
		System.out.println("객체 dd="+dd);
		dd.setData();
//		name="";age=0; 필드는 항상 초기화 되어있음. 그래서 안에 아무것도 없어도 초기값 뜸.
		System.out.println("이름 = "+dd.getName()+"\t 나이="+dd.getAge());
		
	}//main

}//main class
