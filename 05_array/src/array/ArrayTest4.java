package array;

/*boolean[] ar = new boolean[5];

������ ���� ���α׷�

menu()
**************
   1. ����            input()
   2. ����            output()
   3. ����Ʈ         list()
   4. ����
**************
  �޴� : 

1���� ���
��ġ �Է� : 3
3��ġ�� ���� / �̹� �����Ǿ��ֽ��ϴ�

2���� ���
��ġ �Է� : 4
4��ġ�� ���� / �����Ǿ� �����ʽ��ϴ�

3���� ���
1��ġ : true
2��ġ : false
3��ġ : true
4��ġ : false
5��ġ : false


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest4 at = new ArrayTest4();
		
		while(true) {
			at.menu();//�޴��Լ�() ȣ��
			int choice = Integer.parseInt(at.br.readLine());
			if(choice==1) {
				//����
				at.input(ar);continue;
			}else if(choice==2) {
				//����
				at.output(ar);continue;
			}else if(choice==3) {
				//����Ʈ
				at.list(ar);continue;
			}else if(choice==4) {
				//����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}//while
		
	}//main
	
	public boolean input(boolean[] ar) throws IOException {
		System.out.print("��ġ�Է� :");
		int choice = Integer.parseInt(br.readLine());
		if(ar[choice-1]==true) System.out.println("�̹� �����Ǿ��ֽ��ϴ�.");
		else System.out.println(choice+"��ġ�� ����");
		System.out.println();
		return ar[choice-1]= true;//�Է°��� 1���� �����̶� 
	}//input
	
	public boolean output(boolean[] ar)throws IOException {
		System.out.print("������ ��ȣ�� �������ּ��� : ");
		int choice = Integer.parseInt(br.readLine());
		if(ar[choice-1]==false) System.out.println("�����Ǿ� ���� �ʽ��ϴ�.");
		else System.out.println(choice+"��ġ�� ����");
		System.out.println();
		return ar[choice-1]= false;
		
	}//output
	
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+1+"��ġ : "+ar[i]);
		}//for
		System.out.println();
	}//list
	public void menu() {
		System.out.println("*************************");
		System.out.println("\t1. ����");
		System.out.println("\t2. ����");
		System.out.println("\t3. ����Ʈ");
		System.out.println("\t4. ����");
		System.out.println("*************************");

	}//menu

}
