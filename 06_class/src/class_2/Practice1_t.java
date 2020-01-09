package class_2;
//indexOf 예제였어. replace는 그냥 들러리고... 게다가 Stringbuffer도 아니고 걍 String클래스...
import java.util.Scanner;

public class Practice1_t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//위치
		int count=0;//개수
		
		System.out.print("문자열 입력: ");
		String str=sc.next().toLowerCase();
		
		System.out.print("현재 문자열 입력: ");
		String target = sc.next().toLowerCase();
		
		System.out.print("바꿀 문자열 입력: ");
		String replacing = sc.next();
		
		if(str.length()<target.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			return;//벗어나라. 더이상 수행하지 말고. while의 break;같은거임.
		}
		
		str = str.toLowerCase();//str.toLowerCase()이렇게만 쓰면 원본이 바뀌지 않음.
		target = target.toLowerCase();
		
		while((index = str.indexOf(target,index))!=-1) {
			index += target.length();
			count++;
		}//while
		
		System.out.println(str.replace(target, replacing));
		System.out.println(count+"개 치환");
		
	}//main

}//class
