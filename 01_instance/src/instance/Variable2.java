package instance;
//유효범위

public class Variable2 {
	int a;//field(전역변수),초기화, 인스턴스 변수
	//a=5; 이건 안됨.
	//선언문만 가능하고 명령문안됨.
	static int b;//field, 초기화, 클래스 변수
	String str;//기본값 null
	
	
	
	public static void main(String[] args) {
		int a; //local variable(지역변수),쓰레기값
		//모든 지역변수는 쓰레기값을 갖고 있어서 반드시 초기화 시켜줘야함.
		a=10;
		System.out.println("지역a="+a);
		System.out.println("필드a="+new Variable2().a);//new로 메모리 만들어주고 a값 가져옴.
		System.out.println("필드b="+Variable2.b);//static으로 메모리 미리 만들어놔서 그대로 가져다 쓸 수 있음.
		System.out.println("필드 str="+new Variable2().str);//일회용; new 가끔 쓰는걸 선호.
		
		
		//8진수 표현int a=08;
		
		
		
		
		
		
	}
}