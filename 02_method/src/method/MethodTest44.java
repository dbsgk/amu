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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest44 {
	int all;//��������. like ����ɼ����Ҷ� ������.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//24���� �ٽ�.31����޸�.
		
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է�: ");
		String id = br.readLine();//�ֹι�ȣ�� ����ȣ�� -����ع����� ���ڿ��� �־�� �Ѵ�.
		
		MethodTest44 m44 = new MethodTest44();
		String gender = m44.comp(id);//�޼��� ȣ��
		int age = m44.calcAge2(id);
		
		System.out.println(name+"���� "+gender+"�̰� "+age+"�� �Դϴ�.");
		
	}
	
	public String comp(String id) {//��ȯ���� �𸦶��� �ϴ� void�� �س��� ���߿� �������� �ۼ����ָ��; public void comp(String id)
		String gender = id.charAt(7)=='1'||id.charAt(7)=='3'? "����":"����";
		return gender;
	}
	public int calcAge(String id) {
		//1. ù��°,�ι�° ���ڸ� int ������ ���ڷ� ���
		//2. �ֹι�ȣ ���ڸ� ù��° ���ڰ� 1,2�� 1900��� ����ϰ� 3,4�� 2000���� ����ؼ� int ������ ������ ����.
		
		int num = Integer.parseInt(id.substring(0, 2));
		int age = id.charAt(7)=='1'||id.charAt(7)=='2'?2019-(1900+num)+1:2019-(2000+num)+1;
		
		return age;
	}
	public int calcAge1(String id) {
		//����������ȣId ��  
		//num = id 8��° ���� 
		int num = (int)(id.charAt(7))-48;//1,2or3,4
		System.out.println(num);
		//num2 = id 1,2��° ����
		int num2 = Integer.parseInt(id.substring(0, 2));
		//age�� 1,2�� 1900���� 3,4�� 2000���� ���������� ���Ѵ�.
		int age = num <3 ? 2019-(num2+1900)+1:2019-(num2+2000)+1;
		//age �����Ѵ�.
		return age;
	}
	public int calcAge2(String id) {
		int fnum = (int)id.charAt(7);
		int num = Integer.parseInt(id.substring(0, 2));
		int age = fnum==1 ||fnum==2? 2019-(1900+num)+1:2019-(2000+num)+1;
		//int age = id.charAt(7)=='1'||id.charAt(7)=='2'? 2019-(1900+num)+1:2019-(2000+num)+1;
		return age;
	}
}
