package class_2;

/*[����2]
���� �Ǹŷ� ���ϱ�
���� �����հ赵 ���Ͻÿ�

Ŭ���� : Fruit
pum(ǰ��), jan, feb, mar, tot
sumJan, sumFeb, sumMar

������
calcTot()
display()
output() - static

Ŭ���� : FruitMain

[������]
---------------------------------
PUM	JAN   	FEB   	MAR		TOT
---------------------------------
���    	100   	80    	75     	255
����     	30    	25    	10     	xxx
����     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()�� ó��

*/

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] fm = new Fruit[3];
		fm[0] = new Fruit("���",100,80,75);
		fm[1] = new Fruit("����",30,25,10);
		fm[2] = new Fruit("����",25,30,90);
		
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
