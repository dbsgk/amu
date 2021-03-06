package abstract_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//만년달력. 
/*[문제1]
클래스명 : CalendarTest

년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

기본생성자 - 년도, 월 입력
calculator()//필요한값은 calc에서
display()*///찍는것만 disp
public class CalendarTest {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();
	Calendar cal = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	int year;
	int month;
	int day;
	
	public void calculator() {
		//만약입력받은 달의 1일이 무슨요일이면 \t을 몇개주고
		cal.set(year, month-1, 1);
		day = cal.get(Calendar.DAY_OF_WEEK);//요일숫자
//		System.out.println(day);
//		System.out.println(cal.getFirstDayOfWeek());
	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayNum=0;
		for(int i=1;i<day;i++) {
			System.out.print("\t");
			dayNum++;
		}
		for(int i=1;i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.print(i+"\t");
			if((i+dayNum)%7==0)System.out.println();
		}//for()
		
	}
	public CalendarTest() {
		System.out.print("년도 입력: ");
		year = sc.nextInt();
		System.out.print("월 입력: ");
		month = sc.nextInt();
	}
}//class


