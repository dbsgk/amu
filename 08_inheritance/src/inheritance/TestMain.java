package inheritance;
class Test{//class 앞에 (default)있는거야.
	int a,b;//private int a,b;//이 클래스 안에만
	//요 파일 안에 있는 애들은 써도 된다 : (default)
	
}
//-------------------------  클래스 구분 -----------------------------------------------------------------------------
public class TestMain {

	public static void main(String[] args) {
		Test aa = new Test();
		Test bb = aa; //같은 주소값을 가진다.
		aa.a = 2;
		aa.b = 5;
		System.out.println(aa.a+"\t"+aa.b);// 2  5
		System.out.println(bb.a+"\t"+bb.b);// 2  5
		System.out.println();
		
		bb.a=7; //그래서 bb에서 값을 변경하면 aa의 값도 변경된다. 같은 주소값을 쓰고 있는거니까.
		bb.b=9;
		System.out.println(aa.a+"\t"+aa.b);// 7  9
		System.out.println(bb.a+"\t"+bb.b);// 7  9
		System.out.println();
		
		bb= new Test();//다른 주소값을 쓰니까 aa와 이제 관련없음.
		bb.a=10; 
		bb.b=20;
		System.out.println(aa.a+"\t"+aa.b);// 7  9
		System.out.println(bb.a+"\t"+bb.b);// 10 20
		System.out.println();
		
	}

}
