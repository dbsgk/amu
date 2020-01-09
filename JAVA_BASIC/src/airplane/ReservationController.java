package airplane;

import java.util.ArrayList;

public class ReservationController {
	private ArrayList<ReservationDTO> list;
	private int currentNumber;

	public ReservationController() {
		list = new ArrayList<>();
		currentNumber = 4;
		
		ReservationDTO r1 = new ReservationDTO();
		r1.setId(1);
		r1.setMemberId(1);
		r1.setFlightId(101);

		ReservationDTO r2 = new ReservationDTO();
		r2.setId(2);
		r2.setMemberId(2);
		r2.setFlightId(102);
		
		ReservationDTO r3 = new ReservationDTO();
		r3.setId(3);
		r3.setMemberId(3);
		r3.setFlightId(103);
		
		list.add(r1);
		list.add(r2);
		list.add(r3);
	}
	
	public ArrayList<ReservationDTO> selectAll(){
		return list;
	}
	
	public ReservationDTO select(int id) {
		ReservationDTO r= new ReservationDTO();
		r.setId(id);
		if(list.indexOf(r)!=-1) {
			return list.get(list.indexOf(r));
		}else {
			return null;
		}
	}
	public void insert(ReservationDTO r) {
		list.add(r);
	}
	
	public void update(ReservationDTO r) {
		list.set(list.indexOf(r), r);
	}
	public void delete(ReservationDTO r) {
		list.remove(r);
	}
	
}
