package board;
import java.util.Scanner;

public class MemberViewer {
	private MemberController memberController;//controller �ʱ�ȭ
	
	public MemberViewer(MemberController memberController) {
		this.memberController = new MemberController();
	}
	public MemberDTO auth(Scanner scan) {
		System.out.println("�α��� ������");
		System.out.println("ID: ");
		String id = scan.nextLine();
		System.out.println("PW: ");
		String pw = scan.nextLine();
		MemberDTO m = memberController.logIn(id, pw);
		return m;
	}
	
	
	public void signIn(Scanner scan) {
		System.out.println("ȸ������ ������");
		System.out.println("ID: ");
		String username = scan.nextLine();
		while(memberController.findId(username)) {
			System.out.println("�ߺ��� ���̵� �Դϴ�.");
			System.out.println("ID: ");
			username = scan.nextLine();
		}
		System.out.println("PW: ");
		String password = scan.nextLine();
		System.out.println("�г���: ");
		String nickname = scan.nextLine();
		MemberDTO m = new MemberDTO();
		m.setUserName(username);
		m.setPassword(password);
		m.setNickname(nickname);
		memberController.insert(m);
	}
	
	
	public void delete(Scanner scan, MemberDTO m) {
		System.out.println("������ ȸ��Ż�� �Ͻðڽ��ϱ�?(Y/N)");
		String choice = scan.nextLine();
		if(choice.equals("Y")) {
			memberController.delete(m);
		}
	}
	
	public void update(Scanner scan, MemberDTO m) {
		System.out.println("��й�ȣ:");
		m.setPassword(scan.nextLine());
		System.out.println("�г���:");
		m.setNickname(scan.nextLine());
		memberController.update(m);
	}
	
	public void showOne(int id, BoardViewer boardViewer) {
		MemberDTO m = memberController.selectOne(id);
		System.out.println("=========================");
		System.out.println("�̸�: "+m.getNickname());
		System.out.println("=========================");
		boardViewer.showByWriterId(m.getId());
		
	}
}
