package airplane2;

public class MemberDTO {
	private int id;
	private String username;
	private String password;
	//원래대로라면?
	//여권번호, 주민등록번호, 마일리지.... 이러한 정보들을 모두 넣어야되지만
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



















