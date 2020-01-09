package day02;

public class CarEx {
	public static void main(String[] args) {
		//Car c = new Car();//생성자
		Car c= new Car(0, "파랑색", "벤츠","88가8888");
		//객체의 field나 method를 접근할때는 (객체).으로 접근한다.
		/*
		 * c.color= "빨강"; c.id=0; c.plateNumber= "00갸0000"; c.type= "모닝";
		 */
		
		int mySpeed =30;
		c.speedUp(mySpeed);
		c.setColor("빨강");
		c.setId(1);
		c.setType("페라리");
		c.setPlateNumber("00rk0000");
		System.out.println(c.getColor());//getter,setter로 넣어주면 의도하지 않은 값이 들어갈 일이 없다.
		System.out.println(c.getId());
		//c.speedUp(500); 직접 값을 넣어줘도 되고 변수설정해서 넣어줘도 됨.
		/*
		 * System.out.println(c.color);//System.out.println(c.color.length()); 널포인트오류뜸
		 * System.out.println(c.id); System.out.println(c.plateNumber);
		 * System.out.println(c.type);
		 */
		//null 해당공간이 초기화가 안된상태(비어있는 것이 아님) ex)인터넷 설치하러 갔는데 건물이 안지어진 맨땅인것
		//"" 이게 비어있는것 
	}
}
