package method;
//����4���� substring���� Ǯ���ʰ� int���� 2���� ���ڸ�,���ڸ� ���� �޾Ƽ� ���.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest5 {

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest5 m4 =new MethodTest5();
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է�: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int num1= (id.charAt(0))-48, num2= id.charAt(1)-48;
		
		int age = m4.calcAge(num1,num2);
		System.out.println(name+"���� "+gen+"�̰� "+age+"�� �Դϴ�.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"����":"����";
		
		return gen;
	}
	public int calcAge(int num1, int num2) {
		
		int gg = num1*10+num2;
	
		//gg�� 00~19����̸� 2019-(2000+gg)+1�� ����ϰ�, gg�� 20~99����̸� 2019-(1900+gg)+1�� ����Ѵ�.
		int age = gg>=20 && gg<100?2019-(1900+gg)+1:2019-(2000+gg)+1;
		return age;
	}

}
