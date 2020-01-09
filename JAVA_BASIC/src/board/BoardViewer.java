package board;
//ȭ�鿡 �����ִ� Ŭ����

//�� ȭ�鿡�� �ʿ��� ����� �޼ҵ尡 ���ε��� ó���Ѵ�.

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardViewer {
	private BoardController boardController;
	private MemberController memberController;
	private ReplyViewer replyViewer;
	private Scanner scan;
	// ���� ���� ������ Controller�� ���ڻ����ڿ��� �ʱ�ȭ�ϱ� ������
	// �����͸� ���Ͻ����ֱ� �ſ� ����� ���°� �Ǿ���.
	// �׷��� Controller���� �ۿ��� �̸� �����س���
	// �� ��Ʈ�ѷ��� ��"����" �޾Ƽ� ����
	// �����͸� ���Ͻ����ֱ� ��������.
	// �̷��� �ܺ��� Ŭ������ �ʵ�� ���� �ִ� ���
	// �ڱⰡ ����� ���� �ƴ϶�
	// �ܺο��� ������� ���� �ڱ� �ڽ��� �޾Ƽ� ���� ���� ������ �����̶�� �Ѵ�.

	// ���ο��� �길 �������ָ� ��.
	public BoardViewer(BoardController boardController, MemberController memberController, Scanner scan) {
		this.boardController = boardController;
		this.memberController = memberController;
		this.scan = scan;
	}

	// ����ü��� �޼ҵ�
	public void list(MemberDTO logInUser, ReplyViewer replyViewer) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		while (true) {
			ArrayList<BoardDTO> list = boardController.selectAll();
			System.out.println("=====�۸��====");
			for (BoardDTO b : list) {
				MemberDTO m = memberController.selectOne(b.getWriterId());
				System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + m.getNickname() + "\t"
						+ sdf.format(b.getWrittenDate().getTime()) + "\t");
			}
			System.out.println("1.���� �ۼ� 2.�� �������� 3.����ȭ������");
			System.out.println(">");
			int choice = scan.nextInt();

			if (choice == 1) {
				// ���� �ۼ��ϴ� viewer�� write �޼ҵ� ȣ��
				scan.nextLine();
				write(logInUser, replyViewer);
			} else if (choice == 2) {
				// �� ���������ϱ� ���ؼ� ����ڷκ��� id�� �Է¹޴´�.
				System.out.println("���� ������ �� ��ȣ�� �Է����ּ���.");
				int id = scan.nextInt();
				scan.nextLine();
				showOne(id, logInUser,replyViewer);

			} else if (choice == 3) {
				break;
			}
		}
	}

	// ����ڰ� ������ �� �Ѱ��� �����ִ� �޼ҵ�
	public void showOne(int id, MemberDTO logInUser, ReplyViewer replyViewer) {// �ڱⰡ �� �۸� �����ϰ� �ϱ� ���� logInUser �Ķ��Ÿ�ʿ�.
		while (true) {
			BoardDTO b = boardController.select(id);// ���ѷ��� �ȿ� �־ ���泻�� ��� �ݿ���
			if (b == null) {
				// ����ڰ� �������� �ʴ� �۹�ȣ�� �Է��ϸ� null�� ���ϵǹǷ�
				// ���޽����� ����Ѵ�.
				System.out.println("�߸������ϼ̽��ϴ�.");
				break;
			} else {
				// �����ϴ� �۹�ȣ �̹Ƿ� ���� �������� �����ش�.
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");// ��¥ ���� ǥ���ϰԲ� �ڹٰ� �̸�
																							// �޼ҵ常��������.

				System.out.println("============================");
				System.out.println("����: " + b.getTitle());
				System.out.println("�ۼ���: " + b.getWriterId());
				System.out.println("============================");
				System.out.println("�ۼ���: " + sdf.format(b.getWrittenDate().getTime()));
				System.out.println("������: " + sdf.format(b.getUpdatedDate().getTime()));
				System.out.println("============================");
				System.out.println("����: " + b.getContent());
				replyViewer.showAll(id);
				if (b.getWriterId() == logInUser.getId()) {
					System.out.println("1. ���� 2. ���� 3. ��۴ޱ� 4.��ۻ��� 5. �������");
					System.out.println(">");
					int choice = scan.nextInt();
					scan.nextLine();//���⿡ nextInt�� �߸� �־��µ� �׷��� �Ǹ� ���⿡�� ��� �ӹ����� �ִٰ� �Ѵ�.
					if (choice == 1) {
						// �����޼ҵ����
						update(b);// update�޼ҵ常 ���� � ���� �ҷ������� �𸣴ϱ� b�� �־ �˷���.
					} else if (choice == 2) {
						// �����޼ҵ����
						break;
					} else if (choice == 3) {
						// ReplyViewer replyViewer = new ReplyViewer(memberController, replyController);
						replyViewer.add(id, logInUser.getId(), scan);
					} else if (choice == 4) {
						//��ۻ��� �޼ҵ����
						replyViewer.delete(id, logInUser.getId(), scan);
					}else if (choice == 5) {
						break;
					}
				} else {
					System.out.println("1. ��۴ޱ� 2.��ۻ���3.�������");
					System.out.println(">");
					int choice = scan.nextInt();
					scan.nextLine();
					if (choice == 1) {
						// ��۴ٴ� �޼ҵ� ����
						replyViewer.add(id, logInUser.getId(), scan);
					} else if (choice == 2) {
						//��ۻ���
						replyViewer.delete(id, logInUser.getId(), scan);
					} else if(choice ==3) {
						break;
					}

				}
			}
		}
	}

	// ����ڰ� �� �ۼ��� �Ҷ� ���� �޼ҵ�
	public void write(MemberDTO logInUser, ReplyViewer replyViewer) {
		System.out.println("����: ");
		String title = scan.nextLine();
		System.out.println("����: ");
		String content = scan.nextLine();
		/*
		 * System.out.println("���̵�: "); int id =
		 */
		// �̵����� �α��� ������ id�� ����ְ� �����.
		BoardDTO b = new BoardDTO();
		b.setTitle(title);
		b.setContent(content);
		b.setWriterId(logInUser.getId());
		showOne(boardController.insert(b), logInUser, replyViewer);

	}

	// ���� �����ϴ� method
	public void update(BoardDTO b) {
		// = boardController.select(1);
		System.out.println("������ ����: ");
		String title = scan.nextLine();
		System.out.println("������ ����: ");
		String content = scan.nextLine();
		b.setTitle(title);
		b.setContent(content);
		boardController.update(b);
	}

	public void delete(BoardDTO b) {
		System.out.println("��������?? (Y/N)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("Y")) {//equalsIgnoreCase �� �޼ҵ�� ��ҹ��� ������� �������ڸ� ���ٰ� ��������.
			boardController.delete(b);
		}
	}

	public void showByWriterId(int writerId) {
		ArrayList<BoardDTO> list = boardController.selectByWriterId(writerId);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println("=====�������۸��====");
		for (BoardDTO b : list) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriterId() + "\t"
					+ sdf.format(b.getWrittenDate().getTime()) + "\t");
		}

	}
}

//���׿�����
//���׿����ڴ� �����ڷην�
//���ǽ��� Ʈ��� �տ� ����
//false�� �ڿ� ������ ����
//return �ϰų� �Ҵ��ϴ�.
//��, �Ҵ� Ȥ�� ���Ͽ��� ���� �ְ�
//�ܵ� ������ �Ұ����ϴ�.
//�Ҵ��Ұ�(return) ���ǽ�? ������true�϶� ��: false�϶� ��