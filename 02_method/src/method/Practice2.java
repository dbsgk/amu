package method;
/*[����2]
�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�
 */
//���ڸ��߱�
public class Practice2 {
	public static void main(String[] args){
		
		Practice2 p2 = new Practice2();
		
		int num1 = p2.input();
		int num2 = p2.input();
		int sum = p2.add(num1,num2);
		
		System.out.println("ù��° �ֻ��� �� : "+num1);
		System.out.println("�ι�° �ֻ��� �� : "+num2);
		System.out.println("���� "+sum+"�̴�");
		
	}
	public int input() {
		int random = (int)((Math.random()*6)+1);
		return random;
	}
	public int add(int num1, int num2) {
		return num1+num2;
	}
}
