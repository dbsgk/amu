package day01;
//�� ������
//&&, ||
// �������ڴ� 2���� boolean�� �����ؼ�
// boolean �����س�.
// AND, OR, ���� (3����)�� �ִ�
public class Ex06 {
	public static void main(String[]args) {
		
		boolean isTrue = true;
		boolean isFalse = false;
		// �Ʒ��ǹ�Ĵ�� 2���� boolean Ÿ�Ժ����� ���� ���갡��
		System.out.println(isTrue && isFalse);
		//������ �� ���� ���̴� ����� �񱳿����ڳ� returnŸ���� boolean��
		//�޼ҵ带 ȣ���ؼ� ���Ǵ°� �� ���� ��
		String str  = "abc";
		System.out.println(str.equals("abc")&&str.equals("bcd"));
		
		//�� ������ 3���� ����
		//1. AND ����(2���� true �϶��� true�� ���´�)
		//2. OR����(2���� 1���� true���� true�� ���´�)
		//3. !���� ( true�� false�� false�� true��)
		
		//1. AND���� (&&)
		// shift + ����7 -> &
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false &&false);//false
		
		//2. OR����(||)
		//shift + ��ȭǥ��-> |
		System.out.println(true || true);//t
		System.out.println(true || false);//t
		System.out.println(false || false);//f
		
		//3. ��������(!)
		System.out.println(!true);//f
		System.out.println(!false);//t
		
	}
	
}