package day03;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList + Park 필드를 분리한
//업그레이드버전 2탄
public class ParkEx03 {
	private final static int SIZE = 5;
	private final static int UNIT_MINUTE = 10;
	private final static int UNIT_PRICE = 1000;

	public static void main(String[] args) {
		ArrayList<Park> list = new ArrayList<Park>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("주차관리 프로그램");
			System.out.println("1.입차 2.출차 3.종료");
			System.out.println(">");
			int choice = scan.nextInt();
			if (choice == 1) {
				// 입차 메소드 호출
				insertPark(list, scan);

			} else if (choice == 2) {
				// 출차 메소드 호출
				deletePark(list, scan);

			} else if (choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		scan.close();
	}

	private static void deletePark(ArrayList<Park> list, Scanner scan) {
		// 우리의 리스트의 사이즈가 0인지 체크한다.
		// 0이면 주차된 차량이 없다고 경고메시지 출력
		if (list.size() == 0) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			// 사용자로부터 입력을 받아서 저장을 할 park객체 p를 만들어준다.
			Park p = new Park();
			System.out.println("차량번호를 입력해주세요: ");
			scan.nextLine();
			p.setNumber(scan.nextLine());
			while (!list.contains(p)) {
				System.out.println("입고된 기록이 없는 번호입니다.");
				System.out.println("차량번호를 입력해주세요: ");
				p.setNumber(scan.nextLine());
			}
			/*
			 * //먼저 list에서 p의 인덱스번호를 찾는다. int index = list.indexOf(p); //찾은 인덱스번호로 list에서
			 * p전체를 뽑아온다. p = list.get(index); //뽑아온 p에서 inTime을 추출한다. int inTime =
			 * p.getInTime();
			 */
			int inTime = list.get(list.indexOf(p)).getInTime();// 위의 코드 3줄을 이렇게 1줄로 축약.
			System.out.println("출차 시간을 입력해주세요: ");
			int outTime = scan.nextInt();

			while (validateTime(outTime) || inTime > outTime) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("출차시간을 입력해주세요");
				outTime = scan.nextInt();
			}

			calcRate(inTime, outTime);
			list.remove(p);
			
		}
	}

	private static void calcRate(int inTime, int outTime) {
		// 요금 계산이 가능하다.
		int hourDifference = outTime / 100 - inTime / 100;// 시간차출력
		int minDifference = outTime % 100 - inTime % 100;// 분차 출력
		int totalDifference = hourDifference * 60 + minDifference;

		// 요금계산 -> 10분에 1000원
		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		System.out.println("총 요금은" + rate + "원입니다.");

	}

//입차처리메소드
	private static void insertPark(ArrayList<Park> list, Scanner scan) {
		// 먼저 우리의 리스트의 크기를 확인해서
		// SIZE보다 작으면 입차 시퀀스를 실시하고
		// 만약 SIZE보다 크면? 경고메시지를 출력한다.
		if (list.size() < SIZE) {
			// 여유공간이 있으므로 주차시작

			// 먼저 우리가 입력한 정보를 담을
			// Park 객체를 생성해준다.
			// 사용자로부터 입력을 받으면 그 Park 객체에 넣어서
			// 그걸 이용해서 arrlist의 다양한 메소드로 확인
			Park p = new Park();
			System.out.println("차량 번호를 입력해주세요: ");
			scan.nextLine();
			p.setNumber(scan.nextLine());
			while (list.contains(p)) {
				System.out.println("중복된 차량번호입니다.");
				System.out.println("차량번호를 입력해주세요: ");
				p.setNumber(scan.nextLine());
			}
			System.out.println("시간을 입력해주세요: ");
			p.setInTime(scan.nextInt());
			while (validateTime(p.getInTime())) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("시간을 입력해주세요: ");
			}

			// 이 시점에서는 Park객체p에
			// number와 inTime이 들어가있으므로
			// 우리의 List에 곧장 추가해 줄 수 있다.
			list.add(p);
		} else {
			// 꽉 찼으므로 경고 메시지 출력
			System.out.println("주차장이 꽉 찼습니다.");
		}

	}

	private static boolean validateTime(int time) {
		int hour = time / 100;
		int min = time % 100;
		return (hour < 0 || hour > 23 || min < 0 || min > 59);
	}
}
