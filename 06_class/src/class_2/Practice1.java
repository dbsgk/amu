package class_2;

import java.util.Scanner;

/*
[문제2]
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum(품명), jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static

클래스 : FruitMain

[실행결과]
---------------------------------
PUM	JAN   	FEB   	MAR		TOT
---------------------------------
사과    	100   	80    	75     	255
포도     	30    	25    	10     	xxx
딸기     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()로 처리

*/
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index;
		
		while(true) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.print("문자열 입력: ");
		sb.append(sc.next().toLowerCase());
		System.out.print("현재 문자열 입력: ");
		String str1	= sc.next();
		System.out.print("바꿀 문자열 입력: ");
		String str2 = sc.next();
		if(str1.length()>sb.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			break;
		}
		int n = 0;
		//sb.replace(0, 2, str2);
		for(int i=0; i<sb.length(); i+=str1.length()) {			//바뀔 문자열의 길이만큼 i에 더해줌(증감식)
			if(sb.indexOf(str1)!=-1) {							//만약 더이상 바꿀 문자가 없다면 실행안함.
				index = sb.indexOf(str1);						//index = 바꿀 현재 문자열의 위치(aa)
				sb.replace(index,index+str1.length(), str2);	// replace(index부터(0), index+바꿀문자열의 길이만큼의 위치까지(0+2), 바꿀 문자열)
				n++;											//치환횟수 카운트
			}
		}//for
		
		System.out.println(sb);
		System.out.println(n+"번 치환");
		}//while
		
		//str= str.toLowerCase().replace(str1, str2);
		sc.close();
	}//main
}//class
