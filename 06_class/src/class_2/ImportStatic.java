package class_2;
//클래스.함수명 긴걸 간단하게 쓰려고 할때 import 해놓고 메인에선 함수명만 사용
import static java.lang.Math.*;//Math에 있는 메소드 전부 쓰려고 할떄 *
//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수= "+random());//<--Math.random()이렇게 안쓰고 간단히 쓰려고 import를 static처리해줌.
		out.println("제곱= "+pow(2, 5));//<--Math.pow()
		out.println("소수 이하 2째자리= "+format("%.2f", 12.34567));//String.format()
		//System.out----> out으로 .
		
	}//main

}//class
