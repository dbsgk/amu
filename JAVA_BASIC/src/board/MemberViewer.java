package board;
import java.util.Scanner;

public class MemberViewer {
	private MemberController memberController;//controller 초기화
	
	public MemberViewer(MemberController memberController) {
		this.memberController = new MemberController();
	}
	public MemberDTO auth(Scanner scan) {
		System.out.println("로그인 페이지");
		System.out.println("ID: ");
		String id = scan.nextLine();
		System.out.println("PW: ");
		String pw = scan.nextLine();
		MemberDTO m = memberController.logIn(id, pw);
		return m;
	}
	
	
	public void signIn(Scanner scan) {
		System.out.println("회원가입 페이지");
		System.out.println("ID: ");
		String username = scan.nextLine();
		while(memberController.findId(username)) {
			System.out.println("중복된 아이디 입니다.");
			System.out.println("ID: ");
			username = scan.nextLine();
		}
		System.out.println("PW: ");
		String password = scan.nextLine();
		System.out.println("닉네임: ");
		String nickname = scan.nextLine();
		MemberDTO m = new MemberDTO();
		m.setUserName(username);
		m.setPassword(password);
		m.setNickname(nickname);
		memberController.insert(m);
	}
	
	
	public void delete(Scanner scan, MemberDTO m) {
		System.out.println("정말로 회원탈퇴를 하시겠습니까?(Y/N)");
		String choice = scan.nextLine();
		if(choice.equals("Y")) {
			memberController.delete(m);
		}
	}
	
	public void update(Scanner scan, MemberDTO m) {
		System.out.println("비밀번호:");
		m.setPassword(scan.nextLine());
		System.out.println("닉네임:");
		m.setNickname(scan.nextLine());
		memberController.update(m);
	}
	
	public void showOne(int id, BoardViewer boardViewer) {
		MemberDTO m = memberController.selectOne(id);
		System.out.println("=========================");
		System.out.println("이름: "+m.getNickname());
		System.out.println("=========================");
		boardViewer.showByWriterId(m.getId());
		
	}
}
