package day02;
//�ʵ�: ������ȣ, �̸�, �г�, ��, ������ ����
//�޼ҵ�: �������, �򱺰��, getter/setter
public class Student {
	private final int SUBJECT_NUMBER=3;//���񰳼�; ����� �̷��� ������ ������� ���߿� ���������� ����.
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
		return sum()/(SUBJECT_NUMBER * 1.0);//������ 3���� 3.0���� �����µ� �̷��� ���ڸ� ���������� ������ ���߿� ���������� ��ƴ�.
	}//������� �ٲ�� �׶����� �ٲ������.
	
	
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
	//override�� �����ٶ�� �ǹ̷�
	//�θ�Ŭ���� Ȥ�� �������̽��κ��� ��ӹ��� method�� 
	//�ڽ�Ŭ������ '������'�ϴ� ���� �������̵��� �Ѵ�.
	
	//toString =��ü�� ������ String���� �ٲ���
	
	
	  public String toString() { return
	  id+"\t"+name+"\t"+grade+"\t"+room+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum()+"\t"
	  +avg()+"\t"; }
	 
	
	
	
	
	
	
}
