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
		//�Ķ���ͷ� �Ѿ�� p�� �츮�� list�� �߰����ش�.
		list.add(p);
	}
	public void delete(Park p) {
		//�Ķ���ͷ� �Ѿ�� p�� �츮�� list���� �����Ѵ�.
		list.remove(p);
	}
	public Park selectOne(String number) {
		//�Ķ���ͷ� �Ѿ�� String�� �̿��ؼ� �Ȱ��� number�� ���� ��ü�� return���ش�.
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
