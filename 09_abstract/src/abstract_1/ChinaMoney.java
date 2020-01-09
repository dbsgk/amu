package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class ChinaMoney extends Money{
	public ChinaMoney(int input) {
		money=input;
		this.input = input;
		calcMoney();
		dispMoney();
	}
	@Override
	void calcMoney() {
		money = money/166.39;
		
	}

	@Override
	void dispMoney() {
		NumberFormat nf1 =  NumberFormat.getCurrencyInstance();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf.setMaximumFractionDigits(2);//소수점이하 둘째자리까지 표시하겠다는 메소드
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(input)+" → "+nf.format(money)); //12,345,678.46원
		
	}

}
