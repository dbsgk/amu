package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplyViewer {
	private MemberController memberController;
	private ReplyController replyController;
	public ReplyViewer(MemberController memberController, ReplyController replyController) {
		this.memberController = memberController;
		this.replyController = replyController;
	}
	
	public void showAll(int boardId) {
		ArrayList<ReplyDTO> list = replyController.selectAll(boardId);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd h:m:s");
		for(ReplyDTO r: list) {
			MemberDTO m = memberController.selectOne(r.getMemberId());
			System.out.println("----------------------------------------------------");
			System.out.println(r.getContent()+"\t"+m.getNickname()+"\t"+sdf.format(r.getWrittenDate().getTime()));
		}
	}
	
	public void add(int boardId, int writerId, Scanner scan) {
		System.out.println("댓글 내용을 입력하세요: ");
		String content = scan.nextLine();
		ReplyDTO r = new ReplyDTO();
		r.setContent(content);
		r.setBoardId(boardId);
		r.setMemberId(writerId);
		replyController.insert(r);
		
	}
	
	public void delete(int boardId, int memberId, Scanner scan) {
		ArrayList<ReplyDTO> list = replyController.selectAll(boardId);
		System.out.println("삭제할 댓글을 선택해주세요");
		for(ReplyDTO r: list) {
			System.out.println(r.getId()+"\t"+r.getContent());
		}
		System.out.println(">");
		int choice = scan.nextInt();
		ReplyDTO r = replyController.select(choice);
		if(r != null) {
			if(r.getMemberId()==memberId) {
				System.out.println("댓글을 삭제하시겠습니까(Y/N)");
				scan.nextLine();
				String agree = scan.nextLine();
				if(agree.equalsIgnoreCase("Y")) {//equalsIgnoreCase 이 메소드는 대소문자 관계없이 같은문자면 같다고 인정해줌.
					replyController.delete(r);
				}
			}
		}
	}
}
