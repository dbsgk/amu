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
			System.out.println("========================��Ʈ�Խ���===================");
			System.out.println("1.�α��� 2. ȸ������ 3. ����");
			System.out.println(">");
			int choice = scan.nextInt();
			scan.nextLine();// ���۸޸𸮺����
			if (choice == 1) {
				// �α��ν���
				MemberDTO logInUser = memberViewer.auth(scan);
				while (logInUser == null) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					logInUser = memberViewer.auth(scan);
				}
				System.out.println(logInUser.getNickname() + "��, ȯ���մϴ�!");
				while (true) {
					System.out.println("1.�Խ��Ǻ��� 2.ȸ���������� 3.ó��ȭ������");
					System.out.println(">");
					choice = scan.nextInt();
					scan.nextLine();
					if (choice == 1) {
						// �Խ��Ǹ�� �ҷ����� �޼ҵ� ����
						boardViewer.list(logInUser, replyViewer);
					} else if (choice == 2) {
						// ȸ������ ���� �޼ҵ� ����
						memberViewer.showOne(logInUser.getId(), boardViewer);
					} else if (choice == 3) {
						break;
					}
				}
			} else if (choice == 2) {
				// ȸ������ ����
				memberViewer.signIn(scan);

			} else if (choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
