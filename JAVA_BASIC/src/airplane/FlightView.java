package airplane;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightView {

	Scanner scan = new Scanner(System.in);
	FlightController flightController = new FlightController();

	// ������
	public FlightView(FlightController flightController) {
		this.flightController = flightController;
	}
	public FlightView() {
		
	}

	// ������ü���(BoardViewer list����)
	public void list() {
		while (true) {
			ArrayList<FlightDTO> list = flightController.selectAll();
			System.out.println("=====��ü �װ��� ���=====");
			for (FlightDTO f : list) {
				System.out.println(
						f.getId() + "\t" + f.getStartAirportId() + "\t" + f.getEndAirportId() + "\t" + f.getNumber()
								+ f.getStartTime() + "\t" + f.getEndTime() + "\t" + f.getSeat() + "\t" + f.getPrice());
			}
			//�װ���ȣ�Է¹ޱ�(borad.MemberViewer auth����)
			System.out.println("������ �װ��� ��ȣ�� �Է����ּ���");
			System.out.println(">");
			//FlightDTO selectFlight = F
			int id = scan.nextInt();
			scan.nextLine();
			//�����ϴ¿���(BoardEx 23�� �α�������)
			while(flightController.findId(id)) {
				System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
				System.out.println("�װ��� ��ȣ:");
				id = scan.nextInt();
			}
			
		}
	}

}
