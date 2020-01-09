package day03;

import java.util.Scanner;

//�ּ����� �޼ҵ�� �и��� ���� ���׷��̵�� ����
//�������� ��� ��ɵ��� ���� �޼ҵ忡 �� �����ھƼ�
//���������� �־����� �����.

//������ �ּ��� ���ο� �������� �͵���
//�޼ҵ�� �и����ؼ� �����̳��� ���������� ���� ������.
public class ParkEx02 {
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
/////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		ParkEx02[] parkList = new ParkEx02[SIZE];
		// Ŭ������ �迭�� �߰��� �ʱ�ȭ������Ѵ�/
		// �ֳ�! �츮�� ������ new�� �ʱ�ȭ �Ѱ� �迭 ����ü���� �׾ȿ� ��Ұ� �ƴϱ� ����!

		for (int i = 0; i < SIZE; i++) {// �� �ڵ������ null������
			parkList[i] = new ParkEx02();// �迭�� ��ҿ�� �ʱ�ȭ ����� ��.
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("====��������� ���α׷�=====");
			System.out.println("1. ���� 2. ���� 3. ����");
			int choice = scan.nextInt();
			if (choice == 1) {
				// ������ ����ϴ� �޼ҵ带 ȣ���Ѵ�.
				insertPark(parkList, scan);

			} else if (choice == 2) {
				// ������ ����ϴ� �޼ҵ� ȣ��
				deletePark(parkList, scan);

			} else if (choice == 3) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
		scan.close();
	}

//���������޼���
	private static void insertPark(ParkEx02[] parkList, Scanner scan) {
		// ���������� ����
		// ������� �������� ����ִ��� üũ�Ѵ�.
		// ������ �츮�� �迭�̱� ������ �� ��Ҹ� ���ƴٴϸ鼭
		// ������ ��ĭ�� �´��� �ƴϸ� ������ �ִ��� üũ�ؾ��Ѵ�.
		// ��ĭ�̶�� �ش����� number�� null�̴�; ������ȣ�� null���� �ƴ��� üũ.

		if (findEmptySpot(parkList)) {
			System.out.println("������ȣ�� �Է��ϼ���!");
			scan.nextLine();
			String number = scan.nextLine();

			while (checkNumberDuplicated(parkList, number)) {
				// �ش� ��ȣ�� �ߺ��̴ϱ� �ٽ� �Է��� �޾Ƽ�
				// for���� ������ �ߺ����� �ƴ��� Ȯ���� �Ѵ�.
				// �� while�������°�(true) ��ü�� �ߺ��̶�°�.
				System.out.println("�ߺ��� ������ȣ�Դϴ�.");
				System.out.println("������ȣ�� �Է����ּ���");
				number = scan.nextLine();
			}
			// while���� Ż�� == �ߺ��� ���ٴ� �ǹ�, ���� �ð��� �Է¹޾Ƽ� ��ȿ�� �ð����� üũ.
			System.out.println("���� �ð��� �Է����ּ���: ");
			int inTime = scan.nextInt();

			while (validateTime(inTime)) {
				// isTimeIncorrect�� true�� = �ùٸ��� ���� �ð����´�
				// �ٽ� inTime�� �Է¹޾Ƽ� ��ȿ���� Ȯ��
				// �ú��� �ð��� ���ö����� ��� while���� ���ư���.
				System.out.println("�ùٸ��� ���� �ð������Դϴ�.");
				System.out.println("�����ð��� �Է��ϼ���: ");
				inTime = scan.nextInt();
			}
			// �� while���� ������ == �ùٸ� �ð��� �ùٸ� ������ȣ�� �ִ�.
			// -> �迭�� �߰����ټ� �ִ�.
			ParkEx02 p = new ParkEx02();
			p.setNumber(number);
			p.setInTime(inTime);

			insert(parkList, p);
		} else {
			System.out.println("��ĭ�� �����ϴ�!");
		}
	}

//���������޼���
	private static void deletePark(ParkEx02[] parkList, Scanner scan) {
		// ���� ������ ����
		if (findAnyCar(parkList)) {
			// ������ ������ �����ϱ� ���޽��� ���
			System.out.println("������ ������ �����ϴ�.");
		} else {
			// ������ ������ �����ϱ� ���������� ����
			// ���ϸ��� ������ȣ �Է¹޾Ƽ�
			// ��������ȣ �����ϴ��� Ȯ��
			scan.nextLine();
			System.out.println("������ȣ�� �Է����ּ���");
			String number = scan.nextLine();

			while (checkNotDuplicated(parkList, number)) {
				// true�� �ߺ�����
				System.out.println("�ش� ������ȣ�� �����ϴ�.");
				System.out.println("������ȣ�� �Է����ּ���");
				number = scan.nextLine();

			}
			ParkEx02 p = new ParkEx02();
			// ��ݰ�궧 �������� inTime�ʿ��ؼ� ParkEx01��ü ��ü�� ���� �޾ƾ�.
			// �迭������ ������ȣ �Ȱ��� �� p�� �ֿ���

			// �����ð��� ��ȿ�Ϸ���
			// inTime���� �ʾ���Ѵ�(Ŀ���Ѵ�)
			// ���ڸ� �츮�� choice==2�϶� ����� �������Ƿ�
			// �������������� ������� inTime�� ��ȿ���� ���� scope�� �ִ�.
			// ���� �츮�� ���� �������� �Է��ص� inTime�� �������� ����
			// ParkEx01�� ��ü p�� �����
			// for���� ������
			// number�� ��ġ�ϴ� parkLlist�� ��Ҹ�p�� �Է��Ѵ�.
			for (int i = 0; i < SIZE; i++) {
				if (number.equals(parkList[i].getNumber())) {
					p = parkList[i];
					break;
				}
			}
			System.out.println("�����ð��� �Է����ּ���");
			int outTime = scan.nextInt();

			while (validateTime(outTime) || p.getInTime() > outTime) {
				System.out.println("�ùٸ������� �ð������Դϴ�.");
				System.out.println("�����ð��� �Է����ּ���");
				outTime = scan.nextInt();

			}
			// ��ݰ���� �����ϴ�.
			int hourDifference = outTime / 100 - p.getInTime() / 100;// �ð������
			int minDifference = outTime % 100 - p.getInTime() % 100;// ���� ���
			int totalDifference = hourDifference * 60 + minDifference;

			// ��ݰ�� -> 10�п� 1000��
			int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
			System.out.println("�� ����� " + rate + "���Դϴ�.");
			for (int i = 0; i < SIZE; i++) {
				if (number.equals(parkList[i].getNumber())) {
					parkList[i] = new ParkEx02();
					// parkList[i].setNumber(null); parkList[i].setInTime(null);

					break;
				}
			}

		}
	}

	private static boolean checkNotDuplicated(ParkEx02[] parkList, String number) {
		for (int i = 0; i < SIZE; i++) {
			if (number.equals(parkList[i].getNumber())) {
				return false;
			}
		}
		return true;
	}

	private static boolean findAnyCar(ParkEx02[] parkList) {
		//
		for (int i = 0; i < SIZE; i++) {
			if (parkList[i].getNumber() != null) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkNumberDuplicated(ParkEx02[] parkList, String number) {
		boolean isDuplicated = false;
		for (int i = 0; i < SIZE; i++) {
			// for���� ������ �ش� ������ȣ��
			// ������ �迭�� �ִ�ParkEx01��ü �� number�� ���� �ְ� �ִ��� Ȯ��.
			if (number.equals(parkList[i].getNumber())) {

				isDuplicated = true;// ���⸦ true�� �ϸ� ������ ����.�������������� �迭�� �Ⱦ��ٰ� �ϴµ� ������.
				break;
			}
		}
		return isDuplicated;
	}

	private static boolean validateTime(int time) {
		int hour = time / 100;
		int min = time % 100;
		return (hour < 0 || hour > 23 || min < 0 || min > 59);
	}

	private static void insert(ParkEx02[] parkList, ParkEx02 p) {
		for (int i = 0; i < SIZE; i++) {
			if (parkList[i].getNumber() == null) {
				parkList[i].setNumber(p.getNumber());
				parkList[i].setInTime(p.getInTime());
				break;
			}
		}
	}

	private static boolean findEmptySpot(ParkEx02[] parkList) {
		for (int i = 0; i < SIZE; i++) {
			if (parkList[i].getNumber() == null) {
				// �ش� ĭ�� ��������Ƿ� ��ĭ�� �����Ѵ�!
				// isAvailable�� true�� �ٲ��ְ� break;
				return true;
			}
		}
		return false;
	}
}
