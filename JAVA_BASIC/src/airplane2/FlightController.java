package airplane2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class FlightController {
	private ArrayList<FlightDTO> list;
	private int currentNumber;
	public FlightController() {
		list = new ArrayList<FlightDTO>();
		Calendar cal = Calendar.getInstance();
		FlightDTO f = new FlightDTO();
		f.setId(1);
		cal.set(2019, 12, 13, 13, 30);
		f.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f.setEndTime(cal);
		f.setStartAirportId(1);
		f.setEndAirportId(2);
		f.setNumber("KE012");
		f.setPrice(50000);
		f.setSeat(10);
		
		FlightDTO f2 = new FlightDTO();
		f2.setId(2);
		cal.set(2019, 12, 13, 13, 30);
		f2.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f2.setEndTime(cal);
		f2.setStartAirportId(1);
		f2.setEndAirportId(3);
		f2.setNumber("KE013");
		f2.setPrice(30000);
		f2.setSeat(5);
		
		FlightDTO f3 = new FlightDTO();
		f3.setId(3);
		cal.set(2019, 12, 13, 13, 30);
		f3.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f3.setEndTime(cal);
		f3.setStartAirportId(2);
		f3.setEndAirportId(1);
		f3.setNumber("KE021");
		f3.setPrice(50000);
		f3.setSeat(0);
		
		FlightDTO f4 = new FlightDTO();
		f4.setId(4);
		cal.set(2019, 12, 13, 13, 30);
		f4.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f4.setEndTime(cal);
		f4.setStartAirportId(2);
		f4.setEndAirportId(3);
		f4.setNumber("KE023");
		f4.setPrice(40000);
		f4.setSeat(10);
		
		FlightDTO f5 = new FlightDTO();
		f5.setId(5);
		cal.set(2019, 12, 13, 13, 30);
		f5.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f5.setEndTime(cal);
		f5.setStartAirportId(3);
		f5.setEndAirportId(1);
		f5.setNumber("KE031");
		f5.setPrice(50000);
		f5.setSeat(10);
		
		FlightDTO f6 = new FlightDTO();
		f6.setId(6);
		cal.set(2019, 12, 13, 13, 30);
		f6.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f6.setEndTime(cal);
		f6.setStartAirportId(3);
		f6.setEndAirportId(2);
		f6.setNumber("KE032");
		f6.setPrice(30000);
		f6.setSeat(10);
		
		list.add(f);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		list.add(f6);
	}

	public ArrayList<FlightDTO> selectAll() {
		return list;
	}

	public void reduceSeat(int flightId) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId()==flightId) {
				list.get(i).setSeat(list.get(i).getSeat()-1);
			}
		}
	}
}
