package method;
//MathŬ����
//���߿� ū��,������(68,24)
//2�� 5��
//������ ����ؼ� �빮�� �������� �̾Ƴ���
//���ڿ� Ÿ���� ���ڸ� ������ �Ǽ��� �̾Ƴ��� ����ϱ�

public class MethodTest1 {
	public static void main(String[] args) {
		int big = Math.max(68, 24);
		int small = Math.min(68, 24);
		double pow = Math.pow(2, 5);
		System.out.println(Math.random()+65);
		char ran = (char)((Math.random()*26)+65);//65~90, 90-65=25
		//�̷��� ���⼭ char�� ���൵ �ǰ� ����Ҷ� char�� ���൵ �ȴ�.
		
		//random�� +(���ϱ�)�� ó�� ����, *(���ϱ�)�� ������ ���� ����
		System.out.println(ran);
		String a="4", b="5.5";
		System.out.println(Integer.parseInt(a)+Double.parseDouble(b));
	}
}
