package instance;
//�޼ҵ�
//��ɾ���� ����

public class Variable {//�ڹٴ� ��ü�����̶� ���� Ŭ�����ȿ� ���;���
//Ŭ���� ù���ڴ� ������ �빮��.
	public static void main(String[] args) {
		//�޸��Ҵ�
		boolean a;//(boolean�� 1byte ������ ����������  1bit�� ���)
		a = true;
		System.out.println('a');//97���
		System.out.println("a ="+ a);
		
		char b;//(char�� 2byte 16bit)
		b= 'A';// 0000 0000 0100 0001 �� �����(�� ���� 0���� ä��)
		System.out.println("b= "+b);
		
		char c;
		c = 65;//ĳ����Ÿ�Կ� ���ڸ� ������ �ƽ�Ű�ڵ尪���� �а� 'A'���.
		//c= 65535;char�� ������ ��
		//c= 65536;-error ������ ����� ������ �⺻���� int������ �ν�; ������Ÿ�Ժ�ȯ�϶�� ��õ��.
		System.out.println("c= "+c);
		
		int d = 65;//(int�� 4byte 32bit)
		//0000 0000 0000 0000 0000 0000 0100 0001 �� �����(�� ���� 0���� ä��)
		System.out.println("d= "+d);
		
		int e= 'A';//�ƽ�Ű�ڵ�� �о 65�� ����
		System.out.println("e= "+e);
		
		int f= (int)25L;//25L�� long��; �ҹ���,�빮�� �������;
		//int = long;(x)�����ſ� ū�� ������; �ݴ�� ����;
		
		//float g = 43.8; -�Ǽ����� double���� default���̴�.
		float g = 43.8f;//�ƿ� �����Ѱ�
		//float g = (float)43.8;��� �����ϴ°�
		
		
		
	}
}

