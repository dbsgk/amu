package airplane2;

import java.util.ArrayList;

public class AirportController {
	ArrayList<AirportDTO> list;
	public AirportController() {
		list = new ArrayList<AirportDTO>();
		AirportDTO a1 = new AirportDTO();
		a1.setId(1);
		a1.setCountry("�ѱ�");
		a1.setName("��õ��������");
		
		AirportDTO a2 = new AirportDTO();
		a2.setId(2);
		a2.setCountry("�Ϻ�");
		a2.setName("���� ����Ÿ����");
		
		AirportDTO a3 = new AirportDTO();
		a3.setId(3);
		a3.setCountry("�߱�");
		a3.setName("����¡��������");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
	}
	public ArrayList<AirportDTO> selectAll() {
		return list;
	}

}


