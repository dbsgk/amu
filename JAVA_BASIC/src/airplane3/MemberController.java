package airplane3;

import java.util.ArrayList;

public class MemberController {
	private ArrayList<MemberDTO> list;
	private int currentNumber;//??이거 뭐지?
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
	}//생성자
	
	public ArrayList<MemberDTO> selectAll(){//회원전체 리스트
		return list;
	}
	
	public MemberDTO select(int id) {
		MemberDTO m = new MemberDTO();
		m.setId(id);
		if(list.indexOf(m) != -1) {//없는게 아니라면
			
		}
		
	}
}//class
