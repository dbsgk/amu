package day03;

import java.util.Scanner;

public class ParkViewer {
//���������� ȭ�鿡 ����� �͵��� ����ϴ� Ŭ����
	private final int SIZE=5;
	private final int UNIT_PRICE=1000;
	private final int UNIT_MINUTE = 10;
	public void showMenu(ParkController controller, Scanner scan) {
		while(true) {
			System.out.println("�������� ���α׷�");
			System.out.println("1. ���� 2. ���� 3. ����");
			System.out.println(">");
			int choice = scan.nextInt();
			if(choice==3) {
				System.out.println("������ּż� �����մϴ�");
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
		//1. ���� ������ ������ ���� üũ�ϱ�
		if(controller.getList().size()< SIZE) {
			//�������� �����ϴ� ��������
			
			//validateNumber �޼ҵ带 ȣ���ؼ� ��ȿ�� ������ȣ�� �غ��Ѵ�.
			//validateTime �޼ҵ带 ȣ���ؼ� ��ȿ�� �ð��� �غ��Ѵ�.
			Park p = new Park();
			p.setNumber(validateInNumber(controller, scan));
			p.setInTime(validateInTime(scan));
			
			/*
			 * System.out.println("������ȣ�� �Է��ϼ���: "); scan.nextLine();
			 * 
			 * String number = scan.nextLine(); //Park p = controller.selectOne(number);
			 * while(controller.selectOne(number)!=null) { //�ߺ��ɰ��; p���̹������Ҷ�
			 * System.out.println("�ߺ��� ��ȣ�Դϴ�."); System.out.println("������ȣ�� �Է��ϼ���"); number =
			 * scan.nextLine(); //Park p = controller.selectOne(number); ���ǹ��� ������ �׸��ε� ����
			 * park��ü ��������ʿ� ����
			 * 
			 * } //�ð��Է¹޾Ƽ���ȿ���� üũ
			 */			
			controller.insert(p);
		}else {
			System.out.println("���� ������ �����ϴ�.");
		}
		
	}
	private String validateInNumber(ParkController controller, Scanner scan) {
		System.out.println("������ȣ�� �Է��ϼ���");
		scan.nextLine();
		String number = scan.nextLine();
		while(controller.selectOne(number)!= null) {
			System.out.println("�ߺ��ȹ�ȣ");
			System.out.println("������ȣ�Է� ����");
			number = scan.nextLine();
		}
		return number;
	}
	private int validateInTime(Scanner scan) {
		System.out.println("�����ð��� �Է����ּ���.");
		int inTime = scan.nextInt();
		while(validateTime(inTime)) {
			System.out.println("�߸��� �ð��Դϴ�.");
			System.out.println("�����ð��� �Է����ּ���");
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
			System.out.println("�԰�� ������ �����ϴ�.");
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
		int hourDifference = outTime / 100 - p.getInTime() / 100;// �ð������
		int minDifference = outTime % 100 - p.getInTime() % 100;// ���� ���
		int totalDifference = hourDifference * 60 + minDifference;

		// ��ݰ�� -> 10�п� 1000��
		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		System.out.println("�� �����" + rate + "���Դϴ�.");
		
	}
	private int validateOutTime(Scanner scan, Park p) {
		System.out.println("���ð��� �Է����ּ���");
		int outTime = scan.nextInt();
		while(p.getInTime()>outTime|| validateTime(outTime)) {
			System.out.println("�߸��� �����Դϴ�.");
			System.out.println("���ð��� �Է����ּ���.");
			outTime= scan.nextInt();
		}
		return outTime;
	}
	private String validateOutNumber(ParkController controller, Scanner scan) {
		System.out.println("����� ������ ��ȣ�� �Է����ּ���");
		scan.nextLine();//���۸޸� ���
		String number = scan.nextLine();
		while(controller.selectOne(number)==null) {
			System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
			System.out.println("����� ������ ��ȣ�� �Է����ּ���.");
			number = scan.nextLine();
		}
		return number;
	}
	private void insertPark() {
		
	}
}
