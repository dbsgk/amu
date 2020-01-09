package instance;
//메소드
//명령어들의 집합

public class Variable {//자바는 객체지향이라 전부 클래스안에 들어와야함
//클래스 첫글자는 언제나 대문자.
	public static void main(String[] args) {
		//메모리할당
		boolean a;//(boolean은 1byte 공간은 차지하지만  1bit만 사용)
		a = true;
		System.out.println('a');//97출력
		System.out.println("a ="+ a);
		
		char b;//(char는 2byte 16bit)
		b= 'A';// 0000 0000 0100 0001 로 저장됨(빈 곳은 0으로 채움)
		System.out.println("b= "+b);
		
		char c;
		c = 65;//캐릭터타입에 숫자를 넣으면 아스키코드값으로 읽고 'A'출력.
		//c= 65535;char형 범위의 끝
		//c= 65536;-error 범위를 벗어나면 정수형 기본값인 int형으로 인식; 데이터타입변환하라고 추천함.
		System.out.println("c= "+c);
		
		int d = 65;//(int는 4byte 32bit)
		//0000 0000 0000 0000 0000 0000 0100 0001 로 저장됨(빈 곳은 0으로 채움)
		System.out.println("d= "+d);
		
		int e= 'A';//아스키코드로 읽어서 65로 나옴
		System.out.println("e= "+e);
		
		int f= (int)25L;//25L은 long형; 소문자,대문자 상관없음;
		//int = long;(x)작은거에 큰거 못넣음; 반대는 가능;
		
		//float g = 43.8; -실수형은 double형이 default값이다.
		float g = 43.8f;//아예 수술한것
		//float g = (float)43.8;잠깐 여장하는것
		
		
		
	}
}

