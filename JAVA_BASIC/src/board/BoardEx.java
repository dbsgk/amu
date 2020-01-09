package board;

import java.util.Scanner;

public class BoardEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardController boardController = new BoardController();
		MemberController memberController = new MemberController();
		ReplyController replyController = new ReplyController();

		MemberViewer memberViewer = new MemberViewer(memberController);
		BoardViewer boardViewer = new BoardViewer(boardController, memberController, scan);
		ReplyViewer replyViewer = new ReplyViewer(memberController, replyController);

		while (true) {
			System.out.println("========================비트게시판===================");
			System.out.println("1.로그인 2. 회원가입 3. 종료");
			System.out.println(">");
			int choice = scan.nextInt();
			scan.nextLine();// 버퍼메모리비워줌
			if (choice == 1) {
				// 로그인시작
				MemberDTO logInUser = memberViewer.auth(scan);
				while (logInUser == null) {
					System.out.println("잘못입력하셨습니다.");
					logInUser = memberViewer.auth(scan);
				}
				System.out.println(logInUser.getNickname() + "님, 환영합니다!");
				while (true) {
					System.out.println("1.게시판보기 2.회원정보보기 3.처음화면으로");
					System.out.println(">");
					choice = scan.nextInt();
					scan.nextLine();
					if (choice == 1) {
						// 게시판목록 불러오는 메소드 실행
						boardViewer.list(logInUser, replyViewer);
					} else if (choice == 2) {
						// 회원정보 보는 메소드 실행
						memberViewer.showOne(logInUser.getId(), boardViewer);
					} else if (choice == 3) {
						break;
					}
				}
			} else if (choice == 2) {
				// 회원가입 시작
				memberViewer.signIn(scan);

			} else if (choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		// memberViewer.showOne(1, boardViewer);
		// boardViewer.list();
		// replyViewer.showAll(2);
		// replyViewer.add(3, 2, scan);
		// replyViewer.showAll(3);
		scan.close();
	}
}
