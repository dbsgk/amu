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
public class Practice11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����(1),����(2),��(3) �� ��ȣ �Է� : ");
		for(int i =0; i<100;){
			int user = Integer.parseInt(br.readLine());
			int com = (int)(Math.random()*3)+1;
			int comme = com-user; 
		String comS = null,userS = null;
		switch(user) {
		case 1 : userS="����";break;
		case 2 : userS="����";break;
		case 3 : userS="���ڱ�";break;
		default:
		}
		switch(com) {
		case 1 : comS="����";break;
		case 2 : comS="����";break;
		case 3 : comS="���ڱ�";break;
		default:
		}
		
		System.out.println("��ǻ�� : "+comS+" �� : "+userS);

		switch(comme) {
		case 1: case -2: 
			System.out.println("You Lose!!");break;
		case -1: case 2:
			System.out.println("You Win!!");break;
		case 0:
			System.out.println("You Draw!!");break;
		}
		System.out.print("�� �ҷ�(Y/N) : ");
		String yn = br.readLine();
		if(yn.equalsIgnoreCase("N")) {System.out.println("���α׷��� �����մϴ�.");break;
		}else if(yn.equalsIgnoreCase("Y")) {
			System.out.println("����(1),����(2),��(3) �� ��ȣ �Է� : ");
		}
	}
		
	}

}
