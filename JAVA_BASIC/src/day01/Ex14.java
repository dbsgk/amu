package day01;
//switch문 예제
public class Ex14 {
	public static void main(String[] args) {
		int myNumber = 5;
		switch(myNumber) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("그외입니다.");
			break;
		}
	}
}
