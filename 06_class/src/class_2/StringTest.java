package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";//literal 생성 		heap영역에 생성
		String b = "apple";
		if(a==b)System.out.println("a와 b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다.");
		if(a.equals(b))System.out.println("a와 b의 문자열은 같다.");
		else System.out.println("a와 b의 문자열은 다르다.");
		System.out.println();
		
		String c = new String("apple");//같은 heap영역이어도 literal이랑 new영역이 나뉜대...
		String d = new String("apple");
		if(c==d)System.out.println("c와 d의 참조값은 같다.");
		else System.out.println("c와 d의 참조값은 다르다.");
		if(c.equals(d))System.out.println("c와 d의 문자열은 같다.");
		else System.out.println("c와 d의 문자열은 다르다.");
		System.out.println();
		
		//둘다 주소값 가지고 있대. 근데 literal은 같은 문자를 또 만들어서 그 주소값을 가질수 없대. 
		//literal 새로 만들지 않고 만들어져있는 주소값가져옴. literal은 같은문자=같은주소값, new는 같은문자=다른주소값..
		//싱글톤: 메모리에 딱 한번만 new 만들고 계속 사용하겠다. new로 메모리에 계속 생성하는게 아니고.
		//싱글톤은 static영역사용함.
		
		String e = "오늘 날짜는 "+2019+12+30;//뒤에 숫자끼리 연산먼저하는게 아니라 '앞에서부터' 문자열과 결합해서 전부다 문자열로 출력됨.
		System.out.println("e = "+e);
		
		/*
		문자열은 편집이 안되므로 메모리 4번 생성된다.
		JVM이 알아서 Garbage Collector로 보내서 삭제함.
		Garbage Collector가 실행되면 컴퓨터는 멈춘다.
		오늘 날짜는,
		오늘 날짜는2019,
		오늘 날짜는201912,
		오늘 날짜는20191230  이렇게 메모리에 4번.
		
		메모리 궁금하면 튜닝책 찾아봐라.
		*/
		
		System.out.println("문자열 크기= "+e.length());
		
		for(int i=0;i<e.length();i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출= "+e.substring(7));//7번 문자열부터 끝까지
		System.out.println("부분 문자열 추출= "+e.substring(7,11));//7번 문자열부터 11번 이전까지
		
		System.out.println("대문자 변경= "+"Hello".toUpperCase());//HELLO
		System.out.println("소문자 변경= "+"Hello".toLowerCase());//hello
		
		System.out.println("문자열 검색= "+e.indexOf("짜"));
		System.out.println("문자열 검색= "+e.indexOf("날짜"));
		System.out.println("문자열 검색= "+e.indexOf("개바부"));//찾는 문자열이 없으면 -1출력.
		

	}//main

}//class
