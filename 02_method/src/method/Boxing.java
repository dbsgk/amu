package method;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a/3;//cast����-����ȯ
		//a�� double�� ����ȯ �ߴٰ� �ؼ� ������ a�� double�� �Ǵ°� �ƴϴ�. �� ���ο����� ����.
		
		int c= 5;
		Integer d = c;//AutoBoxing �⺻�� -> ��ü��
		//������ �ȵ�; Integer d = new Integer(c); JDK 5.0 �������� �̷� ������ �ٲ���� ��.
		
		Integer e = 5;
		int f = e;//Unboxing ��ü��-> �⺻��
		//������ �ȵ�; e.intValue(); JDK 5.0 �������� �̷� ������ �ٲ���� ��.
		
	}

}
