package airplane2;

import java.util.Scanner;

public class FlightViewer {
	Scanner scan;
	FlightController flightController;
	public FlightViewer(Scanner scan, FlightController flightController) {
		this.scan = scan;
		this.flightController = flightController;
	}
	
	public void showFlights(int startAirportId, int endAirportId) {
		for(FlightDTO f : flightController.selectAll()) {
			if(f.getStartAirportId() == startAirportId && f.getEndAirportId() == endAirportId &&
					f.getSeat() > 0) {
				System.out.println(f.getId() + ". "+f.getNumber() + "편 비행기"+f.getPrice()+f.getSeat());
			}
		}
	}

	public void reduceSeat(int flightId) {
		//원래대로라면 좌석 선택이나 그러한 과정을 통해서 
		//자동으로 좌석이 줄어들게 만들어야 하지만
		//우리는 좌석 선택하는 기능이 없으므로
		//여기서 컨트롤러 호출을 통해서
		//해당 비행편의 남은 자릿수를 하나 줄인다.
		flightController.reduceSeat(flightId);
		
	}

}
