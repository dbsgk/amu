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
				System.out.println(f.getId() + ". "+f.getNumber() + "�� �����"+f.getPrice()+f.getSeat());
			}
		}
	}

	public void reduceSeat(int flightId) {
		//������ζ�� �¼� �����̳� �׷��� ������ ���ؼ� 
		//�ڵ����� �¼��� �پ��� ������ ������
		//�츮�� �¼� �����ϴ� ����� �����Ƿ�
		//���⼭ ��Ʈ�ѷ� ȣ���� ���ؼ�
		//�ش� �������� ���� �ڸ����� �ϳ� ���δ�.
		flightController.reduceSeat(flightId);
		
	}

}
