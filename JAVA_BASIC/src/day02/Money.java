package day02;

//용돈관리장
//날짜는 String으로 입력
//쓴 금액(int)
//내용(String)

//POJO
//Plain Old Java Object
//평범한 구식의 자바 객체

public class Money {
	private String date;
	private int paid;
	private String memo;
	
	public Money(String date, int paid, String memo) {
		this.date= date;
		this.paid= paid;
		this.memo= memo;
	}
	public Money() {
		this.date= "";
		this.paid= 0;
		this.memo= "";
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String toString() {
		return date+"\t"+paid+"\t"+memo+"\t";
	}
}


