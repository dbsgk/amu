package inheritance;
class AA{
	public int a = 3;
	public void disp() {
		a+=5;
		System.out.println("AA: "+a+" ");
	}
}
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a +=5;
		System.out.println("BB: "+a+" ");
	}
}

public class TestMain2 {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();//BB: 13 (AA의 함수는 오버라이드 되서 안나온다.)
		System.out.println(bb.a+" ");// 13 // this.a에 값을 넣어서 8이 아니라 13이야.
		
		
		AA aa = new BB();//부모 = new 자식
		aa.disp();
		System.out.println(aa.a + " ");//변수는 오버라이드가 없다(함수에만)
		
		BB bb2 = (BB)aa;//자식 = (자식)부모
		
		System.out.println(bb2.a+" ");
   	}//main
}//class