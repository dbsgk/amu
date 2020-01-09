package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest_t{
	private int year,month, week, lastDay;
	public CalendarTest_t() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
	}
	public void calculator() {
		//기준이 없으면 시스템 날짜 2020-01-03(오늘)
		//기준을 내가 원하는 년,월로 세팅해줘야함.
		Calendar cal = Calendar.getInstance();
//		cal.set(cal.YEAR, year);
//		cal.set(cal.MONTH,month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year,month-1,1);
		
		week = cal.get(cal.DAY_OF_WEEK);//cal의 요일
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//그 달 마지막 일
	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
