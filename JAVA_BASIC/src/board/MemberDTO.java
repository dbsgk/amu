package board;
//회원정보틀
public class MemberDTO {
	private int id;
	private String userName;
	private String password;
	private String nickname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {//여기 받아오는 값;변수이름(userName 갈색)이랑
		this.userName = userName;//여기 userName(갈색)이랑 이름 다르면 값저장안됨
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public boolean equals(Object o) {
		if(o instanceof MemberDTO ) {
			MemberDTO m = (MemberDTO)o;
			if(id==m.id) {
				return true;
			}
		}
		
		return false;
	}

}
