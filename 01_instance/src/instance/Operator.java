package instance;
//����������//�켱���� 
public class Operator {

	public static void main(String[] args) {
		int a=5;
		a+=2;//a=a+2; �ּ�ó���� ����� ���� ������ 2���ؼ� ó���ð��� �������. �׷��� ���������� ���.
		a*=3;//a=a*3
		//a/=9;//a=a/9
		System.out.println("a="+a);//21
		
		//++a ���࿬��,  a-- ���࿬��
		a++;//a+=1
		System.out.println("a="+a);//22
		
		int b = a++;//==  int b=a; a++; //22
		//int b = ++a;//== ++a; int b=a; //23
		System.out.println("a="+a+"\t b="+b);//a23 b22
		
		//a--;//a-=1
		
		
		int c= ++a - b--;//24-22=2
		//++a;
		//b--;//(���� ���߿� �ҷ���)
		//int c= a-b;
		//b--;
		System.out.println("a="+a+"\t b="+b+"\t c="+c);//a24 b21 c2
		
		System.out.println("a++ ="+ a++);
		// 1. System.out.println("a++ ="+ a);//24
		// 2. a++;//25

		
	}

}
