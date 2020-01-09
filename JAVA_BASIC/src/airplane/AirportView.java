package airplane;

import java.util.ArrayList;
import java.util.Scanner;

public class AirportView {
	Scanner scan = new Scanner(System.in);
	AirportController airportController = new AirportController();
	
	//������
	public AirportView(AirportController airportController) {
		this.airportController= airportController;
	}
	public AirportView() {
		
	}
	
	//������ü���
	public void list() {
		while(true) {
			ArrayList<AirportDTO> list = airportController.selectAll();
			System.out.println("=====��ü ���� ���=====");
			for(AirportDTO a: list) {
				System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getCountry());
			}
		}
	}
	
	
}
