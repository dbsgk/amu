package airplane2;

import java.util.ArrayList;

public class ReservationController {
	ArrayList<ReservationDTO> list;
	private int currentNumber = 1;
	public ReservationController() {
		list = new ArrayList<ReservationDTO>();
	}
	public void insert(ReservationDTO r) {
		r.setId(currentNumber);
		list.add(r);
	}
	public ArrayList<ReservationDTO> selectByMemberId(int memberId){
		ArrayList<ReservationDTO> memberList = new ArrayList<ReservationDTO>();
		for(ReservationDTO r : list) {
			if(r.getMemberId() == memberId) {
				memberList.add(r);
			}
		}
		return memberList;
	}
}
