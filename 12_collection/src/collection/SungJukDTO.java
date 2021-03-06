package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO> {
	private int number,kor,eng,math,tot;
	private String name;
	private double avg;
	DecimalFormat df = new DecimalFormat("##.###");
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public int getTot() {
		this.tot = kor+eng+math;
		return tot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		this.avg = tot/3.0;
		return avg;
	}
	@Override
	public String toString() {
		return number+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+df.format(avg);
	}
	@Override
	public int compareTo(SungJukDTO dto) {
		if(tot < dto.tot) return -1;
		else if(tot == dto.tot)return 0;
		else return 1;
	}
	
}
