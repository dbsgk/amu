package class_2;
//indexOf ��������. replace�� �׳� �鷯����... �Դٰ� Stringbuffer�� �ƴϰ� �� StringŬ����...
import java.util.Scanner;

public class Practice1_t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//��ġ
		int count=0;//����
		
		System.out.print("���ڿ� �Է�: ");
		String str=sc.next().toLowerCase();
		
		System.out.print("���� ���ڿ� �Է�: ");
		String target = sc.next().toLowerCase();
		
		System.out.print("�ٲ� ���ڿ� �Է�: ");
		String replacing = sc.next();
		
		if(str.length()<target.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			return;//�����. ���̻� �������� ����. while�� break;��������.
		}
		
		str = str.toLowerCase();//str.toLowerCase()�̷��Ը� ���� ������ �ٲ��� ����.
		target = target.toLowerCase();
		
		while((index = str.indexOf(target,index))!=-1) {
			index += target.length();
			count++;
		}//while
		
		System.out.println(str.replace(target, replacing));
		System.out.println(count+"�� ġȯ");
		
	}//main

}//class
