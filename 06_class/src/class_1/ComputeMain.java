package class_1;

/*
int x,y,sum,sub,mul,
double div, �ʵ����
getter, setter �ؼ� �Ʒ���� ���.

 X 	 Y	 SUM	 SUB	 MUL	 DIV
320	 258	 578	 62	 82560	 1.24
256	 125	 381	 131	 32000	 2.05
452	 365	 817	 87	 164980	 1.24
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Compute{
	private int x,y,sum,sub,mul;
	private double div;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void calc() {
		sum=x+y;
		sub=x-y;
		mul=x*y;
		div=(double)x/y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	
}//class
public class ComputeMain {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Compute[] com = new Compute[3];//�̰� �游 �����аŰ�
	
		
		for(int i=0;i<com.length;i++) {
			com[i]=new Compute();//���⼭ �ϳ��� ��ü�� ��������.
			
			System.out.print("x �Է� : ");
			com[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("y �Է� : ");
			com[i].setY(Integer.parseInt(br.readLine()));
			System.out.println();
			com[i].calc();
			System.out.println();
		}
		System.out.println("X "+"\t Y"+"\t SUM"+"\t SUB"+"\t MUL"+"\t DIV");
		for(Compute data: com) {
			System.out.println(data.getX()+"\t "+data.getY()+"\t "+data.getSum()+"\t "+data.getSub()+"\t "+data.getMul()+"\t "+String.format("%.2f", data.getDiv()));
		}
	}//main

}//main class
