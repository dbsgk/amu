package day02;

public class CarEx {
	public static void main(String[] args) {
		//Car c = new Car();//������
		Car c= new Car(0, "�Ķ���", "����","88��8888");
		//��ü�� field�� method�� �����Ҷ��� (��ü).���� �����Ѵ�.
		/*
		 * c.color= "����"; c.id=0; c.plateNumber= "00��0000"; c.type= "���";
		 */
		
		int mySpeed =30;
		c.speedUp(mySpeed);
		c.setColor("����");
		c.setId(1);
		c.setType("���");
		c.setPlateNumber("00rk0000");
		System.out.println(c.getColor());//getter,setter�� �־��ָ� �ǵ����� ���� ���� �� ���� ����.
		System.out.println(c.getId());
		//c.speedUp(500); ���� ���� �־��൵ �ǰ� ���������ؼ� �־��൵ ��.
		/*
		 * System.out.println(c.color);//System.out.println(c.color.length()); ������Ʈ������
		 * System.out.println(c.id); System.out.println(c.plateNumber);
		 * System.out.println(c.type);
		 */
		//null �ش������ �ʱ�ȭ�� �ȵȻ���(����ִ� ���� �ƴ�) ex)���ͳ� ��ġ�Ϸ� ���µ� �ǹ��� �������� �Ƕ��ΰ�
		//"" �̰� ����ִ°� 
	}
}
