package airplane2;

public class MemberDTO {
	private int id;
	private String username;
	private String password;
	//������ζ��?
	//���ǹ�ȣ, �ֹε�Ϲ�ȣ, ���ϸ���.... �̷��� �������� ��� �־�ߵ�����
	//�츮�� �ű���� �����ʴ´�.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberDTO) {
			MemberDTO m = (MemberDTO)obj;
			if(id == m.id) {
				return true;
			}
		}
		return false;
	}
	
}



















