package airplane;

import java.util.Scanner;

public class AirplaneEx {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	AirportController airportController = new AirportController();
	MemberController memberController = new MemberController();
	FlightController flightController = new FlightController();
	ReservationController reservationController = new ReservationController();

	// AirportView airportView = new AirportView();
	// FlightView flightView = new FlightView();
	MemberView memberView = new MemberView(memberController);
	ReservationView reservationView = new ReservationView();
	
	while(true)
	{
		System.out.println("==================항공예약홈페이지===========");
		System.out.println("1.로그인 2. 회원가입 3. 종료");
		System.out.println(">");
		int choice = scan.nextInt();
		//scan.nextLine();
		if (choice == 1) {
			// 로그인시작
			MemberDTO logInUser = memberView.auth(scan);
			while (logInUser == null) {
				System.out.println("해당하는 유저는 존재하지 않습니다.");
				logInUser = memberView.auth(scan);
			}
			System.out.println(logInUser.getUsername() + "님, 환영합니다.");

			// 로그인됐다
			while (true) {
				System.out.println("1.예약하기 2. 회원정보보기(예약목록) 3.로그아웃");
				System.out.println(">");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					// 예약하는 메소드(주차 입차하는거 참고)
					//reservationViewer 불러서 프로세스 시작
					reservationView.makeReservation();

				} else if (choice == 2) {
					// 예약목록보는메소드
					//memberViewer 의 회원정보보기 시작
					memberView.showInfo();
				} else if (choice == 3) {
					System.out.println("로그아웃되었습니다.");
					break;
				} else {
					System.out.println("잘못누르셨습니다.");
				}
			}
		} else if (choice == 2) {
			// 회원가입
		} else if (choice == 3) {
			System.out.println("안녕히가세요");
			break;
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}scan.close();
	
	
	}
}