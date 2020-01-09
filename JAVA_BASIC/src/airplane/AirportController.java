package airplane;

import java.util.ArrayList;

public class AirportController {
	private ArrayList<AirportDTO> list;
	private int currentNumber;
	public AirportController() {
		list = new ArrayList<>();
		currentNumber = 4;
		
		AirportDTO a1 = new AirportDTO();
		a1.setId(1);
		a1.setName("incheon");
		a1.setCountry("korea");
		
		AirportDTO a2 = new AirportDTO();
		a2.setId(2);
		a2.setName("gimpo");
		a2.setCountry("korea");
		
		AirportDTO a3 = new AirportDTO();
		a3.setId(3);
		a3.setName("tokyo");
		a3.setCountry("japan");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
	}
	
	public ArrayList<AirportDTO> selectAll(){
		return list;
	}
	
	public AirportDTO select(int id) {
		AirportDTO a = new AirportDTO();
		a.setId(id);
		if(list.indexOf(a)!=-1) {
			return list.get(list.indexOf(a));
		}else {
			return null;
		}
	}
	
	public void insert(AirportDTO a) {
		list.add(a);
	}
	
	public void update(AirportDTO a) {
		list.set(list.indexOf(a), a);
	}
	public void delete(AirportDTO a) {
		list.remove(a);
	}
	
}
