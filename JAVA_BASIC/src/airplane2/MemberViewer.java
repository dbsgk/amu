package airplane2;

import java.util.Scanner;

public class MemberViewer {
	Scanner scan;
	MemberController memberController;
	public MemberViewer(MemberController memberController, Scanner scan) {
		this.memberController = memberController;
		this.scan = scan;
	}
	public MemberDTO logIn() {
		System.out.println("ID: ");
		String id = scan.nextLine();
		System.out.println("PW: ");
		String pw = scan.nextLine();
		
		return memberController.auth(id, pw);
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

	public void signIn() {
		System.out.println("id: ");
		String id = scan.nextLine();
		System.out.println("pw: ");
		String pw = scan.nextLine();
		while(memberController.findUsername(id)) {
			System.out.println("중복된 id입니다.");
			System.out.println("id: ");
			id = scan.nextLine();
		}
		MemberDTO m = new MemberDTO();
		m.setUsername(id);
		m.setPassword(pw);
		memberController.insert(m);
	}

}
