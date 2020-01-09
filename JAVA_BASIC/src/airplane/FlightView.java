package airplane;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightView {

	Scanner scan = new Scanner(System.in);
	FlightController flightController = new FlightController();

	// 생성자
	public FlightView(FlightController flightController) {
		this.flightController = flightController;
	}
	public FlightView() {
		
	}

	// 공항전체목록(BoardViewer list참조)
	public void list() {
		while (true) {
			ArrayList<FlightDTO> list = flightController.selectAll();
			System.out.println("=====전체 항공편 목록=====");
			for (FlightDTO f : list) {
				System.out.println(
						f.getId() + "\t" + f.getStartAirportId() + "\t" + f.getEndAirportId() + "\t" + f.getNumber()
								+ f.getStartTime() + "\t" + f.getEndTime() + "\t" + f.getSeat() + "\t" + f.getPrice());
			}
			//항공번호입력받기(borad.MemberViewer auth참조)
			System.out.println("예약할 항공편 번호를 입력해주세요");
			System.out.println(">");
			//FlightDTO selectFlight = F
			int id = scan.nextInt();
			scan.nextLine();
			//존재하는운항(BoardEx 23줄 로그인참조)
			while(flightController.findId(id)) {
				System.out.println("해당 운항은 존재하지 않습니다.");
				System.out.println("항공편 번호:");
				id = scan.nextInt();
			}
			
		}
	}

}
