package day03;

import java.util.ArrayList;

public class ParkController {
	private ArrayList<Park> list;
	public ArrayList<Park> getList(){
		return list;
	}
	public ParkController() {
		list = new ArrayList<>();
	}
	public void insert(Park p) {
		//파라미터로 넘어온 p를 우리의 list에 추가해준다.
		list.add(p);
	}
	public void delete(Park p) {
		//파라미터로 넘어온 p를 우리의 list에서 제거한다.
		list.remove(p);
	}
	public Park selectOne(String number) {
		//파라미터로 넘어온 String를 이용해서 똑같은 number를 가진 객체를 return해준다.
		Park p = new Park();
		p.setNumber(number);
		
		int index = list.indexOf(p);
		if(index != -1) {
			return list.get(index);
		}else {
			return null;
		}
	}
}
