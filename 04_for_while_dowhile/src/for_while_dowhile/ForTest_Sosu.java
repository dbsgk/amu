package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*�Ҽ����ϱ�(1�� �ڱ� �ڽ��� ���� ����� ���� ��)

[������]
���� �Է� : 7
7�� �Ҽ��̴�.

���� �Է�: 12
12�� �Ҽ��� �ƴϴ�.

���� �Է� :0
��, 0�� ���µǸ� ���α׷��� �����մϴ�.
*/
public class ForTest_Sosu {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while(true) {//�����Ѱ�
//			System.out.print("���� �Է� : ");
//			int num = Integer.parseInt(br.readLine());
//			if(num==0)break;
//			for(int i =1; i<=num;i++) {
//				if(num%i==0	)System.out.print(i+" ");
//			}
//			System.out.println();
//			int count=0;
//			for(int i=1;i<=num;i++) {
//				if(num%i==0)count++;
//			}
//			if(count==2)System.out.println(num+"�� �Ҽ��̴�.");
//			else System.out.println(num+"�� �Ҽ��� �ƴϴ�.");
//			System.out.println();
//		}//while
		int sw;//����ġ 0:�Ҳ���, 1:������
		while(true) {
			sw=0;
			System.out.print("���� �Է� : ");
			int num = Integer.parseInt(br.readLine());
			if(num==0)break;
			for(int i=2;i<num;i++) {//�Ҽ��� 1�� �ƴ� ���� ������ �������� �ʴ� ��, �ڱ��ڽ� ������ 
				if(num%i==0)sw=1;//2~ (�ڱ��ڽ�-1)�߿� �����������°� ������ ����ġ�� 1�� �ٲ��ְ� 
			}
			if(sw==0)System.out.println(num+"�� �Ҽ��̴�.");//����ġ�� 1�� �ȹٲ�͸� �Ҽ���.
			else System.out.println(num+"�� �Ҽ��� �ƴϴ�.");
			System.out.println();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
