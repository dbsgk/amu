package airplane;

import java.util.ArrayList;
import java.util.Scanner;

public class AirportView {
	Scanner scan = new Scanner(System.in);
	AirportController airportController = new AirportController();
	
	//생성자
	public AirportView(AirportController airportController) {
		this.airportController= airportController;
	}
	public AirportView() {
		
	}
	
	//공항전체목록
	public void list() {
		while(true) {
			ArrayList<AirportDTO> list = airportController.selectAll();
			System.out.println("=====전체 공항 목록=====");
			for(AirportDTO a: list) {
				System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getCountry());
			}
		}
	}
	
	
}
