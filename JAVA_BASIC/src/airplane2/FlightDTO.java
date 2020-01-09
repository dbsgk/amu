package airplane2;

import java.util.Calendar;

public class FlightDTO {
	private int id;
	private int startAirportId;
	private int endAirportId;
	private String number;
	private Calendar startTime;
	private Calendar endTime;
	private int seat;
	private int price;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getStartAirportId() {
		return startAirportId;
	}


	public void setStartAirportId(int startAirportId) {
		this.startAirportId = startAirportId;
	}


	public int getEndAirportId() {
		return endAirportId;
	}


	public void setEndAirportId(int endAirportId) {
		this.endAirportId = endAirportId;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public Calendar getStartTime() {
		return startTime;
	}


	public void setStartTime(Calendar startTime) {
		this.startTime = Calendar.getInstance();
		this.startTime.setTime(startTime.getTime());
	}


	public Calendar getEndTime() {
		return endTime;
	}


	public void setEndTime(Calendar endTime) {
		this.endTime = Calendar.getInstance();
		this.endTime.setTime(endTime.getTime());
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int seat) {
		this.seat = seat;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public boolean equals(Object o) {
		if(o instanceof FlightDTO) {
			FlightDTO f = (FlightDTO)o;
			if(id == f.id) {
				return true;
			}
		}
		return false;
	}
}


















