package day03;
//이 클래스는 객체지향프로그래밍의 원칙 중 하나인
//단일 책임 원칙을 지키지 않은
//Tightly Coupled System의 형태가 된 나쁜코드의 예다.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PolyEx {
	String title;
	String content;
	//데이터베이스와 연결할 때에는
	//해당 데이터베이스의 자바 커넥터클래스를 외부라이브러리 추가해준다.
	//데이터베이스 통신에서 필요한건
	//주소, 아이디, 비밀번호
	//그리고 외부 자바 커넥터 클래스 로딩
	public void insert() {
		//데이터베이스의 테이블에 사용자로부터 입력받은 값을 입력하는 메소드
		
		String addr = "jdbc:mysql://localhost:8080/데이터베이스이름";//여기부터
		String id = "root";
		String pw = "비밀번호";
		
		//외부클래스를 통해 해당 드라이버를 등록한다.
		//하지만 아래 코드는 "드라이버를 찾을 수 없음" 이라는 가능성이 존재하기 떄문에
		//Exception 처리를 해야한다.
		
		//Exception 처리하는 2가지 방법
		//1. 해당 메소드가 이러한 Exception이 발생할수 있다! 라고 알려주기만 하는 방법이 있다.
		//2. 다른 방법은 try/catch문을 이용해서 해당Exception이 발생하면 특정행동을해라
		//라고 말해주는 방법이 있습니다.
		
		
		try {
			Class.forName("org.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(addr, id, pw);//add exception to existing catch clause 클릭.
			//여기까지 mysql에서만 쓰는 단단하게 결합된 형태(하드코딩)오라클로 바꾼다하면 다시 다 바꿔줘야함.
			//Single responsability(클래스가 한가지만 책임;단일책임원칙)-계산담당은 계산만, ui담당은 ui만
			//SOLID
			String query = "INSERT INTO 테이블명 VALUES(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			//pstmt.setString(1, p.title);
			//pstmt.setString(2, p.content);//데이터를 클래스로 바꿔주는 것, 데이터주고받는것, DTO까지 담당, 
			pstmt.execute();
			
		} catch (ClassNotFoundException | SQLException e) {//SQLException이 발생할수 있다, 그래서 잡아주는거(아마?)
			// TODO Auto-generated catch block
			System.out.println("서버에 문제가 있습니다.");
			System.out.println("홈으로");
			//e.printStackTrace(); 이건 사용자가 보면 안된대. 대신 서버가 문제있다는 메세지 print해야함.
		}//Class.forName("org.mysql.cj.jdbc.Driver");드라이버를 다운안받아서 에러남.마우스 올려서 try/catch클릭
		
		
	}
	//데이터베이스와 통신하는 메소드들은 어느정도 이름이 통일되어있다.
	//입력할땐 insert, 수정할땐 update, 삭제할땐 delete
	//목록을 불러올땐 selectAll, 객체 하나만 불러올땐 select
	//DTO 혹은 VO 클래스에 담아서 사용자에게 하나씩 불러올때 사용하는것.
	public static void main(String[] args) {
		PolyEx p = new PolyEx();
		p.insert();
		
	}
}
