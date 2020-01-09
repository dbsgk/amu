package airplane;

import java.util.Scanner;

public class AirplaneEx {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	AirportController airportController = new AirportController();
	MemberController memberController = new MemberController();
	FlightController flightController = new FlightController();
	ReservationController reservationController = new ReservationController();

	// AirportView airportView = new AirportView();
	// FlightView flightView = new FlightView();
	MemberView memberView = new MemberView(memberController);
	ReservationView reservationView = new ReservationView();
	
	while(true)
	{
		System.out.println("==================�װ�����Ȩ������===========");
		System.out.println("1.�α��� 2. ȸ������ 3. ����");
		System.out.println(">");
		int choice = scan.nextInt();
		//scan.nextLine();
		if (choice == 1) {
			// �α��ν���
			MemberDTO logInUser = memberView.auth(scan);
			while (logInUser == null) {
				System.out.println("�ش��ϴ� ������ �������� �ʽ��ϴ�.");
				logInUser = memberView.auth(scan);
			}
			System.out.println(logInUser.getUsername() + "��, ȯ���մϴ�.");

			// �α��εƴ�
			while (true) {
				System.out.println("1.�����ϱ� 2. ȸ����������(������) 3.�α׾ƿ�");
				System.out.println(">");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					// �����ϴ� �޼ҵ�(���� �����ϴ°� ����)
					//reservationViewer �ҷ��� ���μ��� ����
					reservationView.makeReservation();

				} else if (choice == 2) {
					// �����Ϻ��¸޼ҵ�
					//memberViewer �� ȸ���������� ����
					memberView.showInfo();
				} else if (choice == 3) {
					System.out.println("�α׾ƿ��Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("�߸������̽��ϴ�.");
				}
			}
		} else if (choice == 2) {
			// ȸ������
		} else if (choice == 3) {
			System.out.println("�ȳ���������");
			break;
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}scan.close();
	
	
	}
}