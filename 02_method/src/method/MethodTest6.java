package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest6 {

	public static void main(String[] args)throws IOException {
		/* �̸�(name), �ֹι�ȣ(id)�� �Է��Ͽ� ������ ����Ͻÿ� 
		 * ������ �����ϴ� comp()�޼ҵ�� ���̸� ����ϴ� calcAge()�޼ҵ带 �ۼ��Ͻÿ�
		 * 
		 * [������]
		 * �̸� �Է�: ȫ�浿
		 * �ֹι�ȣ �Է�: 001023-3456789(���ڿ�)
		 * 2019-2000+1=20
		 * ȫ�浿���� �����̰� 20���Դϴ�
		 * ���׿����� ����ؼ� ���ڿ��� �����ϱ� */
		
		/* aa="orange";
		 * aa.substring(0,2); 0������ 2���������� �̾ƿ´�.
		 * 
		 */		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest6 m4 =new MethodTest6();
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է�: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int age = m4.calcAge1(id);
		System.out.println(name+"���� "+gen+"�̰�"+age+"�� �Դϴ�.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"����":"����";
		
		return gen;
	}
	public int calcAge(String a) {
		//8��° ���ڰ� 1,2�� a( 20~99��� )������ ����ϰ� 3,4�� b( 00~19��� )������ ���
		//num�� 00~19����̸� 2019-(2000+num)+1�� ����ϰ�, num�� 20~99����̸� 2019-(1900+num)+1�� ����Ѵ�.
		String num = a.substring(0, 2);//00��;0��°���� 2��° ��������
		int age = a.charAt(7)=='1' || a.charAt(7)=='2'?  2019-(1900+Integer.parseInt(num))+1: 2019-(2000+Integer.parseInt(num))+1; //20~99����̸�
		
		
		return age;
	}
	public int calcAge1(String a) {
		//�ֹι�ȣ ���ڸ� �̾ƿ´�.
		//�� ���ڸ� ����ؼ� ���̸� �̾Ƽ� �����Ѵ�.
		int num = Integer.parseInt(a.substring(0, 2));
		//num�� 20�� ���ų� ũ��, 100���� ������? 1900��� ����: 2000��� ����;
		int age= num >= 20 && num < 100 ? 2019-(num+1900)+1:2019-(num+2000)+1;
		return age;
	}
	
	

}
