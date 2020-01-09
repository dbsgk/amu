package day01;
//증감 연산자
//++ --
//현재 값을 1씩 더하거나 빼서 다시 넣어준다.
//하지만 증감연산자는 앞에 붙냐 뒤에 붙냐에 따라서 그 결과가 달라진다.
public class Ex04 {
	public static void main(String[] args) {
		int myNumber = 10;
		System.out.println(myNumber++);//출력후 더함
		System.out.println(myNumber);
		System.out.println(++myNumber);//더하고 출력함
		System.out.println(myNumber);
	}
}
