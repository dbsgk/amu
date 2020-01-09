package day03;

import java.util.Scanner;

public class ParkViewer {
//실질적으로 화면에 출력할 것들을 담당하는 클래스
	private final int SIZE=5;
	private final int UNIT_PRICE=1000;
	private final int UNIT_MINUTE = 10;
	public void showMenu(ParkController controller, Scanner scan) {
		while(true) {
			System.out.println("주차관리 프로그램");
			System.out.println("1. 입차 2. 출차 3. 종료");
			System.out.println(">");
			int choice = scan.nextInt();
			if(choice==3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}
			switch(choice) {
			case 1:
				insertPark(controller, scan);
				break;
			case 2:
				deletePark(controller, scan);
				break;
		
			}
		}
	}
	private void insertPark(ParkController controller, Scanner scan) {
		//1. 현재 주차된 차량의 숫자 체크하기
		if(controller.getList().size()< SIZE) {
			//여유공간 존재하니 주차시작
			
			//validateNumber 메소드를 호출해서 유효한 차량번호를 준비한다.
			//validateTime 메소드를 호출해서 유효한 시간을 준비한다.
			Park p = new Park();
			p.setNumber(validateInNumber(controller, scan));
			p.setInTime(validateInTime(scan));
			
			/*
			 * System.out.println("차량번호를 입력하세요: "); scan.nextLine();
			 * 
			 * String number = scan.nextLine(); //Park p = controller.selectOne(number);
			 * while(controller.selectOne(number)!=null) { //중복될경우; p가이미존재할때
			 * System.out.println("중복된 번호입니다."); System.out.println("차량번호를 입력하세요"); number =
			 * scan.nextLine(); //Park p = controller.selectOne(number); 조건문에 넣으면 그만인데 굳이
			 * park객체 만들어줄필요 ㄴㄴ
			 * 
			 * } //시간입력받아서유효한지 체크
			 */			
			controller.insert(p);
		}else {
			System.out.println("여유 공간이 없습니다.");
		}
		
	}
	private String validateInNumber(ParkController controller, Scanner scan) {
		System.out.println("차량번호를 입력하세요");
		scan.nextLine();
		String number = scan.nextLine();
		while(controller.selectOne(number)!= null) {
			System.out.println("중복된번호");
			System.out.println("차량번호입력 ㄱㄱ");
			number = scan.nextLine();
		}
		return number;
	}
	private int validateInTime(Scanner scan) {
		System.out.println("입차시간을 입력해주세요.");
		int inTime = scan.nextInt();
		while(validateTime(inTime)) {
			System.out.println("잘못된 시간입니다.");
			System.out.println("입차시간을 입력해주세요");
			inTime = scan.nextInt();
		}
		return inTime;
	}
	
	private static boolean validateTime(int time) {
		int hour = time / 100;
		int min = time % 100;
		return (hour < 0 || hour > 23 || min < 0 || min > 59);
	}
	
	private void deletePark(ParkController controller, Scanner scan) {
		if(controller.getList().size()==0) {
			System.out.println("입고된 차량이 없습니다.");
		}else {
			Park p = new Park();
			p.setNumber(validateOutNumber(controller, scan));
			p.setInTime(controller.selectOne(p.getNumber()).getInTime());
			int outTime = validateOutTime(scan, p);
			calcRate(p, outTime);
			controller.delete(p);
		}
	
}
	private void calcRate(Park p, int outTime) {
		int hourDifference = outTime / 100 - p.getInTime() / 100;// 시간차출력
		int minDifference = outTime % 100 - p.getInTime() % 100;// 분차 출력
		int totalDifference = hourDifference * 60 + minDifference;

		// 요금계산 -> 10분에 1000원
		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		System.out.println("총 요금은" + rate + "원입니다.");
		
	}
	private int validateOutTime(Scanner scan, Park p) {
		System.out.println("출고시간을 입력해주세요");
		int outTime = scan.nextInt();
		while(p.getInTime()>outTime|| validateTime(outTime)) {
			System.out.println("잘못된 형식입니다.");
			System.out.println("출고시간을 입력해주세요.");
			outTime= scan.nextInt();
		}
		return outTime;
	}
	private String validateOutNumber(ParkController controller, Scanner scan) {
		System.out.println("출고할 차량의 번호를 입력해주세요");
		scan.nextLine();//버퍼메모리 비움
		String number = scan.nextLine();
		while(controller.selectOne(number)==null) {
			System.out.println("존재하지 않는 번호입니다.");
			System.out.println("출고할 차량의 번호를 입력해주세요.");
			number = scan.nextLine();
		}
		return number;
	}
	private void insertPark() {
		
	}
}
