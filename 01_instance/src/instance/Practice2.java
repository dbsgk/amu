package instance;
/*[����2] �ﰢ�����̸� ����Ͻÿ� (base, height, area)
�ﰢ������ = (�غ� * ����)/2

[������]
**** �ﰢ���� ���� ���ϱ�  ****
�غ� :   5  
���� :   7
���� :   XX.XX  	<--- �Ҽ� 2�ڸ���������Ͻÿ�*/

public class Practice2 {
	public static void main(String[] args) {
		int base = 5;
		int height = 7;
		double area = (double)base*height/2;
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.println("�غ�  :\t"+base);
		System.out.println("����  :\t"+height);
		System.out.println("����  :\t"+ String.format("%2.2f", area));
		
		
		int base1 = 5;
		int height1= 7;
		double area1 = (double)base1*height1/2;
		System.out.println("����"+ String.format("%.2f", area1) );
	}
}
