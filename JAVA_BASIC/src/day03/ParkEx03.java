package day03;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList + Park �ʵ带 �и���
//���׷��̵���� 2ź
public class ParkEx03 {
	private final static int SIZE = 5;
	private final static int UNIT_MINUTE = 10;
	private final static int UNIT_PRICE = 1000;

	public static void main(String[] args) {
		ArrayList<Park> list = new ArrayList<Park>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("�������� ���α׷�");
			System.out.println("1.���� 2.���� 3.����");
			System.out.println(">");
			int choice = scan.nextInt();
			if (choice == 1) {
				// ���� �޼ҵ� ȣ��
				insertPark(list, scan);

			} else if (choice == 2) {
				// ���� �޼ҵ� ȣ��
				deletePark(list, scan);

			} else if (choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		scan.close();
	}

	private static void deletePark(ArrayList<Park> list, Scanner scan) {
		// �츮�� ����Ʈ�� ����� 0���� üũ�Ѵ�.
		// 0�̸� ������ ������ ���ٰ� ���޽��� ���
		if (list.size() == 0) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			// ����ڷκ��� �Է��� �޾Ƽ� ������ �� park��ü p�� ������ش�.
			Park p = new Park();
			System.out.println("������ȣ�� �Է����ּ���: ");
			scan.nextLine();
			p.setNumber(scan.nextLine());
			while (!list.contains(p)) {
				System.out.println("�԰�� ����� ���� ��ȣ�Դϴ�.");
				System.out.println("������ȣ�� �Է����ּ���: ");
				p.setNumber(scan.nextLine());
			}
			/*
			 * //���� list���� p�� �ε�����ȣ�� ã�´�. int index = list.indexOf(p); //ã�� �ε�����ȣ�� list����
			 * p��ü�� �̾ƿ´�. p = list.get(index); //�̾ƿ� p���� inTime�� �����Ѵ�. int inTime =
			 * p.getInTime();
			 */
			int inTime = list.get(list.indexOf(p)).getInTime();// ���� �ڵ� 3���� �̷��� 1�ٷ� ���.
			System.out.println("���� �ð��� �Է����ּ���: ");
			int outTime = scan.nextInt();

			while (validateTime(outTime) || inTime > outTime) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�����ð��� �Է����ּ���");
				outTime = scan.nextInt();
			}

			calcRate(inTime, outTime);
			list.remove(p);
			
		}
	}

	private static void calcRate(int inTime, int outTime) {
		// ��� ����� �����ϴ�.
		int hourDifference = outTime / 100 - inTime / 100;// �ð������
		int minDifference = outTime % 100 - inTime % 100;// ���� ���
		int totalDifference = hourDifference * 60 + minDifference;

		// ��ݰ�� -> 10�п� 1000��
		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		System.out.println("�� �����" + rate + "���Դϴ�.");

	}

//����ó���޼ҵ�
	private static void insertPark(ArrayList<Park> list, Scanner scan) {
		// ���� �츮�� ����Ʈ�� ũ�⸦ Ȯ���ؼ�
		// SIZE���� ������ ���� �������� �ǽ��ϰ�
		// ���� SIZE���� ũ��? ���޽����� ����Ѵ�.
		if (list.size() < SIZE) {
			// ���������� �����Ƿ� ��������

			// ���� �츮�� �Է��� ������ ����
			// Park ��ü�� �������ش�.
			// ����ڷκ��� �Է��� ������ �� Park ��ü�� �־
			// �װ� �̿��ؼ� arrlist�� �پ��� �޼ҵ�� Ȯ��
			Park p = new Park();
			System.out.println("���� ��ȣ�� �Է����ּ���: ");
			scan.nextLine();
			p.setNumber(scan.nextLine());
			while (list.contains(p)) {
				System.out.println("�ߺ��� ������ȣ�Դϴ�.");
				System.out.println("������ȣ�� �Է����ּ���: ");
				p.setNumber(scan.nextLine());
			}
			System.out.println("�ð��� �Է����ּ���: ");
			p.setInTime(scan.nextInt());
			while (validateTime(p.getInTime())) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�ð��� �Է����ּ���: ");
			}

			// �� ���������� Park��üp��
			// number�� inTime�� �������Ƿ�
			// �츮�� List�� ���� �߰��� �� �� �ִ�.
			list.add(p);
		} else {
			// �� á���Ƿ� ��� �޽��� ���
			System.out.println("�������� �� á���ϴ�.");
		}

	}

	private static boolean validateTime(int time) {
		int hour = time / 100;
		int min = time % 100;
		return (hour < 0 || hour > 23 || min < 0 || min > 59);
	}
}
