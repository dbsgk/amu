package airplane3;

import java.util.Scanner;

public class AirplaneEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("����� ���� ���α׷�");
			System.out.println("1.�α��� 2.ȸ������ 3.����");
			int choice = scan.nextInt();
			if(choice==1) {
				//�α��� �޼���
				
			}else if(choice==2) {
				//ȸ������ �޼���
			}else if(choice==3) {
				//����
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			
		scan.close();
		}//���α׷� while
	}//main
}//class
