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
		System.out.println("출발지를 선택해주세요.");
		//여기서 출발지 목록을 보여준다.
		airportViewer.showStart();//이게 아래에 있으면 리스트가 안떠요.그러면 번호를 선택할수가 없어요.
		int startAirportId = scan.nextInt();
		System.out.println(("도착지를 선택해주세요"));
		airportViewer.showEnd(startAirportId);
		
		//여기서 출발지로 시작하는 비행기들의 도착지를 보여준다.
		int endAirportId = scan.nextInt();
		
		//사용자가 선택하고 나서는 해당 조건을 만족하는 비행편을 보여준다.
		//단 자리가 이미 꽉찬 비행기는 아예 보여주지 않는다.
		
		System.out.println("탑승할 비행기를 선택해주세요.");
		flightViewer.showFlights(startAirportId, endAirportId);
		//사용자로부터 비행기id를 선택을 받는다.
		int flightId = scan.nextInt();
		System.out.println("총 가격은 "+"원 입니다.");
		ReservationDTO r = new ReservationDTO();
		r.setFlightId(flightId);
		r.setMemberId(logInUser.getId());
		
		//reservationController.insert(reservationDTO)실행
		
		reservationController.insert(r);
		flightViewer.reduceSeat(flightId);
		
	}

}
