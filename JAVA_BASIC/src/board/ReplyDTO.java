package board;

import java.util.Calendar;

public class ReplyDTO {
	private int id;//댓글번호
	private int boardId;//글의번호
	private int memberId;//회원번호
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
