package airplane;

import java.util.Scanner;

/*import board.BoardViewer;
import board.MemberController;
import board.MemberDTO;
*/
public class MemberView {
	Scanner scan;
	private MemberController memberController;

	public MemberView(MemberController memberController) {
		this.memberController = new MemberController();
		this.scan = scan;
	}

	public MemberDTO auth(Scanner scan) {
		System.out.println("로그인 페이지");
		System.out.println("ID: ");
		String id = scan.nextLine();
		System.out.println("PW: ");
		String pw = scan.nextLine();
		
		return memberController.auth(id, pw);
		
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

}
