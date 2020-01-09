package board;
//게시글을 담당하는 DTO(Data Transfer Object)
//게시글에는 글의id, 제목, 작성자id, 내용, 작성일 , 수정일이 필드로 있게 된다.
//또한 우리가 ArrayList로 컨트롤 해야하는 일도 있기 때문에
//equals()메소드까지 구현해준다.

import java.util.Calendar;

public class BoardDTO {
	private int id;//글id
	private String title;
	private int writerId;
	private String content;//글내용
	private Calendar writtenDate;
	private Calendar updatedDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
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
	public Calendar getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public boolean equals(Object o) {
		if(o instanceof BoardDTO) {
			BoardDTO b = (BoardDTO)o;
			if(this.id==b.id) {
				return true;
			}
		}
		
		return false;
	}
}
