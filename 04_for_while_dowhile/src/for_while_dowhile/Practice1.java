package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����1] ���������� ���� - if��

[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Win!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Lose!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
��ǻ�� : ����	�� : ����
You Draw!!
�� �ҷ�(Y/N) : n
���α׷��� �����մϴ�


*/
public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
		
		//1����<2����<3��
		//���� ���ڱ� ��ǻ�Ͱ� ���� ���� �̰��.
		while(true) {
//			String comS = null,meS = null;
			int me = Integer.parseInt(br.readLine()); 
			int com = (int)(Math.random()*3)+1;

			
			if(me==3&&com==1)System.out.println("�� : ���ڱ�	��ǻ�� : ���� \nYou Lose!!");
			if(me==3&&com==2)System.out.println("�� : ���ڱ�	��ǻ�� : ���� \nYou Win!!");
			if(me==2&&com==1)System.out.println("�� : ����	��ǻ�� : ���� \nYou Win!!");
			if(me==2&&com==3)System.out.println("�� : ����	��ǻ�� : ���ڱ� \nYou Lose!!");
			if(me==1&&com==2)System.out.println("�� : ����	��ǻ�� : ���� \nYou Lose!!");
			if(me==1&&com==3)System.out.println("�� : ����	��ǻ�� : ���ڱ� \nYou Win!!");
			if(me==1&&com==1)System.out.println("�� : ����	��ǻ�� : ���� \nYou Draw!!");
			if(me==2&&com==2)System.out.println("�� : ����	��ǻ�� : ���� \nYou Draw!!");
			if(me==3&&com==3)System.out.println("�� : ���ڱ�	��ǻ�� : ���ڱ� \nYou Draw!!");
			//if(me==com)System.out.println("You Draw!!");
			System.out.print("�� �ҷ�(Y/N) : ");
			String yn = br.readLine();
			if(yn.equalsIgnoreCase("N")) {System.out.println("���α׷��� �����մϴ�.");break;
			}else if(yn.equalsIgnoreCase("Y")) {
				System.out.println("����(1),����(2),��(3) �� ��ȣ �Է� : ");
			}
		}
		 	}

}
