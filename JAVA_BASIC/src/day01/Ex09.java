package day01;
//printf ����
//printf�� %���ڿ��� ����ؼ� �츮�� ���ϴ� ������ ������� �� �ִ�.
//%d: 10���� ����
//%x: 16���� ����
//%f: �Ǽ�
//%s: ���ڿ�
public class Ex09 {
	public static void main(String[] args) {
		int myNumber = 233;
		//�⺻���
		//\n�� �Է��ϸ� ���� ������ ����ϰ� ���� �ٲ��ش�.
		System.out.printf("%d\n", myNumber);//233
		
		//Ư��ĭ��ŭ �����ؼ� ����Ҷ�����
		//%����d�� �ִ´�.
		System.out.printf("%5d\n", myNumber);//  233
		
		//�����߿��� ���� ���ڸ��� 0���� ä��� ������
		//%0����d�� �ִ´�.
		System.out.printf("%05d\n", myNumber);//00233
		
		//���������� �ʿ��ϸ� 
		//%-����d�� �ִ´�.
		System.out.printf("%-5d\n", myNumber);//233  /���� 2ĭ �� ��µ�.  
		
		//��!! %-05d�� �ȵȴ�. ��? 233���� 23300���� �򰥸��� �־.
		
		//16���� ����ϱ�
		//16������ ��� �⺻%���ڴ� d�� ������ x�� �ҹ��ڷ� ���� �빮�ڷ� ���Ŀ� ���̰� �ְ� �ȴ�.
		System.out.printf("%08x\n", myNumber);
		System.out.printf("%08X\n", myNumber);
		
		//�Ǽ� ����ϱ�
		System.out.printf("%f\n", 3.141592);
		//�Ҽ��� 3���� �ڸ����� ����ϱ�
		System.out.printf("%.3f\n", 3.141592);
		//10�ڸ� ����ϱ�
		System.out.printf("%10f\n", 3.141592);
		//10�ڸ� + �Ҽ���3�ڸ�
		System.out.printf("%10.3f\n", 3.141592);
		//���ڿ��� %s�� �Ҵ��ϰ� �ȴ�.
		System.out.printf("%s\n", "�ȳ��ϼ���");
	}
}
