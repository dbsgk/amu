package nested;

public class Outer {
	private String name; //Outer 필드
	public void output() {
		System.out.println("이름: "+name+"\t 나이: "+new Inner().age);
		System.out.println("이름: "+this.name+"\t 나이: "+new Inner().age);
		//Inner클래스 안에 있는 age를 불러오려면 new 생성한뒤 불러줘야함.
		//private이지만 같은 클래스 안에 있어서 접근은 가능함.부를때 생성해야할뿐.
	}
	
	class Inner{
		private int age; //Inner 필드
		
		public void disp() {
			System.out.println("이름: "+name+"\t 나이: "+age);
			System.out.println("이름: "+Outer.this.name+"\t 나이: "+this.age);
			//이너 클래스는 바깥 클래스의 값을 불러올수 있는데 그 반대는 안됨.
		}
	}
	public static void main(String[] args) {
		// Outer생성하면 Inner안만들고 Outer만 생성함(서로 독립적)
		Outer outer = new Outer();
		outer.name = "홍길동";
		System.out.println("이름: "+outer.name);
		
		Outer.Inner inner = outer.new Inner(); // new Outer().new Inner();
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		Outer.Inner inner3 = new Outer().new Inner();//이경우 아우터 객체이름없음.
		inner3.disp();
		//inner3.name = "코난";// (X) 
		//이너 클래스 안 메소드에서는 Outer변수 값을 수정할 수 있는데
		//이렇게 밖에서는 못함.
		
	}
}
/*
Outer.java
Outer.class/ Outer$Inner.class/ 클래스파일보면 $표시로 이너임을 알림.
 */