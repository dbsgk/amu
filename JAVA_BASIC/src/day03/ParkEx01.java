package day03;

import java.util.Scanner;

//단일책임원칙 안지킨 버전의 주차장관리 프로그램
//주차장 관리는
//입차와 출차로 이뤄진다.
//입차 시퀀스: 빈칸 있는지 확인-> 있으면 차량번호를 입력받아서 중복인지 확인 -> 중복이 아니면 시간입력(유효한지 체크)
//->올바른시간 + 차량번호 이면 입차
//출차 시퀀스: 들어간 차량이 있는지 확인 -> 있으면 차량번호가 중복인지 확인 -> 같은 차량번호가 확인되면 시간입력 (유효한지 체크)
//->올바른시간+차량번호이면 요금계산후 우리의배열에서 삭제
public class ParkEx01 {
	private String number;
	private int inTime;
	private final static int SIZE = 5;
	private final static int UNIT_MINUTE = 10;
	private final static int UNIT_PRICE = 1000;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public static void main(String[] args) {
		ParkEx01[] parkList = new ParkEx01[SIZE];
		// 클래스의 배열은 추가로 초기화해줘야한다/
		// 왜냐! 우리가 위에서 new로 초기화 한건 배열 그자체이지 그안에 요소가 아니기 때문!

		for (int i = 0; i < SIZE; i++) {// 이 코드없으면 null오류남
			parkList[i] = new ParkEx01();// 배열은 요소요소 초기화 해줘야 함.
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("====주차장관리 프로그램=====");
			System.out.println("1. 입차 2. 출차 3. 종료");
			int choice = scan.nextInt();
			if (choice == 1) {
				// 입차시퀀스 시작
				// 가장먼저 주차장이 비어있는지 체크한다.
				// 하지만 우리는 배열이기 때문에 각 요소를 돌아다니면서
				// 정말로 빈칸이 맞는지 아니면 차량이 있는지 체크해야한다.
				// 빈칸이라면 해당요소의 number가 null이다; 차량번호가 null인지 아닌지 체크.
				boolean isAvailable = false;
				for (int i = 0; i < SIZE; i++) {
					if (parkList[i].getNumber() == null) {
						// 해당 칸이 비어있으므로 빈칸이 존재한다!
						// isAvailable을 true로 바꿔주고 break;
						isAvailable = true;
						break;
					}
				}
				if (isAvailable) {
					// isAvailable가 true면 빈칸이 존재하니까 입차 시작
					System.out.println("차량번호를 입력하세요!");
					scan.nextLine();
					String number = scan.nextLine();
					// 올바른 정보입력될때까지 계속 입력받게 만들거임
					boolean isDuplicate = false;// 같은번호발견시 이거 true로 바꿈
					for (int i = 0; i < SIZE; i++) {
						// for문을 돌려서 해당 차량번호가
						// 기존의 배열에 있는ParkEx01객체 중 number가 같은 애가 있는지 확인.
						if (number.equals(parkList[i].getNumber())) {

							isDuplicate = true;// 여기를 true로 하면 무조건 실행.무슨이유때문에 배열을 안쓴다고 하는데 못들음.
							break;
						}
					}
					while (isDuplicate) {
						// 해당 번호가 중복이니까 다시 입력을 받아서
						// for문을 돌려서 중복인지 아닌지 확인을 한다.
						// 이 while문들어오는거 자체가 중복이라는거.
						System.out.println("중복된 차량번호입니다.");
						System.out.println("차량번호를 입력해주세요");
						number = scan.nextLine();
						isDuplicate = false;
						for (int i = 0; i < SIZE; i++) {
							if (number.equals(parkList[i].getNumber())) {
								isDuplicate = true;
								break;
							}
						}
					}
					// while문을 탈출 == 중복이 없다는 의미, 이제 시간을 입력받아서 유효한 시간인지 체크.
					System.out.println("입차 시간을 입력해주세요: ");
					int inTime = scan.nextInt();
					boolean isTimeIncorrect = false;
					// 시간이 유효한지 체크한다.
					// 시간이 유효하려면 4자리 숫자기준으로 앞에 두자리는 시간, 뒤에 두자리는 분
					// 분리하려면? 100으로나눈다 몫은 앞2 나머지는 뒤2
					int hour = inTime / 100;
					int min = inTime % 100;
					if (hour < 0 || hour > 23 || min < 0 || min > 59) {
						// 시간이 -1이 되거나 분이 60이 넘어가면
						isTimeIncorrect = true;
					}
					while (isTimeIncorrect) {
//							isTimeIncorrect가 true다 = 올바르지 않은 시간형태다
//							다시 inTime을 입력받아서 유효한지 확인
						// 올보른 시간이 들어올때까지 계속 while문이 돌아간다.
						System.out.println("올바르지 않은 시간형태입니다.");
						System.out.println("입차시간을 입력하세요: ");
						inTime = scan.nextInt();
						hour = inTime / 100;
						min = inTime % 100;
						isTimeIncorrect = false;
						if (hour < 0 || hour > 23 || min < 0 || min > 59) {
							isTimeIncorrect = true;
						}
					}
					// 이 while문이 끝났다 == 올바른 시간과 올바른 차량번호가 있다.
					// -> 배열에 추가해줄수 있다.
					for (int i = 0; i < SIZE; i++) {
						if (parkList[i].getNumber() == null) {
							parkList[i].setNumber(number);
							parkList[i].setInTime(inTime);
							break;
						}
					}

				} else {
					System.out.println("빈칸이 없습니다!");
				}

			} else if (choice == 2) {
				// 출차 시퀀스 시작
				// 제일먼저 주차된 차량이 있는지부터 체크한다.
				// 주차된 차량이 있는지 확인은?
				// for문을 돌려서 number가 null이 아닌 요소가 있는지 체크

				boolean isEmpty = true;
				for (int i = 0; i < SIZE; i++) {
					if (parkList[i] != null) {
						isEmpty = false;
						break;
					}
				}
				if (isEmpty) {
					// 주차된 차량이 없으니까 경고메시지 출력
					System.out.println("주차된 차량이 없습니다.");
				} else {
					// 주차된 차량이 있으니까 출차시퀀스 시작
					// 제일먼저 차량번호 입력받아서
					// 그차량번호 존재하는지 확인
					scan.nextLine();
					System.out.println("차량번호를 입력해주세요");
					String number = scan.nextLine();
					boolean isNotDuplicate = true;
					for (int i = 0; i < SIZE; i++) {
						if (number.equals(parkList[i].getNumber())) {
							isNotDuplicate = false;// 중복차량번호나오면 false
							break;
						}
					}
					while (isNotDuplicate) {
						// true면 중복없음
						System.out.println("해당 차량번호는 없습니다.");
						System.out.println("차량번호를 입력해주세요");
						number = scan.nextLine();
						isNotDuplicate = true;
						for (int i = 0; i < SIZE; i++) {
							if (number.equals(parkList[i].getNumber())) {
								isNotDuplicate = false;
								break;
							}
						}
					}
					ParkEx01 p = new ParkEx01();
					// 요금계산때 만들어놓은 inTime필요해서 ParkEx01자체 객체를 만들어서 받아씀.
					// 배열돌려서 차량번호 똑같은 걸 p에 넣에줌

					// 출차시간이 유효하려면
					// inTime보다 늦어야한다(커야한다)
					// 하자만 우리가 choice==2일때 여기로 들어왔으므로
					// 입차시퀀스에서 만들었던 inTime은 유효하지 않은 scope에 있다.
					// 따라서 우리가 입차 시퀀스에 입력해둔 inTime을 꺼내오기 위해
					// ParkEx01의 객체 p를 만들고
					// for문을 돌려서
					// number가 일치하는 parkLlist의 요소를p에 입력한다.
					for (int i = 0; i < SIZE; i++) {
						if (number.equals(parkList[i].getNumber())) {
							p = parkList[i];
							break;
						}
					}
					System.out.println("출차시간을 입력해주세요");
					int outTime = scan.nextInt();
					boolean isTimeIncorrect = false;
					int hour = outTime / 100;
					int min = outTime % 100;
					if (hour < 0 || hour > 23 || min < 0 || min > 60 || p.getInTime() > outTime) {
						// inTime이 outTime보다 크면 문제있음
						isTimeIncorrect = true;
					}
					while (isTimeIncorrect) {
						System.out.println("올바르지않은 시간형태입니다.");
						System.out.println("출차시간을 입력해주세요");
						outTime = scan.nextInt();
						isTimeIncorrect = false;
						hour = outTime / 100;
						min = outTime % 100;
						if (hour < 0 || hour > 23 || min < 0 || min > 60 || p.getInTime() > outTime) {
							// inTime이 outTime보다 크면 문제있음
							isTimeIncorrect = true;
						}
					}
					// 요금계산이 가능하다.
					int hourDifference = outTime / 100 - p.getInTime() / 100;// 시간차출력
					int minDifference = outTime % 100 - p.getInTime() % 100;// 분차 출력
					int totalDifference = hourDifference * 60 + minDifference;

					// 요금계산 -> 10분에 1000원
					int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
					System.out.println("총 요금은 " + rate + "원입니다.");
					for (int i = 0; i < SIZE; i++) {
						if (number.equals(parkList[i].getNumber())) {
							parkList[i] = new ParkEx01();
							// parkList[i].setNumber(null); parkList[i].setInTime(null);

							break;
						}
					}

				}

			} else if (choice == 3) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
		scan.close();
	}
}
