package class_2;

/*[문제2]
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

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] fm = new Fruit[3];
		fm[0] = new Fruit("사과",100,80,75);
		fm[1] = new Fruit("포도",30,25,10);
		fm[2] = new Fruit("딸기",25,30,90);
		
		System.out.println("---------------------------------");
		System.out.println("PUM \tJAN \tFEB \tMAR \tTOT");
		System.out.println("---------------------------------");
		fm[0].display();
		fm[1].display();
		fm[2].display();
		System.out.println("---------------------------------");
		Fruit.output();
	}//main
}//class
