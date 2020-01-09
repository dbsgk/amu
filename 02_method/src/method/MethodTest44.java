package method;
/* 이름(name), 주민번호(id)를 입력하여 성별을 출력하시오 
 * 성별을 구별하는 comp()메소드와 나이를 계산하는 calcAge()메소드를 작성하시오
 * 
 * [실행결과]
 * 이름 입력: 홍길동
 * 주민번호 입력: 001023-3456789(문자열)
 * 2019-2000+1=20
 * 홍길동님은 남자이고 20살입니다
 * 삼항연산자 사용해서 남자여자 구분하기 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest44 {
	int all;//전역변수. like 대통령선거할때 전국민.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//24분쯤 다시.31분쯤메모리.
		
		System.out.print("이름 입력: ");
		String name = br.readLine();
		System.out.print("주민번호 입력: ");
		String id = br.readLine();//주민번호나 폰번호는 -계산해버려서 문자열로 넣어야 한다.
		
		MethodTest44 m44 = new MethodTest44();
		String gender = m44.comp(id);//메서드 호출
		int age = m44.calcAge2(id);
		
		System.out.println(name+"님은 "+gender+"이고 "+age+"살 입니다.");
		
	}
	
	public String comp(String id) {//반환값을 모를때는 일단 void로 해놓고 나중에 리턴형식 작성해주면됨; public void comp(String id)
		String gender = id.charAt(7)=='1'||id.charAt(7)=='3'? "남자":"여자";
		return gender;
	}
	public int calcAge(String id) {
		//1. 첫번째,두번째 숫자를 int 변수에 숫자로 담고
		//2. 주민번호 뒷자리 첫번째 숫자가 1,2면 1900년대 계산하고 3,4면 2000년대로 계산해서 int 변수에 담은후 리턴.
		
		int num = Integer.parseInt(id.substring(0, 2));
		int age = id.charAt(7)=='1'||id.charAt(7)=='2'?2019-(1900+num)+1:2019-(2000+num)+1;
		
		return age;
	}
	public int calcAge1(String id) {
		//성별결정번호Id 를  
		//num = id 8번째 숫자 
		int num = (int)(id.charAt(7))-48;//1,2or3,4
		System.out.println(num);
		//num2 = id 1,2번째 글자
		int num2 = Integer.parseInt(id.substring(0, 2));
		//age를 1,2면 1900년대생 3,4면 2000년대생 계산식적용해 구한다.
		int age = num <3 ? 2019-(num2+1900)+1:2019-(num2+2000)+1;
		//age 리턴한다.
		return age;
	}
	public int calcAge2(String id) {
		int fnum = (int)id.charAt(7);
		int num = Integer.parseInt(id.substring(0, 2));
		int age = fnum==1 ||fnum==2? 2019-(1900+num)+1:2019-(2000+num)+1;
		//int age = id.charAt(7)=='1'||id.charAt(7)=='2'? 2019-(1900+num)+1:2019-(2000+num)+1;
		return age;
	}
}
