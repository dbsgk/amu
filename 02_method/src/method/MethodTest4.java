package method;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

	public static void main(String[] args)throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 m4 =new MethodTest4();
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է�: ");
		String id = br.readLine();
		System.out.println();
		
		String gen = m4.comp(id);
		int age = m4.calcAge(id);
		System.out.println(name+"���� "+gen+"�̰�"+age+"�� �Դϴ�.");
		
	}
	public String comp(String a) {
		
		String gen = a.charAt(7)=='1'||a.charAt(7)=='3'?"����":"����";
		
		return gen;
	}
	public int calcAge(String a) {
		
		int gg = Integer.parseInt(a.substring(0, 2));//�յ��ڸ�
		//gg�� 00~19����̸� 2019-(2000+gg)+1�� ����ϰ�, gg�� 20~99����̸� 2019-(1900+gg)+1�� ����Ѵ�.
		int age = gg>=20 && gg<100?2019-(1900+gg)+1:2019-(2000+gg)+1;
		return age;
	}

}
