package instance;
/*����
 * 320, 258�� ������ �����Ͽ� ���� ���Ͻÿ�
 * 
 * [������]
 * 320+258=xxx ���� a,b, sum
 * 320-258=xxx (sub)
 * 320*258=xxx (mul)
 * 320/258=1.24xxxx (div) �̰� �Ҽ��� ��°�ڸ����� �̾ƶ�.
 * */
public class NumberTest {
	public static void main(String[] args) {
		short a = 320;//short������ 32767�̶� ���� int�Ⱦ��� short��
		short b = 258;
		int sum = a+b;
		//short sum = (short)(a+b);//���������� �⺻Ÿ���� int�� short�� ��� ����ȯ�������.
		//ex) char'A'+ char'B'= int 131; char ��굵 int��
		int sub = a-b;
		int mul = a*b;
		double div = (double)a/b;//
		//String div = String.format("%.2f",(double)a/b);
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"+"+b+"="+ String.format("%.2f", div));
		
	}
}
