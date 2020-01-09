package airplane2;

import java.util.ArrayList;

public class AirportController {
	ArrayList<AirportDTO> list;
	public AirportController() {
		list = new ArrayList<AirportDTO>();
		AirportDTO a1 = new AirportDTO();
		a1.setId(1);
		a1.setCountry("한국");
		a1.setName("인천국제공항");
		
		AirportDTO a2 = new AirportDTO();
		a2.setId(2);
		a2.setCountry("일본");
		a2.setName("도쿄 나리타공항");
		
		AirportDTO a3 = new AirportDTO();
		a3.setId(3);
		a3.setCountry("중국");
		a3.setName("베이징국제공항");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
	}
	public ArrayList<AirportDTO> selectAll() {
		return list;
	}

}


