package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";//literal ���� 		heap������ ����
		String b = "apple";
		if(a==b)System.out.println("a�� b�� �������� ����.");
		else System.out.println("a�� b�� �������� �ٸ���.");
		if(a.equals(b))System.out.println("a�� b�� ���ڿ��� ����.");
		else System.out.println("a�� b�� ���ڿ��� �ٸ���.");
		System.out.println();
		
		String c = new String("apple");//���� heap�����̾ literal�̶� new������ ������...
		String d = new String("apple");
		if(c==d)System.out.println("c�� d�� �������� ����.");
		else System.out.println("c�� d�� �������� �ٸ���.");
		if(c.equals(d))System.out.println("c�� d�� ���ڿ��� ����.");
		else System.out.println("c�� d�� ���ڿ��� �ٸ���.");
		System.out.println();
		
		//�Ѵ� �ּҰ� ������ �ִ�. �ٵ� literal�� ���� ���ڸ� �� ���� �� �ּҰ��� ������ ����. 
		//literal ���� ������ �ʰ� ��������ִ� �ּҰ�������. literal�� ��������=�����ּҰ�, new�� ��������=�ٸ��ּҰ�..
		//�̱���: �޸𸮿� �� �ѹ��� new ����� ��� ����ϰڴ�. new�� �޸𸮿� ��� �����ϴ°� �ƴϰ�.
		//�̱����� static���������.
		
		String e = "���� ��¥�� "+2019+12+30;//�ڿ� ���ڳ��� ��������ϴ°� �ƴ϶� '�տ�������' ���ڿ��� �����ؼ� ���δ� ���ڿ��� ��µ�.
		System.out.println("e = "+e);
		
		/*
		���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�.
		JVM�� �˾Ƽ� Garbage Collector�� ������ ������.
		Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����.
		���� ��¥��,
		���� ��¥��2019,
		���� ��¥��201912,
		���� ��¥��20191230  �̷��� �޸𸮿� 4��.
		
		�޸� �ñ��ϸ� Ʃ��å ã�ƺ���.
		*/
		
		System.out.println("���ڿ� ũ��= "+e.length());
		
		for(int i=0;i<e.length();i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		
		System.out.println("�κ� ���ڿ� ����= "+e.substring(7));//7�� ���ڿ����� ������
		System.out.println("�κ� ���ڿ� ����= "+e.substring(7,11));//7�� ���ڿ����� 11�� ��������
		
		System.out.println("�빮�� ����= "+"Hello".toUpperCase());//HELLO
		System.out.println("�ҹ��� ����= "+"Hello".toLowerCase());//hello
		
		System.out.println("���ڿ� �˻�= "+e.indexOf("¥"));
		System.out.println("���ڿ� �˻�= "+e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�= "+e.indexOf("���ٺ�"));//ã�� ���ڿ��� ������ -1���.
		

	}//main

}//class
