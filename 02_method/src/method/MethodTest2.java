package method;
//static, non-static �޼��� ȣ��

public class MethodTest2 {
	public static void disp() {// �޼ҵ� ����
		System.out.println("static method");
	}

	public void output() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		disp();// �޼ҵ� ȣ��; MethodTest2.disp()��� �Ƚᵵ��.
		// new MethodTest2().output();//�̷��Ը� ���൵ ��.

		MethodTest2 aa = new MethodTest2(); // new�� ���� ������ְ�
		System.out.println("aa = " + aa);// ��Ű����.Ŭ������@16����
		System.out.println("aa = " + aa.toString());// �Ƚᵵ��. ������ toString �� �پ��ִµ� �����Ǿ�����
		System.out.println("aa = " + aa.hashCode());// 10������ ǥ��

		aa.output();// �ҷ���
		System.out.println();
		int sum = aa.plus(25, 36);
		int sub = aa.minus(25, 36);
		int mul = aa.multiply(25, 36);
		double div = aa.divide(25, 36);

		System.out.println("25 + 36 : " + sum);
		System.out.println("25 - 36 : " + sub);
		System.out.println("25 * 36 : " + mul);
		System.out.println("25 / 36 : " + div);

	}

	public int add(int a, int b) {
		return a + b;// ������ �ݵ�� 1��; ���̽��� ���� �������Ѵ�.
	}

	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		return (double)a / b;
	}
}
