package day01;
// �پ��� �ܼ� ��� ���
//�ܼ� ����� 3���� ������� �ϰ� �ȴ�.
//1. print -> ��ȣ���� ������ ����Ѵ�.
//2. println -> ��ȣ���� ������ ����ϰ� ���� �ٲ۴�.
//3. printf -> ��ȣ���� ������ ���Ŀ� ���缭 ����Ѵ�.
public class Ex08 {
	public static void main(String[]args) {
		//1. print
		System.out.println("----print()----");
		System.out.print("abc");
		System.out.print("def");
		
		//2. println -> "print a line"
		System.out.println("----println()----");
		System.out.println("abc");
		System.out.println("def");
		
		//3. printf -> "print in format"
		//printf�� �츮�� ���ϴ� ������ %���ڿ� �Ҵ��ؼ� ����ϰ� �ȴ�.
		//%���ڿ� �츮�� ���ϴ� ������ �Է��ؼ� 
		//������ ���� �� �ִ�.
		System.out.printf("%5s %5s","abc","def");
		
	}
}
