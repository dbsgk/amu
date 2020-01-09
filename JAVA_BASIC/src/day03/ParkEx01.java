package day03;

import java.util.Scanner;

//����å�ӿ�Ģ ����Ų ������ ��������� ���α׷�
//������ ������
//������ ������ �̷�����.
//���� ������: ��ĭ �ִ��� Ȯ��-> ������ ������ȣ�� �Է¹޾Ƽ� �ߺ����� Ȯ�� -> �ߺ��� �ƴϸ� �ð��Է�(��ȿ���� üũ)
//->�ùٸ��ð� + ������ȣ �̸� ����
//���� ������: �� ������ �ִ��� Ȯ�� -> ������ ������ȣ�� �ߺ����� Ȯ�� -> ���� ������ȣ�� Ȯ�εǸ� �ð��Է� (��ȿ���� üũ)
//->�ùٸ��ð�+������ȣ�̸� ��ݰ���� �츮�ǹ迭���� ����
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
		// Ŭ������ �迭�� �߰��� �ʱ�ȭ������Ѵ�/
		// �ֳ�! �츮�� ������ new�� �ʱ�ȭ �Ѱ� �迭 ����ü���� �׾ȿ� ��Ұ� �ƴϱ� ����!

		for (int i = 0; i < SIZE; i++) {// �� �ڵ������ null������
			parkList[i] = new ParkEx01();// �迭�� ��ҿ�� �ʱ�ȭ ����� ��.
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("====��������� ���α׷�=====");
			System.out.println("1. ���� 2. ���� 3. ����");
			int choice = scan.nextInt();
			if (choice == 1) {
				// ���������� ����
				// ������� �������� ����ִ��� üũ�Ѵ�.
				// ������ �츮�� �迭�̱� ������ �� ��Ҹ� ���ƴٴϸ鼭
				// ������ ��ĭ�� �´��� �ƴϸ� ������ �ִ��� üũ�ؾ��Ѵ�.
				// ��ĭ�̶�� �ش����� number�� null�̴�; ������ȣ�� null���� �ƴ��� üũ.
				boolean isAvailable = false;
				for (int i = 0; i < SIZE; i++) {
					if (parkList[i].getNumber() == null) {
						// �ش� ĭ�� ��������Ƿ� ��ĭ�� �����Ѵ�!
						// isAvailable�� true�� �ٲ��ְ� break;
						isAvailable = true;
						break;
					}
				}
				if (isAvailable) {
					// isAvailable�� true�� ��ĭ�� �����ϴϱ� ���� ����
					System.out.println("������ȣ�� �Է��ϼ���!");
					scan.nextLine();
					String number = scan.nextLine();
					// �ùٸ� �����Էµɶ����� ��� �Է¹ް� �������
					boolean isDuplicate = false;// ������ȣ�߽߰� �̰� true�� �ٲ�
					for (int i = 0; i < SIZE; i++) {
						// for���� ������ �ش� ������ȣ��
						// ������ �迭�� �ִ�ParkEx01��ü �� number�� ���� �ְ� �ִ��� Ȯ��.
						if (number.equals(parkList[i].getNumber())) {

							isDuplicate = true;// ���⸦ true�� �ϸ� ������ ����.�������������� �迭�� �Ⱦ��ٰ� �ϴµ� ������.
							break;
						}
					}
					while (isDuplicate) {
						// �ش� ��ȣ�� �ߺ��̴ϱ� �ٽ� �Է��� �޾Ƽ�
						// for���� ������ �ߺ����� �ƴ��� Ȯ���� �Ѵ�.
						// �� while�������°� ��ü�� �ߺ��̶�°�.
						System.out.println("�ߺ��� ������ȣ�Դϴ�.");
						System.out.println("������ȣ�� �Է����ּ���");
						number = scan.nextLine();
						isDuplicate = false;
						for (int i = 0; i < SIZE; i++) {
							if (number.equals(parkList[i].getNumber())) {
								isDuplicate = true;
								break;
							}
						}
					}
					// while���� Ż�� == �ߺ��� ���ٴ� �ǹ�, ���� �ð��� �Է¹޾Ƽ� ��ȿ�� �ð����� üũ.
					System.out.println("���� �ð��� �Է����ּ���: ");
					int inTime = scan.nextInt();
					boolean isTimeIncorrect = false;
					// �ð��� ��ȿ���� üũ�Ѵ�.
					// �ð��� ��ȿ�Ϸ��� 4�ڸ� ���ڱ������� �տ� ���ڸ��� �ð�, �ڿ� ���ڸ��� ��
					// �и��Ϸ���? 100���γ����� ���� ��2 �������� ��2
					int hour = inTime / 100;
					int min = inTime % 100;
					if (hour < 0 || hour > 23 || min < 0 || min > 59) {
						// �ð��� -1�� �ǰų� ���� 60�� �Ѿ��
						isTimeIncorrect = true;
					}
					while (isTimeIncorrect) {
//							isTimeIncorrect�� true�� = �ùٸ��� ���� �ð����´�
//							�ٽ� inTime�� �Է¹޾Ƽ� ��ȿ���� Ȯ��
						// �ú��� �ð��� ���ö����� ��� while���� ���ư���.
						System.out.println("�ùٸ��� ���� �ð������Դϴ�.");
						System.out.println("�����ð��� �Է��ϼ���: ");
						inTime = scan.nextInt();
						hour = inTime / 100;
						min = inTime % 100;
						isTimeIncorrect = false;
						if (hour < 0 || hour > 23 || min < 0 || min > 59) {
							isTimeIncorrect = true;
						}
					}
					// �� while���� ������ == �ùٸ� �ð��� �ùٸ� ������ȣ�� �ִ�.
					// -> �迭�� �߰����ټ� �ִ�.
					for (int i = 0; i < SIZE; i++) {
						if (parkList[i].getNumber() == null) {
							parkList[i].setNumber(number);
							parkList[i].setInTime(inTime);
							break;
						}
					}

				} else {
					System.out.println("��ĭ�� �����ϴ�!");
				}

			} else if (choice == 2) {
				// ���� ������ ����
				// ���ϸ��� ������ ������ �ִ������� üũ�Ѵ�.
				// ������ ������ �ִ��� Ȯ����?
				// for���� ������ number�� null�� �ƴ� ��Ұ� �ִ��� üũ

				boolean isEmpty = true;
				for (int i = 0; i < SIZE; i++) {
					if (parkList[i] != null) {
						isEmpty = false;
						break;
					}
				}
				if (isEmpty) {
					// ������ ������ �����ϱ� ���޽��� ���
					System.out.println("������ ������ �����ϴ�.");
				} else {
					// ������ ������ �����ϱ� ���������� ����
					// ���ϸ��� ������ȣ �Է¹޾Ƽ�
					// ��������ȣ �����ϴ��� Ȯ��
					scan.nextLine();
					System.out.println("������ȣ�� �Է����ּ���");
					String number = scan.nextLine();
					boolean isNotDuplicate = true;
					for (int i = 0; i < SIZE; i++) {
						if (number.equals(parkList[i].getNumber())) {
							isNotDuplicate = false;// �ߺ�������ȣ������ false
							break;
						}
					}
					while (isNotDuplicate) {
						// true�� �ߺ�����
						System.out.println("�ش� ������ȣ�� �����ϴ�.");
						System.out.println("������ȣ�� �Է����ּ���");
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
					boolean isTimeIncorrect = false;
					int hour = outTime / 100;
					int min = outTime % 100;
					if (hour < 0 || hour > 23 || min < 0 || min > 60 || p.getInTime() > outTime) {
						// inTime�� outTime���� ũ�� ��������
						isTimeIncorrect = true;
					}
					while (isTimeIncorrect) {
						System.out.println("�ùٸ������� �ð������Դϴ�.");
						System.out.println("�����ð��� �Է����ּ���");
						outTime = scan.nextInt();
						isTimeIncorrect = false;
						hour = outTime / 100;
						min = outTime % 100;
						if (hour < 0 || hour > 23 || min < 0 || min > 60 || p.getInTime() > outTime) {
							// inTime�� outTime���� ũ�� ��������
							isTimeIncorrect = true;
						}
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
							parkList[i] = new ParkEx01();
							// parkList[i].setNumber(null); parkList[i].setInTime(null);

							break;
						}
					}

				}

			} else if (choice == 3) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
		scan.close();
	}
}
