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
		nf.setMaximumFractionDigits(2);//�Ҽ������� ��°�ڸ����� ǥ���ϰڴٴ� �޼ҵ�
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(input)+" �� "+nf.format(money)); //12,345,678.46��
		
	}

}
