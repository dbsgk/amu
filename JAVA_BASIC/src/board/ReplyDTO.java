package board;

import java.util.Calendar;

public class ReplyDTO {
	private int id;//��۹�ȣ
	private int boardId;//���ǹ�ȣ
	private int memberId;//ȸ����ȣ
	private String content;
	private Calendar writtenDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Calendar getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Calendar writtenDate) {
		this.writtenDate = writtenDate;
	}
	public boolean equals(Object o) {
		if(o instanceof ReplyDTO) {
			ReplyDTO r = (ReplyDTO)o;
			if(id==r.id) {
				return true;
			}
		}
		return false;
	}
	
}
