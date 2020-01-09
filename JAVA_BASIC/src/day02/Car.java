package day02;
//클래스란
//자바에서는 모든 것들을 클래스로 컨트롤하게 된다.
//클래스 변수는 객체라고 부른다.
//클래스는 정보를 저장하는 공간인 field 와 기능인 method로 이뤄지게 된다.
public class Car {
	//field는 변수처럼 선언하게 된다.
	private int id;//관리번호
	private String plateNumber;//번호판
	private String color;//차량색상
	private String type;//차량종류
	//예전에는 carId,carPlateNumber, carColor, carType으로 이름 설정했는데 car라는 클래스에 넣음으로써 그럴 필요가 없어졌다.
	
	//method만들기
	//method를 만들때에는 
	//접근제한자(static) 리턴데이터타입 메소드이름(파라미터)로 만든다.
	//접근제한자란? 해당 method의 공개 범위를 정해준다 ex)public
	//static이란? 해당 method를 객체로 안만들어도 곧장 쓸수 있게 하려면 static을 붙여준다.Ex04에 예제있음.
		//자바 메모리영역 heap, stack, method area
		//stack: 기본형 데이터타입들이 선언 (값이 들어감)
		//heap: 참조형 데이터타입들이 할당 (메모리주소값)
		//method: static이라고 붙여진 field나 method가 들어가게 된다.
	//리턴데이터타입이란? 메소드가 종료될떄 호출된 곳으로 보내줄 데이터의 타입을 말함.
		//리턴 데이터타입같은 경우에는 기본형 데이터타입, 참조형 테이터타입, void가 존재한다.
		//void(=공허한)란? 해당 메소드가 종료될 때 아무런 값도 리턴하지 않는것을 뜻한다. 단독 실행되는 메소드에 사용.
	//메소드이름-> 소문자로 시작하는 동사
	//파라미터란? 해당 메소드가 실행되는데 필요로 하는 외부값들.
		//근데 외부에서 보내줄 때에는 변수의 이름이 파라미터의 이름과 같을 필요가 없다.
		//"65번 훈련병"이라고 부른다고해도 조재영은 조재영이듯
		//메소드 안에서는 해당하는 파라미터 이름으로 불린다고 해서 변수가 바뀌는게 아니다.
	
	public void speedUp(int speed) {
		System.out.println(speed+"km까지 가속합니다!");
		
	}
	//생성자란?
	//해당 객체가 초기화될떄 실행되는 특수한 메소드
	//객체의 field값들을 초기화하거나 다른 메소드를 호출해서 필요한 기본작업들을 실행하게 된다.
	//우리가 따로 만들어주지 않아도 자바에서 기본적으로 제공해주는 생성자가
	//해당 클래스 객체의 필드들을 초기화해주는데 참조형 데이터타입의 field는 null로 초기화하고
	//기본형 데이터타입의 field는 0으로 초기화한다.
	
	//생성자 특징
	//만약 파라미터가 있는 생성자'만' 만들어주면
	//기본생성자와 파라미터가 없는 생성자는 더이상 사용할 수 없게 된다.
	
	
	//생성자선언하기; 목적=필드의 값을 초기화;
	//클래스이름(파라미터)
	public Car(int id, String color, String type, String plateNumber) {
		this.id =id;
		this.color=color;
		this.type=type;
		this.plateNumber=plateNumber;
	}
	public Car() {
		this.id =0;
		this.color="";
		this.type="";
		this.plateNumber="";
	}
	//위의 2개의 생성자처럼
	//똑같은 이름의 메소드지만 파라미터의 내용이 달라짐으로써 실행내용은 다리지만 목적은 같은 메소드들을 만들어 줄 수 있다.
	//이러한 것을 오버로딩이라고 한다.(overloading)
	//가장 대표적인 예의 오버로딩 메소드가
	//바로 System.out.println()이다.
	//println()은 파라미터가 없는 메소드1개,int 1개, double 1개, float 1개 ... 등등 9개가 정의되어 있다.
	
	
	//(라인잘라내기 단축키찾기)
	//이제는 더이상 field들을 public으로 놓지 않는다.
	//왜? 외부에서 함부로 접근할 수 있기 때문이다.
	//심지어 method들도 클래스 내부에서만 쓰인다면 public으로 놓지 않는다.
	
	//외부의 접근을 막기 위해서는 접근제한자를 바꿔줘야한다.
	//public - package(default) - protected - private
	// public: 어디서든 접근가능
	// package(default): 아무것도 적어주지 않으면 자동으로 default접근제한자가 걸린다. 패키지+상속받는 클래스만 접근 가능.
	// protected: 상속받는 클래스만 접근 가능
	// private: 모든 외부 접근을 막는다.(클래스 내부에서만 사용가능하다)
	
	//이제는 모든 field들을 private접근제한자를 붙여주게 된다.
	//하지만 이제 field들이 private이 되었기 때문에 더이상 외부에서 객체의 필드에 값을 넣거나 출력할 수 없게 된다.
	//그렇다면 어떻게 해야 값들을 넣거나 뺄수 있을까?
	//encapsulization(캡슐화)
	//객체의 필드를 메소드를 통해서 접근하는 것을 뜻한다.
	
	//캡슐화는 getter/setter로 이뤄져있다.
	//getter는 객체에 저장된 값을 뺄때 사용한다.
	//setter는 외부의 값을 객체에 저장할때 사용한다.
	
	//getter:public 필드의 데이터타입 get필드이름()
	//setter: public void set필드이름(필드데이터타입 필드이름)
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
		//여기서 this는 해당메소드를 실행하는 객체 자신을 뜻함;color본인.
		//만약 여기서 this를 붙여주지 않으면 파라미터로 넘어온 color를 뜻하기 때문에
		//파라미터 컬러에 파라미터 컬러의 값을 저장한다. -> 아무변화도 없게 된다.
	}
	//id, type, plateNumber 캡슐화를 하시오
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber=plateNumber;
	}
	
}
