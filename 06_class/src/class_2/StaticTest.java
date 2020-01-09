package class_2;
//코드

//static(스태틱): 프로그램이 종료될떄 소멸.(=한번잡아놓으면 끝까지 살아있다)
//				this값 못쓴다. 스태틱변수(클래스변수)는 인스턴스변수와 다른 공간에 있어서 부를 수 없다.
//				모든 객체가 공유하는 변수(아무리 많은 객체가 생겨도 b는 하나, a는 인스턴스변수라 객체수만큼 생김),스태틱메소드 안에서 인스턴스변수 부를수 없어.

//Stack(스택) : 메모리 가장 많이 잡는 공간. ; 메소드안에 있는 지역변수 요기있어. 구역벗어날떄 소멸.

//나머지가 heap영역: new해서 만들고, 사용자가 연결끊으면 JVM(Garbage Collector)가 삭제시킴.

/*
 * [실행결과]
a=1	 b=1

a=1	 b=2

a=1	 b=3
  
*/
public class StaticTest {
	private int a;//필드, 인스턴스 변수
	private static int b;//필드, 클래스변수; 스태틱변수는 아무리 클래스 객체생성을 많이해도 1번만 생성된다.
	
	static {
		System.out.println("static 초기화 영역");
		b=3;
		//스태틱변수는 스태틱영역에서 초기화가능.
	}
	public static void output() {
		System.out.println("static method....");
		//System.out.println("a="+this.a+"\t b="+StaticTest.b);
		//static 메소드 안에서 this.a 사용하려고 하면 에러뜸. static에선 static만.
	}
	public void disp() {
		System.out.println("a="+this.a+"\t b="+StaticTest.b);
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		//스태틱 메소드 부르는 법 3가지
		StaticTest.output();//클래스.
		output();//그냥 함수명만
		st.output();//객체. 근데 st.b /st2.b/st3.b 전부다 같은 b를 가리킴. 
		
		
	}
	private void calc() {
		a++;
		b++;
	}
	public StaticTest() {//내가 갖고있는 변수를 초기화 시켜주는 것.
		System.out.println("기본 생성자");
		a=3;
	}//생성자는 new할때 불려옴.(클래스 객체 생성될 때)
	
}
