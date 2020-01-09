package class_2;

public class Fruit {
	String pum;
	int jan, feb, mar;
	int tot;
	static int sumJan, sumFeb, sumMar;

	/*public Fruit() {
		calcTot();
		display();
		output();
	}// 持失切*/

	public Fruit(String pum,int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		calcTot();
	}// 持失切

	public void calcTot() {
		tot = jan+feb+mar;
		
		sumJan+=jan;
		sumFeb+=feb;
		sumMar+=mar;
	}

	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);

	}

	public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}

}// fruit
