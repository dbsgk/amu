package airplane2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationViewer {
	Scanner scan;
	AirportViewer airportViewer;
	FlightViewer flightViewer;
	ReservationController reservationController;
	
	public ReservationViewer(Scanner scan,ReservationController reservationController,AirportViewer airportViewer,FlightViewer flightViewer) {
		this.reservationController = reservationController;
		this.airportViewer = airportViewer;
		this.flightViewer = flightViewer;
		this.scan = scan;
	}
	public void makeReservation(MemberDTO logInUser) {
		System.out.println("������� �������ּ���.");
		//���⼭ ����� ����� �����ش�.
		airportViewer.showStart();//�̰� �Ʒ��� ������ ����Ʈ�� �ȶ���.�׷��� ��ȣ�� �����Ҽ��� �����.
		int startAirportId = scan.nextInt();
		System.out.println(("�������� �������ּ���"));
		airportViewer.showEnd(startAirportId);
		
		//���⼭ ������� �����ϴ� �������� �������� �����ش�.
		int endAirportId = scan.nextInt();
		
		//����ڰ� �����ϰ� ������ �ش� ������ �����ϴ� �������� �����ش�.
		//�� �ڸ��� �̹� ���� ������ �ƿ� �������� �ʴ´�.
		
		System.out.println("ž���� ����⸦ �������ּ���.");
		flightViewer.showFlights(startAirportId, endAirportId);
		//����ڷκ��� �����id�� ������ �޴´�.
		int flightId = scan.nextInt();
		System.out.println("�� ������ "+"�� �Դϴ�.");
		ReservationDTO r = new ReservationDTO();
		r.setFlightId(flightId);
		r.setMemberId(logInUser.getId());
		
		//reservationController.insert(reservationDTO)����
		
		reservationController.insert(r);
		flightViewer.reduceSeat(flightId);
		
	}

}
