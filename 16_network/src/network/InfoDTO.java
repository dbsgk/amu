package network;

import java.io.Serializable;

public class InfoDTO implements Serializable  {
	
	public static enum Protocol{IN, OUT, MSG}
	
	private String nickName;
	private String code;
	private String msg;
	
	public InfoDTO(String nickName, String code, String msg) {
		this.nickName = nickName;
		this.code = code;
		this.msg = msg;
	}
	public InfoDTO(String nickName, String code) {
		this.nickName = nickName;
		this.code = code;
	}
	public InfoDTO() {}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
