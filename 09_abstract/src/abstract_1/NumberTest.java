package abstract_1;
//추상클래스 : 날짜,숫자, 원화 형식지정
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat(); //자식클래스를 이용한 추상클래스 생성.
		//3자리마다, 찍고 소수이하 3쨰자리(기본설정)
		System.out.println(nf.format(12345678.456789)); //12,345,678.457
		System.out.println(nf.format(12345678)); //12,345,678 (소수이하 없어서 표시안함)

		System.out.println();
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌것은 표시하지 않는다.
		System.out.println(nf2.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf2.format(12345678)); //12,345,678원

		System.out.println();
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시
		System.out.println(nf3.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf3.format(12345678)); //12,345,678.00원
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance();//메소드를 이용한 추상클래스 생성.
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); //원화 표시
		nf4.setMaximumFractionDigits(2);//소수점이하 둘째자리까지 표시하겠다는 메소드
		nf4.setMinimumFractionDigits(2);//강제로 소수이하 둘쨰자리 표시하라는 메소드
		System.out.println(nf4.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf4.format(12345678)); //12,345,678.00원
		System.out.println();
		
		//NumberFormat nf5 = NumberFormat.getInstance(Locale.us);//메소드를 이용한 추상클래스 생성.
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //$ 표시
		nf4.setMaximumFractionDigits(2);//소수점이하 둘째자리까지 표시하겠다는 메소드
		nf4.setMinimumFractionDigits(2);//강제로 소수이하 둘쨰자리 표시하라는 메소드
		System.out.println(nf5.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf5.format(12345678)); //12,345,678.00원
		System.out.println();
	}
}
