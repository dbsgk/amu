package day03;
//필드와 getter/setter, equals 메소드가 있는 ParkDTO메소드
public class Park {
	private String number;
	private int inTime;
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

	//equals()메소드란//우리의 조상 Object 클래스로부터 물려받은것.
	//파라미터로 넘어온 객체와 이 equals 메소드를 실행하는 Park객체를 비교한다.
	//제일 먼저 파라미터로 넘어온 객체가 Park 클래스의 객체인지 확인하고
	//만약 Park클래스의 객체가 맞다면
	//park클래스의 명시적형변환 해준다.
	//그 결과물의 number와 이 메소드를 실행하는 Park 객체의 number를 비교해서
	//같으면 true, 위에서 하나라도 틀리면 false리턴.
	
	public boolean equals(Object o) { //우리가 쓰기좋게 equals메소드를 수정해서 써야함.
		//제일 먼저 파라미터로 넘어온 Object객체o가 
		//park 클래스의 객체인지 확인한다.
		//여기서 java의 예약어인 instanceOf라는 예약어를 사용해서 확인할 수 있다.
		if(o instanceof Park) {
			//만약 o가 Park클래스의 객체라면?
			//우리가 아무런 문제없이 명시적 형변환을 통해서 새로운 park객체로 만들어줄수 있다.
			Park p = (Park)o;
			if(this.number.equals(p.number)) {
				return true;
			}
		}
		return false;
	}
}
