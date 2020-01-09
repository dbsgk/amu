package board;

import java.util.ArrayList;
import java.util.Calendar;

//BoradDTO를 컨트롤 해서 객체를 viewer로 보내주는 controller클래스

public class BoardController {
	
	private ArrayList<BoardDTO> list;
	private int currentNumber;//마지막으로 작성된 글번호

	public BoardController() {
		list = new ArrayList<BoardDTO>();
		
		BoardDTO b1 = new BoardDTO();
		b1.setId(1);
		b1.setTitle("게시글1");
		b1.setWriterId(1);
		b1.setContent("게시글1의내용");
		// 캘린더는 날짜표시하는 클래스
		// 일반 생성자로 값을 초기화하는것이 아니라
		// 캘린더의 getInstance라는 static method를 이용해서
		// 현재날짜로 초기화.
		Calendar cal = Calendar.getInstance();
		b1.setWrittenDate(cal);
		b1.setUpdatedDate(cal);

		BoardDTO b2 = new BoardDTO();
		b2.setId(2);
		b2.setTitle("게시글2");
		b2.setWriterId(2);
		b2.setContent("게시글2의내용");
		b2.setWrittenDate(cal);
		b2.setUpdatedDate(cal);

		BoardDTO b3 = new BoardDTO();
		b3.setId(3);
		b3.setTitle("게시글3");
		b3.setWriterId(1);
		b3.setContent("게시글3의내용");
		b3.setWrittenDate(cal);
		b3.setUpdatedDate(cal);

		list.add(b1);
		list.add(b2);
		list.add(b3);

	}
	
	//현재 저장되어있는 모든 글을 보여주는 method
	//글전체목록반환
	public ArrayList<BoardDTO> selectAll(){
		//원래대로라면 데이터베이스와 통신해서
		//데이터베이스의 게시글 테이블 내용을 다 긁어와서
		//ArrayList에 담아서 return해줘야 하지만
		//우리는 field에 있는 list리턴해준다.
		return list;
	}
	
	//사용자가 선택한 글을 하나만 보내주는 method
	public BoardDTO select(int id) {
		//데이터베이스에 요청을 보낼때에는
		//굳이 우리가 null로 안만들어줘도 되지만
		//우리는 데이터베이스가 아니기때문에
		//검증을 통해서
		//해당 글 번호가 존재하는 번호인지 확인하고
		//존재하지 않으면 null을 리턴해준다.
		BoardDTO b = new BoardDTO();
		b.setId(id);

		if (list.indexOf(b) == -1) {
			return null;
		} else {
			return list.get(list.indexOf(b));
		}
	}
	
	//사용자가 게시글 작성 요청을 보내면
	//BoardDTO 객체를 받아서 우리 list에 추가하는 method
	public int insert(BoardDTO b) {
		currentNumber++;
		b.setId(currentNumber);
		b.setWrittenDate(Calendar.getInstance());//작성날짜
		b.setUpdatedDate(Calendar.getInstance());//수정날짜
		list.add(b);
		return currentNumber;
	}
	
	//사용자가 게시글 수정 요청을 보내면
	//BoradDTO 객체를 받아서 우리 list에서 바꿔주는 메소드
	public void update(BoardDTO b) {
		//우리가 여기서는 해당 위치의 요소를 b로 바꾸는 
		//list.set을 사용할 것이다. 하지만 set은 인덱스번호가 필요하다
		//우리가 이 요청을 받을때에는 이미 b에 id번호가 있기 때문에 
		//indexOf를 실행할 수 있다.
		int index = list.indexOf(b);
		//우리가 전달받은 b는 id가 같더라도
		//content(내용)이 틀릴수 있다.
		//하지만 우리가 BoardDTO에 구현해놓은 equals 메소드는
		//id만 체크하기 때문에
		//indexOf를 실행하면 원래있던 글의 index번호를 알수 있다.
		b.setUpdatedDate(Calendar.getInstance());
		
		list.set(index, b);
		
	}
	
	//사용자가 글 삭제요청을 보내면
	//list에서 remove메소드를 실행한다.
	public void delete(BoardDTO b) {
		list.remove(b);
		
	}

	public ArrayList<BoardDTO> selectByWriterId(int writerId) {
		ArrayList<BoardDTO> writerIdList = new ArrayList<BoardDTO>();
		for(BoardDTO b: list) {
			if(b.getWriterId()== writerId) {
				writerIdList.add(b);
			}
		}
		return writerIdList;
	}
	
}
