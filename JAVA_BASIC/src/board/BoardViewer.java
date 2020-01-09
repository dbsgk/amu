package board;
//화면에 보여주는 클래스

//각 화면에서 필요한 출력을 메소드가 따로따로 처리한다.

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardViewer {
	private BoardController boardController;
	private MemberController memberController;
	private ReplyViewer replyViewer;
	private Scanner scan;
	// 지금 현재 뷰어들이 Controller를 각자생성자에서 초기화하기 떄문에
	// 데이터를 통일시켜주기 매우 어려운 형태가 되었다.
	// 그러면 Controller들을 밖에서 미리 생성해놓고
	// 그 컨트롤러를 뷰어가"주입" 받아서 쓰면
	// 데이터를 통일시켜주기 편해진다.
	// 이렇게 외부의 클래스를 필드로 갖고 있는 경우
	// 자기가 만드는 것이 아니라
	// 외부에서 만들어진 것을 자기 자신이 받아서 쓰는 것을 의존성 주입이라고 한다.

	// 메인에선 얘만 실행해주면 됨.
	public BoardViewer(BoardController boardController, MemberController memberController, Scanner scan) {
		this.boardController = boardController;
		this.memberController = memberController;
		this.scan = scan;
	}

	// 글전체목록 메소드
	public void list(MemberDTO logInUser, ReplyViewer replyViewer) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		while (true) {
			ArrayList<BoardDTO> list = boardController.selectAll();
			System.out.println("=====글목록====");
			for (BoardDTO b : list) {
				MemberDTO m = memberController.selectOne(b.getWriterId());
				System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + m.getNickname() + "\t"
						+ sdf.format(b.getWrittenDate().getTime()) + "\t");
			}
			System.out.println("1.새글 작성 2.글 개별보기 3.메인화면으로");
			System.out.println(">");
			int choice = scan.nextInt();

			if (choice == 1) {
				// 새글 작성하는 viewer의 write 메소드 호출
				scan.nextLine();
				write(logInUser, replyViewer);
			} else if (choice == 2) {
				// 글 개별보기하기 위해서 사용자로부터 id를 입력받는다.
				System.out.println("개별 보기할 글 번호를 입력해주세요.");
				int id = scan.nextInt();
				scan.nextLine();
				showOne(id, logInUser,replyViewer);

			} else if (choice == 3) {
				break;
			}
		}
	}

	// 사용자가 선택한 글 한개를 보여주는 메소드
	public void showOne(int id, MemberDTO logInUser, ReplyViewer replyViewer) {// 자기가 쓴 글만 수정하게 하기 위해 logInUser 파라미타필요.
		while (true) {
			BoardDTO b = boardController.select(id);// 무한루프 안에 있어서 변경내용 계속 반영됨
			if (b == null) {
				// 사용자가 존재하지 않는 글번호를 입력하면 null이 리턴되므로
				// 경고메시지를 출력한다.
				System.out.println("잘못선택하셨습니다.");
				break;
			} else {
				// 존재하는 글번호 이므로 글의 상세정보를 보여준다.
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");// 날짜 편히 표시하게끔 자바가 미리
																							// 메소드만들어놓았음.

				System.out.println("============================");
				System.out.println("제목: " + b.getTitle());
				System.out.println("작성자: " + b.getWriterId());
				System.out.println("============================");
				System.out.println("작성일: " + sdf.format(b.getWrittenDate().getTime()));
				System.out.println("수정일: " + sdf.format(b.getUpdatedDate().getTime()));
				System.out.println("============================");
				System.out.println("내용: " + b.getContent());
				replyViewer.showAll(id);
				if (b.getWriterId() == logInUser.getId()) {
					System.out.println("1. 수정 2. 삭제 3. 댓글달기 4.댓글삭제 5. 목록으로");
					System.out.println(">");
					int choice = scan.nextInt();
					scan.nextLine();//여기에 nextInt를 잘못 넣었는데 그렇게 되면 여기에서 계속 머무르고 있다고 한다.
					if (choice == 1) {
						// 수정메소드실행
						update(b);// update메소드만 쓰면 어떤 글을 불러오는지 모르니까 b를 넣어서 알려줌.
					} else if (choice == 2) {
						// 삭제메소드실행
						break;
					} else if (choice == 3) {
						// ReplyViewer replyViewer = new ReplyViewer(memberController, replyController);
						replyViewer.add(id, logInUser.getId(), scan);
					} else if (choice == 4) {
						//댓글삭제 메소드실행
						replyViewer.delete(id, logInUser.getId(), scan);
					}else if (choice == 5) {
						break;
					}
				} else {
					System.out.println("1. 댓글달기 2.댓글삭제3.목록으로");
					System.out.println(">");
					int choice = scan.nextInt();
					scan.nextLine();
					if (choice == 1) {
						// 댓글다는 메소드 실행
						replyViewer.add(id, logInUser.getId(), scan);
					} else if (choice == 2) {
						//댓글삭제
						replyViewer.delete(id, logInUser.getId(), scan);
					} else if(choice ==3) {
						break;
					}

				}
			}
		}
	}

	// 사용자가 글 작성을 할때 사용될 메소드
	public void write(MemberDTO logInUser, ReplyViewer replyViewer) {
		System.out.println("제목: ");
		String title = scan.nextLine();
		System.out.println("내용: ");
		String content = scan.nextLine();
		/*
		 * System.out.println("아이디: "); int id =
		 */
		// 이따가는 로그인 유저의 id도 집어넣게 만든다.
		BoardDTO b = new BoardDTO();
		b.setTitle(title);
		b.setContent(content);
		b.setWriterId(logInUser.getId());
		showOne(boardController.insert(b), logInUser, replyViewer);

	}

	// 글을 수정하는 method
	public void update(BoardDTO b) {
		// = boardController.select(1);
		System.out.println("수정할 제목: ");
		String title = scan.nextLine();
		System.out.println("수정할 내용: ");
		String content = scan.nextLine();
		b.setTitle(title);
		b.setContent(content);
		boardController.update(b);
	}

	public void delete(BoardDTO b) {
		System.out.println("정말삭제?? (Y/N)");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("Y")) {//equalsIgnoreCase 이 메소드는 대소문자 관계없이 같은문자면 같다고 인정해줌.
			boardController.delete(b);
		}
	}

	public void showByWriterId(int writerId) {
		ArrayList<BoardDTO> list = boardController.selectByWriterId(writerId);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println("=====내가쓴글목록====");
		for (BoardDTO b : list) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriterId() + "\t"
					+ sdf.format(b.getWrittenDate().getTime()) + "\t");
		}

	}
}

//삼항연산자
//삼항연잔자는 연산자로로써
//조건식이 트루면 앞에 것을
//false면 뒤에 나오는 것을
//return 하거나 할당하다.
//즉, 할당 혹은 리턴에만 쓸수 있고
//단독 실행은 불가능하다.
//할당할곳(return) 조건식? 조건이true일때 값: false일때 값