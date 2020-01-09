package airplane2;

import java.util.Scanner;

public class AirplaneEX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FlightController flightController = new FlightController();
		MemberController memberController = new MemberController();
		AirportController airportController = new AirportController();
		ReservationController reservationController = new ReservationController();
		MemberViewer memberViewer = new MemberViewer(memberController, scan);
		AirportViewer airportViewer = new AirportViewer(airportController);
		FlightViewer flightViewer = new FlightViewer(scan, flightController);
		ReservationViewer reservationViewer = new ReservationViewer(scan, reservationController, 
				airportViewer, flightViewer);
		while(true) {
			System.out.println("비행기 예약 프로그램");
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			int choice = scan.nextInt();
			scan.nextLine();
			if(choice == 1) {
				//로그인 메소드 구현
				MemberDTO logInUser = memberViewer.logIn();
				while(logInUser == null) {
					System.out.println("해당하는 유저는 존재하지 않습니다.");
					logInUser = memberViewer.logIn();
				}
				System.out.println(logInUser.getUsername()+"님 환영합니다!!!");
				while(true) {
					System.out.println("1. 예약하기 2. 회원정보 보기 3. 로그아웃");
					choice = scan.nextInt();
					if(choice == 1) {
						//reservationViewer 불러서 예약하는 프로세스 시작
						reservationViewer.makeReservation(logInUser);
					}else if(choice == 2) {
						//memberViewer의 회원정보 보기 시작
						memberViewer.showInfo();
					}else if(choice == 3) {
						System.out.println("로그아웃되었습니다.");
						break;
					}
				}
			}else if(choice == 2) {
				//회원가입 메소드 구현
				memberViewer.signIn();
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		scan.close();
	}

}
