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

public class ArrayTest44 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest44 at = new ArrayTest44();
		at.menu(ar);//�޴��Լ�() ȣ��
		
		
	}//main
	
	public void input(boolean[] ar) throws IOException {
		System.out.print("��ġ�Է� :");
		int index = Integer.parseInt(br.readLine());
		if(ar[index-1]) System.out.println("�̹� �����Ǿ��ֽ��ϴ�.");//�Է°��� 1���� �����̶� 
		//ar[index-1] ��� ��ü�� boolean���¶�  ���̸� ��Ͻ����ϰ� �ƴϸ� ���� ����. �׷��� ar[index-1]==true �̷��� ���ʿ����.
		else {ar[index-1]= true;System.out.println(index+"��ġ�� ����");}
		
	}//input
	
	public void output(boolean[] ar)throws IOException {
		System.out.print("������ ��ȣ�� �������ּ��� : ");
		int index = Integer.parseInt(br.readLine());
		if(ar[index-1]) {System.out.println(index+"��ġ�� ����");ar[index-1]= false;}
		else System.out.println("�����Ǿ� ���� �ʽ��ϴ�.");
		
		
	}//output
	
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+1+"��ġ : "+ar[i]);
		}//for
		System.out.println();
	}//list
	public void menu(boolean ar[]) throws IOException{ //�޼ҵ忡 exception�� �ɸ� �� �޼ҵ带 ����ϴ� ���� �ʿ��� exception�� �ɾ�� ��.
		int num;
		while(true) {
			System.out.println();
			System.out.println("*************************");
			System.out.println("\t1. ����");
			System.out.println("\t2. ����");
			System.out.println("\t3. ����Ʈ");
			System.out.println("\t4. ����");
			System.out.println("*************************");
			System.out.println(" ��ȣ: ");
			num=Integer.parseInt(br.readLine());
			if(num==4)break;
			if(num<1||num>4) {
				System.out.println("1~4�� �Է°���");continue;
			}
			if(num==1) input(ar);
			if(num==2) output(ar);
			if(num==3) list(ar);
			
		}//while
	}//menu

}
