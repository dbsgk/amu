package board;

import java.util.ArrayList;

public class MemberController {
	private ArrayList<MemberDTO> list;
	private int currentNumber;
	public MemberController() {
		list = new ArrayList<MemberDTO>();
		currentNumber =3;
		
		MemberDTO m1 = new MemberDTO();
		m1.setId(1);
		m1.setUserName("a");
		m1.setPassword("a");
		m1.setNickname("관리자");

		MemberDTO m2 = new MemberDTO();
		m2.setId(2);
		m2.setUserName("b");
		m2.setPassword("b");
		m2.setNickname("사용자1");

		MemberDTO m3 = new MemberDTO();
		m3.setId(3);
		m3.setUserName("c");
		m3.setPassword("c");
		m3.setNickname("사용자2");

		list.add(m1);
		list.add(m2);
		list.add(m3);

	}
	
	//아래 메소드는 문제가 있다.
	//과연 사용자가 로그인을 할 때 어케 해야하는가
	//아래 메소드는 로그인이 불가능하다.
	//따라서 로그인을 담당할 메소드가 하나 더 필요하다.
	public MemberDTO selectOne(int id) {
		MemberDTO m = new MemberDTO();
		m.setId(id);
		if (list.indexOf(m) == -1) {
			return null;
		} else {
			return list.get(list.indexOf(m));
		}
	}
	
	//
	public MemberDTO logIn(String username, String password) {
		for(MemberDTO m: list) {
			if(m.getUserName().equals(username) && m.getPassword().equals(password)) {
				return m;
			}
		}
		return null;
	}

	//회원가입
	public void insert(MemberDTO m) {
		//뷰어에서 MemberDTO를 보내주면
		//우리 list에 추가해준다.
		//BoardController에서 처럼 여기도 회원번호를 담당할 번호가 하나 필요하다.
		currentNumber++;
		m.setId(currentNumber);
		list.add(m);
	}
	
	//회원삭제
	public void delete(MemberDTO m) {
		list.remove(m);
	}
	
	//회원수정
	public void update(MemberDTO m) {
		list.set(list.indexOf(m), m);
		
	}
	
	//id(아이디) 중복확인
	public boolean findId(String id) {
		for(MemberDTO m: list) {
			if(m.getUserName().equals(id)) {
				return true;
			}
		}
		return false;
	}
}
