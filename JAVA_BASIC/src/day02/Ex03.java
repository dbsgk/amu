package day02;
//다중 for loop
//다중 for loop의 경우
//바깥쪽 for loop가 한번 실행될 때
//안쪽 for loop는 처음부터 끝까지 다 돌게 된다.
public class Ex03 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<3;j++) {
				System.out.println("i:"+i+"j:"+j);
			}
		}
	}
}
