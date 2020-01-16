package network;

//서버가 데이터를 받을 때 어떤게 좌표고 어떤 게 대화인지 컴퓨터는 모르니까
//앞에 코드를 붙여줘서 데이터 구분을 시킴.
public final class Protocol {
	public static final String ENTER = "100";
	public static final String EXIT = "200";
	public static final String SEND_MESSAGE = "300";
}
