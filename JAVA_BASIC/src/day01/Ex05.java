package day01;
//�� ������
//�� �����ڴ� �� ���� ���Ѵ�.
// >, >=, <, <=, ==, !=
//���� �� ������� ������ true Ʋ���� false�� ���´�.
//�� ������� ������Ÿ���� boolean�̴�.
public class Ex05 {
	public static void main(String[] args) {
		int myNumber1 = 10;
		int myNumber2 = 20;
		System.out.println(myNumber1 > myNumber2);
		System.out.println(myNumber1 < myNumber2);
		
		myNumber2 = 10;
		//>�� 2���� ���� ������ false�� ���´�.
		System.out.println(myNumber1>myNumber2);
		//>=�� 2���� ���� ���� ������ true�� ���´�.
		System.out.println(myNumber1>=myNumber2);
		
		//2���� ���� ������ ���Ҷ����� == ���
		System.out.println(myNumber1==myNumber2);
		
		//2�� ���� �ٸ��� ���Ҷ����� != ���
		System.out.println(myNumber1 != myNumber2);
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//String�� Ŭ����(������)�� equals�޼ҵ�� �� �� ����� ��.
	}
}
