package airplane;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class FlightController {
	private ArrayList<FlightDTO> list;
	private int currentNumber;

	public FlightController() {

		Calendar cal = Calendar.getInstance();
		// 월은 0부터 11까지라서 12월을 표시할때는 12가 아닌 11을 넣어야 한다.
		cal.set(2019, 12, 13, 13, 30);
		FlightDTO f = new FlightDTO();
		f.setStartTime(cal);
		cal.set(2019, 12, 13, 20, 30);
		f.setEndTime(cal);

		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm");

		list = new ArrayList<FlightDTO>();
		currentNumber = 4;

		FlightDTO f1 = new FlightDTO();
		f1.setId(1);
		f1.setStartAirportId(1);
		f1.setEndAirportId(2);
		f1.setNumber("a");
		cal.set(2019, 11, 13, 13, 30);
		f1.setStartTime(cal);
		cal.set(2019, 11, 13, 20, 30);
		f1.setEndTime(cal);

		f1.setSeat(1);
		f1.setPrice(100);

		FlightDTO f2 = new FlightDTO();
		f2.setId(2);
		f2.setStartAirportId(1);
		f2.setEndAirportId(2);
		f2.setNumber("b");

		cal.set(2019, 11, 23, 13, 30);
		f2.setStartTime(cal);
		cal.set(2019, 11, 23, 20, 30);
		f2.setEndTime(cal);

		f2.setSeat(2);
		f2.setPrice(200);

		FlightDTO f3 = new FlightDTO();
		f3.setId(3);
		f3.setStartAirportId(2);
		f3.setEndAirportId(3);
		f3.setNumber("c");
		cal.set(2019, 11, 30, 13, 30);
		f3.setStartTime(cal);
		cal.set(2019, 11, 30, 20, 30);
		f3.setEndTime(cal);
		f3.setSeat(3);
		f3.setPrice(300);

		list.add(f1);
		list.add(f2);
		list.add(f3);

		for (FlightDTO flight : list) {
			System.out.println(sdf.format(flight.getStartTime().getTime()));
			System.out.println(sdf.format(flight.getEndTime().getTime()));
		}
	}

	public static void main(String[] args) {
		FlightController f = new FlightController();
	}

	public ArrayList<FlightDTO> selectAll() {
		return list;
	}

	public FlightDTO select(int id) {
		FlightDTO f = new FlightDTO();
		f.setId(id);
		if (list.indexOf(f) != -1) {
			return list.get(list.indexOf(f));
		} else {
			return null;
		}
	}

	public void insert(FlightDTO f) {
		list.add(f);
	}

	public void update(FlightDTO f) {
		list.set(list.indexOf(f), f);
	}

	public void delete(FlightDTO f) {
		list.remove(f);
	}

	// authentication 항공편존재확인
	public FlightDTO auth(int id) {
		for (FlightDTO f : list) {
			if (f.getId()==id) {
				return f;
			}
		}
		return null;
	}

	public boolean findId(int id) {
		for (FlightDTO f : list) {
			if (f.getId() == id) {
				return true;
			}
		}
		return false;
	}
}
