package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Money1 {
	double money;
	int input;
	abstract void calcMoney();
	abstract void dispMoney();
}
class USMoney1 extends Money1 {
	public USMoney1(int input) {
		money=input;
		this.input = input;
	}

	@Override
	void calcMoney() {
		money = money/1158.5;
	}

	@Override
	void dispMoney() {
		NumberFormat nf1 =  NumberFormat.getCurrencyInstance();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMaximumFractionDigits(2);//소수점이하 둘째자리까지 표시하겠다는 메소드
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(input)+" → "+nf.format(money)); //12,345,678.46원
	}

}
class ChinaMoney1 extends Money1{
	public ChinaMoney1(int input) {
		money=input;
		this.input = input;
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
class JapanMoney1 extends Money1{
	public JapanMoney1(int input) {
		money=input;
		this.input = input;
	}
	@Override
	void calcMoney() {
		money = money/10.64;		
	}

	@Override
	void dispMoney() {
		NumberFormat nf1 =  NumberFormat.getCurrencyInstance();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		nf.setMaximumFractionDigits(2);//소수점이하 둘째자리까지 표시하겠다는 메소드
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(input)+" → "+nf.format(money)); //12,345,678.46원
		
	}

}
