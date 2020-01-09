package day02;
//필드: 관리번호, 이름, 학년, 반, 국영수 점수
//메소드: 총점계산, 평군계산, getter/setter
public class Student {
	private final int SUBJECT_NUMBER=3;//과목개수; 상수를 이렇게 변수로 적어줘야 나중에 유지보수가 쉽다.
	private int id;
	private String name;
	private int grade;
	private int room;
	private int kor;
	private int eng;
	private int math;
	
	public Student(int id, String name, int grade, int room, int kor, int eng, int math) {
		this.id = id;
		this.name= name;
		this.grade= grade;
		this.room= room;
		this.kor= kor;
		this.eng= eng;
		this.math= math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int sum() {
		return kor+eng+math;
	}
	
	public double avg() {
		return sum()/(SUBJECT_NUMBER * 1.0);//과목이 3개라 3.0으로 나눴는데 이렇게 숫자를 직접적으로 넣으면 나중에 유지보수가 어렵다.
	}//과목수가 바뀌면 그때마다 바꿔줘야함.
	
	
	public Student() {
		this.id =0;
		this.name= "";
		this.grade= 0;
		this.room= 0;
		this.kor= 0;
		this.eng= 0;
		this.math= 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	//override
	//override란 덮어씌우다라는 의미로
	//부모클래스 혹은 인터페이스로부터 상속받은 method를 
	//자식클래스가 '재정의'하는 것을 오버라이드라고 한다.
	
	//toString =객체의 내용을 String으로 바꿔줌
	
	
	  public String toString() { return
	  id+"\t"+name+"\t"+grade+"\t"+room+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum()+"\t"
	  +avg()+"\t"; }
	 
	
	
	
	
	
	
}
