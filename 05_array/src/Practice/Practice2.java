package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�迭ũ�� 32�� 2����
/*[����2]
10������ �Է��Ͽ� 2������ ��ȯ�Ͻÿ�
0�� �ԷµǸ� ���α׷��� �����ϼ���
������ �ԷµǸ� ���Է��ϼ���
4���� ��� �����ֱ�
Integer.toBinaryString() ��������

[������]
10���� �Է� : -5

10���� �Է� : 250
1111 1010 

10���� �Է� : 12
1100

10���� �Է� : 0
���α׷��� ����*/
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int ar[] = new int[32];
			System.out.print("10������ �Է� : ");
			int input = Integer.parseInt(br.readLine());
			int index = 0;
			if (input == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			while (input != 1) {
				ar[index++] = input % 2;//0��°����
				input = input / 2;
			}
			ar[index] = input;
			for (int j = index; j >= 0; --j) {
				System.out.print(ar[j]);
				if(j%4==0)System.out.print(" ");
			}System.out.println();
			
		}//while
	}// main

}// class
