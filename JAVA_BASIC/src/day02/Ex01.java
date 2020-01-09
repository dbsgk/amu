package day02;
//반복문1 -  for loop
//for loop 은 주로 정해진 횟수만큼 돌아가면서 반복된다.
//흔한 예로 배열, ArrayList등의 연결된 형태의
//변수를 출력하거나 입력할때 사용된다.
public class Ex01 {
	public static void main(String[] args) {
		//1~10까지 출력
		for(int i= 9; i<=12; i++) {
			//여기서 선언된 i는 9~12번 코드블락안에서만 사용가능
			//변수는 scope 라는 것이 있는데
			//scope란 해당 변수를 사용가능한 범위라고 보면된다.
			//해당 scope를 벗어날 시에는 해당 변수는 사용할 수 없다.
			//전역변수는 거의사용안함. 서버에 사용하는데 서버는 자바로 잘 안만듦.
			System.out.println(i);
		}//메모리주소는 달라도 정보는 같으니까 같은 정보는 같은 객체
	}
}
