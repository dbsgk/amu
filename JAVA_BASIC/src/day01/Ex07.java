package day01;
//입력
//자바에서의 입력은자바에서 기본적으로 제공하는
//기본 라이브러리 중 Scanner 클래스를 사용하여
//입력을 받게 된다.
//하지만 Scanner는 기본적으로 제공되는 클래스가 아니기 때문에
//사용하려면 import라는 명령어를 통해서 해당 클래스를 로딩해야한다.
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		//Scanner는 클래스이기 때문에
		//객체로 만들어줘야한다.
		//객체란 클래스 변수를 말한다.
		//객체 선언과 초기화 하는 방법:
		//클래스명 객체이름 = new 클래스명()
		Scanner scan = new Scanner(System.in);
		//스캐너에 정의되어있는 다양한 메소드들을 이용해서 우리가 변수에 값을 입력할 수 있게 된다.
		
		//버퍼메모리에  우리가 입력한 정보가 들어가고 거기 있는 정보를 가져옴.
		
		System.out.print("나이를 입력하세요: ");//나이+enter 하면 
		int age= scan.nextInt();//nextInt가 숫자만 가져감. \n 남아있음.
		System.out.print("이름을 입력하세요 : ");
		//nextInt, nextDouble 같은 숫자를 입력받는 메소드는
		//버퍼메모리에 입력되어 있는 enter(\n)을 제외한 숫자만 읽어감.
		//따라서 nextInt, nextDouble 이후에 나오는 nextLine은
		//버퍼 메모리에 남아있는 줄바꿈 문자를 보고서는
		//" 아 사용자가 아무런 입력없이 입력을 종료시켰구나!" 라고 생각하며
		//아무런 문자열값을 입력할 수 없는 버그가 발생하게 된다.
		//이러한 버그를 예방하기 위해서는
		//nextInt, nextDouble을 사용하고 나서
		//nextLine을 단독 실행시켜서 버퍼메모리를 비어주면
		//버퍼 메모리에 엔터키가 없어지기 때문에 정상적으로 문자열을 입력할 수 있다.
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("평균 점수를 입력하세요:");
		double score = scan.nextDouble();
		System.out.println("이름: "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
		
		scan.close();//Scanner는 메모리 잡아먹으니까 메모리 참조를 그만하라고 끝내줌.
		
	}
}
