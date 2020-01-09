package instance;
//숙제
//조건1) 데이터는 현빈, 개발부, 대리, 1500000로 대입
//		변수명은 각각 name, department, posotion, salary로 할 것
//[실행결과]
//이름:현빈
//부서:개발부
//직위:대리
//급여:1500000원

//문제1
//정수 50, 실수 178.5, 문자'A', boolean 값 true, 문자열"홍길동"을 변수에 저장하고 출력하세요.

public class Practice1 {
	public static void main(String[] args) {
		int a = 50;
		double b = 178.5;
		char c = 'A';
		boolean d = true;//c언어 1:참 0:거짓
		String e = "홍길동";
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
		
		/*
		 * String name="현빈"; String department ="개발부"; String position = "대리"; int
		 * salary =1500000;
		 * System.out.println("이름:"+name+"\n 부서:"+department+"\n 직위:"+position+"\n 급여:"
		 * +salary+"원");
		 */
		int i = 50;
		double db = 178.5;
		char ch = 'A';
		boolean bl = true;
		String str = "홍길동";
		System.out.println(i+"\t"+db+"\t"+ch+"\t"+bl+"\t"+str);
	}
}
