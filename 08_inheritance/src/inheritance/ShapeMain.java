package inheritance;
//오버라이드 예제
import java.util.Scanner;

class ShapeTest{
	protected Scanner scan = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다.");//SamTest에서 해당 메소드를 오버라이드해서 이 문장을 절대 안나옴.
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");//이것도 자식클래스에서 오버라이드해서 이 문장 절대 안나옴.
	}
	
	//추상메소드가 필요한 이유.
	//이렇게 자식이 오버라이드 한 경우에 부모메소드는 실행도 안되는데 문장들이 
	//메모리를 차지하고 자식객체 생성할때마다 불려와서 이름만 남기는 추상메소드를 만드는 거다.
	
	//모든 자식을 참조할 수 있는건 부모밖에 없다. 아 그래서..오버라이드하면 무조건 자식꺼..아 그래서구나
	//자식을 참조해서 맘대로 이것저것 사용. 이자식 저자식 클래스 아무거나 다 가능. 부모가 리모컨, 자식이 TV들
	
	
	
	
}//ShapeTest
//-----------------------------------------------------------------------------------------------------------------------
class SamTest extends ShapeTest {
	private int base,height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변: ");
		base = scan.nextInt();
		System.out.print("높이: ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = base*height/2.;
	}
	public void dispArea() {
		System.out.println("삼각형 넓이= "+area);
	}
	
}//SamTest
//--------------클래스 경계-------------------------------------------------------------------------------------------------
class SaTest extends ShapeTest{
	//가로*세로
	int width,height;
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로: ");
		width = scan.nextInt();
		System.out.print("세로: ");
		height = scan.nextInt();
	}
	public void calcArea() {
		area = width*height;
	}
	public void dispArea() {
		System.out.println("사각형 넓이= "+area);
	}
}//Satest

//-----------------------------------------------------------------------------------------------------------------------
class SadariTest extends ShapeTest{
	//(윗변+밑변)*높이/2
	int top,bottom,height;
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변: ");
		top = scan.nextInt();
		System.out.print("밑변: ");
		bottom = scan.nextInt();
		System.out.print("높이: ");
		height = scan.nextInt();
	}
	public void calcArea() {
		area = (top+bottom)*height/2;
	}
	public void dispArea() {
		System.out.println("사다리꼴 넓이= "+area);
	}
}//SadariTest
//-----------------------------------------------------------------------------------------------------------------------
public class ShapeMain {

	public static void main(String[] args) {
		ShapeTest shape = new SamTest(); //결합도 낮추기 , 부모는 자식클래스 쓸수 있다. 자식이 커서 부모는 자식한테 맞춰야만 들어간다. 자식 = (자식)부모
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		/*SamTest sam = new SamTest();//SamTest객체생성하면 자동적으로 부모인 ShapeTest생성자도 같이 불러옴. 같은 곳에.
		sam.calcArea();
		sam.dispArea();
		
		SaTest sa = new SaTest();
		sa.calcArea();
		sa.dispArea();
		
		SadariTest sada = new SadariTest();
		sada.calcArea();
		sada.dispArea();*/
	}//main

}//ShapeMain
