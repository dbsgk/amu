package method;
//MathŬ����
//���߿� ū��,������(68,24)
//2�� 5��
//������ ����ؼ� �빮�� �̾Ƴ���
//���ڿ� Ÿ���� ���ڸ� ������ �Ǽ��� �̾Ƴ��� ����ϱ�

public class MethodTest {
	public static void main(String[] args) {
		int big = Math.max(36,25);
//				  --------------- ȣ��
		System.out.println("ū��: "+big);
		int small = Math.min(36, 25);//min()�̷��Ը� ���� ���� Ŭ������ �޼ҵ��� �ǵ� Math���ϱ� Math.�ٿ��ش�.
		System.out.println("������: "+small);

		double power = Math.pow(2, 5);
//		^-----  pow�޼ҵ��� ���Ÿ���� double�̴ϱ� int�� �������ϸ� ������.		
		System.out.println("2�� 5��: "+power);
		System.out.println("2�� 5��: "+(int)(power));

		//����(random) - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻���Ű�� ���� ���Ѵ�,
		//������ ����  - 0.0 <= ���� < 1.0
		//double a = Math.random();
		//int a = (int)(Math.random()*100);//0~99
		//int a = (int)(Math.random()*100)+1;//1~100
		int a = (int)(Math.random()*26)+65;//�빮�� �̾Ƴ��¹�;65~90;90-65=25, 25+1=26�� 
		//			 ----------------- 0~25 ���� ����
		//
		System.out.println("����: "+(char)a);
		
		System.out.println('2'+'5');//103(���������� ���ڶ�)
		//System.out.println('2'-48+'5'-48);//7(-48�� ���༭ �������·� �ٲ�)'0'(���������� 0)= 48,  0(���������� 0) = 0
		System.out.println("2"+"5.7");//25
		//System.out.println("2"-48);(x)//�������� ���ȵ�. �������� �Լ��θ� ��갡��
		
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));//7.7
		
		
		
	}
}
