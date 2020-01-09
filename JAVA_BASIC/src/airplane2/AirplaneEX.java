package airplane2;

import java.util.Scanner;

public class AirplaneEX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FlightController flightController = new FlightController();
		MemberController memberController = new MemberController();
		AirportController airportController = new AirportController();
		ReservationController reservationController = new ReservationController();
		MemberViewer memberViewer = new MemberViewer(memberController, scan);
		AirportViewer airportViewer = new AirportViewer(airportController);
		FlightViewer flightViewer = new FlightViewer(scan, flightController);
		ReservationViewer reservationViewer = new ReservationViewer(scan, reservationController, 
				airportViewer, flightViewer);
		while(true) {
			System.out.println("����� ���� ���α׷�");
			System.out.println("1. �α��� 2. ȸ������ 3. ����");
			int choice = scan.nextInt();
			scan.nextLine();
			if(choice == 1) {
				//�α��� �޼ҵ� ����
				MemberDTO logInUser = memberViewer.logIn();
				while(logInUser == null) {
					System.out.println("�ش��ϴ� ������ �������� �ʽ��ϴ�.");
					logInUser = memberViewer.logIn();
				}
				System.out.println(logInUser.getUsername()+"�� ȯ���մϴ�!!!");
				while(true) {
					System.out.println("1. �����ϱ� 2. ȸ������ ���� 3. �α׾ƿ�");
					choice = scan.nextInt();
					if(choice == 1) {
						//reservationViewer �ҷ��� �����ϴ� ���μ��� ����
						reservationViewer.makeReservation(logInUser);
					}else if(choice == 2) {
						//memberViewer�� ȸ������ ���� ����
						memberViewer.showInfo();
					}else if(choice == 3) {
						System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						break;
					}
				}
			}else if(choice == 2) {
				//ȸ������ �޼ҵ� ����
				memberViewer.signIn();
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		scan.close();
	}

}
