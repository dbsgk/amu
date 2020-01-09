package board;

import java.util.ArrayList;
import java.util.Calendar;

public class ReplyController {
	private ArrayList<ReplyDTO> list;
	private int currentNumber;

	public ReplyController() {
		currentNumber = 3;
		list = new ArrayList<ReplyDTO>();

		ReplyDTO r1 = new ReplyDTO();
		r1.setId(1);
		r1.setBoardId(1);
		r1.setMemberId(2);
		r1.setContent("글1의 댓글1");
		r1.setWrittenDate(Calendar.getInstance());

		ReplyDTO r2 = new ReplyDTO();
		r2.setId(2);
		r2.setBoardId(2);
		r2.setMemberId(3);
		r2.setContent("글2의 댓글1");
		r2.setWrittenDate(Calendar.getInstance());

		ReplyDTO r3 = new ReplyDTO();
		r3.setId(3);
		r3.setBoardId(2);
		r3.setMemberId(1);
		r3.setContent("글1의 댓글2");
		r3.setWrittenDate(Calendar.getInstance());

		list.add(r1);
		list.add(r2);
		list.add(r3);
	}

	// 근데 잘 생각해보자.
	// 댓글이 단독적으로 전체목록보기로 볼 일이 있을까?
	// 정답은 아니오이다.
	// 댓글은 리스트로 출력이 되지만
	// 항상 특정 글에 속해있는 형태기 때문에
	// 현재 댓글을 보여줄 글의 번호가 꼭 필요하다.
	public ArrayList<ReplyDTO> selectAll(int boardId) {
		ArrayList<ReplyDTO> boardReplyList = new ArrayList<ReplyDTO>();
		for (ReplyDTO r : list) {
			if (r.getBoardId() == boardId) {
				boardReplyList.add(r);
			}
		}
		return boardReplyList;
	}

	public void insert(ReplyDTO r) {
		currentNumber++;
		r.setId(currentNumber);
		r.setWrittenDate(Calendar.getInstance());
		list.add(r);
	}

	public void delete(ReplyDTO r) {
		list.remove(r);
	}

	public ReplyDTO select(int id) {
		ReplyDTO r = new ReplyDTO();
		r.setId(id);
		if (list.indexOf(r) != -1) {
			return list.get(list.indexOf(r));
		} else {
			return null;
		}

	}

}
