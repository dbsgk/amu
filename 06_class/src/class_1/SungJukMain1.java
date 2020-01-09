package class_1;

public class SungJukMain1 {
	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setName("홍길동");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.calc();//총점,평균,학점 계산해라
		System.out.println("이름: "+aa.getName()
		+"\t 국어: "+aa.getKor()
		+"\t 영어: "+aa.getEng()
		+"\t 수학: "+aa.getMath()
		+"\t 총점: "+aa.getTot()
		+"\t 평균: "+String.format("%.2f", aa.getAvg())
		+"\t 학점: "+aa.getGrade());
		
		SungJuk bb = new SungJuk();
		bb.setName("코난");
		bb.setKor(69);
		bb.setEng(75);
		bb.setMath(90);
		bb.calc();//총점,평균,학점 계산해라
		System.out.println("이름: "+bb.getName()
		+"\t 국어: "+bb.getKor()
		+"\t 영어: "+bb.getEng()
		+"\t 수학: "+bb.getMath()
		+"\t 총점: "+bb.getTot()
		+"\t 평균: "+String.format("%.2f", bb.getAvg())
		+"\t 학점: "+bb.getGrade());
		
		SungJuk cc = new SungJuk();
		cc.setName("또치");
		cc.setKor(75);
		cc.setEng(95);
		cc.setMath(86);
		cc.calc();//총점,평균,학점 계산해라
		System.out.println("이름: "+cc.getName()
		+"\t 국어: "+cc.getKor()
		+"\t 영어: "+cc.getEng()
		+"\t 수학: "+cc.getMath()
		+"\t 총점: "+cc.getTot()
		+"\t 평균: "+String.format("%.2f", cc.getAvg())
		+"\t 학점: "+cc.getGrade());
		
		
	}
}
