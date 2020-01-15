package io;

import java.io.Serializable;
import java.text.DecimalFormat;

public class ScoreDTO implements Comparable<ScoreDTO>, Serializable{//파일로 보낼 수 있게 해줌.
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private DecimalFormat df = new DecimalFormat();
	
	public ScoreDTO(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		tot = kor+eng+math;
		return tot;
	}
	public double getAvg() {
		avg = Double.parseDouble(df.format(tot/3.0));
		return avg;
	}
	@Override
	public int compareTo(ScoreDTO dto) {
		if(tot < dto.tot) return -1;
		else if(tot == dto.tot)return 0;
		else return 1;
	}
	
}
