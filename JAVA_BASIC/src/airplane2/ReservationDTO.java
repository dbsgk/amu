package airplane2;

public class ReservationDTO {
	private int id;
	private int memberId;
	private int flightId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	
	public boolean equals(Object o) {
		if(o instanceof ReservationDTO) {
			ReservationDTO r = (ReservationDTO)o;
			if(id == r.id) {
				return true;
			}
		}
		return false;
	}
}

















