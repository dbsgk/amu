package class_2;
//Ŭ����.�Լ��� ��� �����ϰ� ������ �Ҷ� import �س��� ���ο��� �Լ��� ���
import static java.lang.Math.*;//Math�� �ִ� �޼ҵ� ���� ������ �ҋ� *
//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("����= "+random());//<--Math.random()�̷��� �Ⱦ��� ������ ������ import�� staticó������.
		out.println("����= "+pow(2, 5));//<--Math.pow()
		out.println("�Ҽ� ���� 2°�ڸ�= "+format("%.2f", 12.34567));//String.format()
		//System.out----> out���� .
		
	}//main

}//class
