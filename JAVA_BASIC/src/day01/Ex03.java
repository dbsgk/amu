package day01;
//������?
//������ ���� ���� �ؼ� ����� �Ҷ� ����ϴ� ��
//�����ڴ� ���������, ����������, �񱳿�����, ��������, ��Ʈ������ 5������ �ִ�.

//���:  ���ϱ�	����		���ϱ�	������	������
//		 +	 	 -		 *		  /		  %
public class Ex03 {
	public static void main(String[] args) {
		//+
		int myNumber1 = 10;
		int myNumber2 = 20;
		System.out.println(myNumber1 + myNumber2);
		//-
		System.out.println(myNumber1 - myNumber2);
		//*
		System.out.println(myNumber1 * myNumber2);
		// /
		System.out.println(myNumber1 / myNumber2);
		//���� �������� ��� �� ���. ���� 10/20�� 0����.
		
		// %
		System.out.println(myNumber1 % myNumber2);
		//���� 0�̴ϱ� ������ 10 ��µ�.
		
		//���� ������Ÿ�԰� �� ū ������Ÿ���� �����Ű�� ��� �ɱ�?
		// ���� �����Ͱ� �ڵ����� ū ������Ÿ������ ��ȯ�ȴ�.
		//double myDouble = 20.0;// 0.5�������
		//System.out.println(myNumber1/myDouble);
		double myDouble = (double)myNumber1/myNumber2;
		//					int������ ������ �����ż� (double)�� �Ⱥ��̸�
		//					0�� ������ �װ� myDouble�� �����ϱ�
		System.out.println(myDouble);//0.0���
		
		//char�� ������ ���ڰ��� ������ �ְ� ASCII�ڵ尪�� �����ؼ� 
		//�ش� ���ڰ��� ã�Ƽ� �� ��ġ�� ���ڸ� ����ϰ� �ȴ�.
		char myChar = (char)('A'+32);
		System.out.println(myChar);
		//char�� ���� �ϳ��� ��Ʈ�� �ϴµ� �츮�� ���� �ϳ��� ���� ���� ���
		//������ ���ڸ� �̾� ���� ���ڿ� String Ŭ������ ����.
		String str = "abc"+123;//String���� +�� ���� ��
		System.out.println(str);
		
		// �ش� ������ ��������ڸ� ������Ѽ� �� ���� �ٽ� �� ������ ���� ��
		myNumber1 = myNumber1+10;
		//myNumber1�� ���� ���� 10�� ���ϰ� �� ���� �ٽ� myNumber1�� �ִ´�.
		myNumber1 += 10; //���� �ڵ带 �ٿ��� �� ��
		System.out.println(myNumber1);
		
	}
}
