package airplane3;

import java.util.ArrayList;

public class MemberController {
	private ArrayList<MemberDTO> list;
	private int currentNumber;//??�̰� ����?
	public MemberController() {
		list = new ArrayList<MemberDTO>();
		currentNumber = 4;
		
		MemberDTO m1 = new MemberDTO();
		m1.setId(1);
		m1.setUsername("a");
		m1.setPassword("a");
		
		MemberDTO m2 = new MemberDTO();
		m2.setId(2);
		m2.setUsername("b");
		m2.setPassword("b");
		
		MemberDTO m3 = new MemberDTO();
		m3.setId(3);
		m3.setUsername("c");
		m3.setPassword("c");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
	}//������
	
	public ArrayList<MemberDTO> selectAll(){//ȸ����ü ����Ʈ
		return list;
	}
	
	public MemberDTO select(int id) {
		MemberDTO m = new MemberDTO();
		m.setId(id);
		if(list.indexOf(m) != -1) {//���°� �ƴ϶��
			
		}
		
	}
}//class
