package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest_t{
	private int year,month, week, lastDay;
	public CalendarTest_t() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵ �Է� : ");
		year = sc.nextInt();
		System.out.print("�� �Է� : ");
		month = sc.nextInt();
	}
	public void calculator() {
		//������ ������ �ý��� ��¥ 2020-01-03(����)
		//������ ���� ���ϴ� ��,���� �����������.
		Calendar cal = Calendar.getInstance();
//		cal.set(cal.YEAR, year);
//		cal.set(cal.MONTH,month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year,month-1,1);
		
		week = cal.get(cal.DAY_OF_WEEK);//cal�� ����
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//�� �� ������ ��
	}
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1;i<week;i++) {
			System.out.print("\t");
			
		}
		for(int i=1;i<=lastDay;i++) {
			System.out.print(i+"\t");
			if(week%7==0)System.out.println();
			week++;
			
		}
	}
}
public class CalendarMain_t {

	public static void main(String[] args) {
		CalendarTest_t caltest = new CalendarTest_t();
		caltest.calculator();
		caltest.display();
	}

}
