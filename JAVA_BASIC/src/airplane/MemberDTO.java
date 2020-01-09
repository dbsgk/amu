package airplane;

public class MemberDTO {
	private int id;
	private String username;
	private String password;
	//원래대로라면?
	//여권번호, 주민번호, 마일리지.... 이러한 정보들을 모두 넣어야되지만
	//우리는 거기까진 넣지않는다.
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
