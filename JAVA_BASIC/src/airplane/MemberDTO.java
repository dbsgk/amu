package airplane;

public class MemberDTO {
	private int id;
	private String username;
	private String password;
	//������ζ��?
	//���ǹ�ȣ, �ֹι�ȣ, ���ϸ���.... �̷��� �������� ��� �־�ߵ�����
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
	//source>
	public boolean equals(Object o) {
		if(o instanceof MemberDTO) {
			MemberDTO m = (MemberDTO)o;
			if(id==m.id) {
				return true;
			}
		}
		return false;
	}
}
