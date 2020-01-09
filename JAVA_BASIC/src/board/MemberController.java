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
		m1.setNickname("������");

		MemberDTO m2 = new MemberDTO();
		m2.setId(2);
		m2.setUserName("b");
		m2.setPassword("b");
		m2.setNickname("�����1");

		MemberDTO m3 = new MemberDTO();
		m3.setId(3);
		m3.setUserName("c");
		m3.setPassword("c");
		m3.setNickname("�����2");

		list.add(m1);
		list.add(m2);
		list.add(m3);

	}
	
	//�Ʒ� �޼ҵ�� ������ �ִ�.
	//���� ����ڰ� �α����� �� �� ���� �ؾ��ϴ°�
	//�Ʒ� �޼ҵ�� �α����� �Ұ����ϴ�.
	//���� �α����� ����� �޼ҵ尡 �ϳ� �� �ʿ��ϴ�.
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

	//ȸ������
	public void insert(MemberDTO m) {
		//���� MemberDTO�� �����ָ�
		//�츮 list�� �߰����ش�.
		//BoardController���� ó�� ���⵵ ȸ����ȣ�� ����� ��ȣ�� �ϳ� �ʿ��ϴ�.
		currentNumber++;
		m.setId(currentNumber);
		list.add(m);
	}
	
	//ȸ������
	public void delete(MemberDTO m) {
		list.remove(m);
	}
	
	//ȸ������
	public void update(MemberDTO m) {
		list.set(list.indexOf(m), m);
		
	}
	
	//id(���̵�) �ߺ�Ȯ��
	public boolean findId(String id) {
		for(MemberDTO m: list) {
			if(m.getUserName().equals(id)) {
				return true;
			}
		}
		return false;
	}
}
