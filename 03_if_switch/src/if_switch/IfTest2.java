package if_switch;
//�̰ɷ� ���� ���� �� ���� �������
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3���� ����(a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�
 * 
 * [������]
 * a�� �Է�: 78
 * b�� �Է�: 25
 * c�� �Է�: 36
 * 25	36	78*/
public class IfTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c�� �Է�: ");
		int c = Integer.parseInt(br.readLine());

		/*
		 * if(a>=b && a>=c) {//a�� ���� ũ�ٸ� if(b>=c)
		 * {System.out.print(c+"\t"+b+"\t"+a);//b�� c���� ũ�ٸ� }else
		 * System.out.println(b+"\t"+c+"\t"+a);//c�� b���� ũ�ٸ�
		 * 
		 * }else if(b>=a && b>=c) {//b�� ���� ũ�ٸ� if(a>=c)
		 * {System.out.print(c+"\t"+a+"\t"+b);//a�� c���� ũ�ٸ� }else
		 * System.out.println(a+"\t"+c+"\t"+b);//c�� a���� ũ�ٸ�
		 * 
		 * }else if(c>=a && c>=b) {//c�� ���� ũ�ٸ� if(a>=b)
		 * {System.out.print(b+"\t"+a+"\t"+c);//a�� b���� ũ�ٸ� }else
		 * System.out.println(a+"\t"+b+"\t"+c);//b�� a���� ũ�ٸ� }
		 */
		
		if(a<=b && a<=c) {//a�� ���� �۴ٸ�
			if(b<=c) {System.out.print(a+"\t"+b+"\t"+c);//b�� c���� �۴ٸ� 
			}else System.out.println(a+"\t"+c+"\t"+b);//c�� b���� �۴ٸ�
			
		}else if(b<=a && b<=c) {//b�� ���� �۴ٸ�
			if(a<=c) {System.out.print(b+"\t"+a+"\t"+c);//a�� c���� �۴ٸ�
			}else System.out.println(b+"\t"+c+"\t"+a);//c�� a���� �۴ٸ�
			
		}else if(c<=a && c<=b) {//c�� ���� �۴ٸ�
			if(a<=b) {System.out.print(c+"\t"+a+"\t"+b);//a�� b���� �۴ٸ�
			}else System.out.println(c+"\t"+b+"\t"+a);//b�� a���� �۴ٸ�
		}
	}
}
