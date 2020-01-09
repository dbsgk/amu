package class_1;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];//이렇게 클래스 객체를 배열로 잡으면 배열주소값 하나로 여러개 컨트롤 가능 
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("홍길동");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		
		ar[1].setName("코난");
		ar[1].setKor(69);
		ar[1].setEng(75);
		ar[1].setMath(90);
		
		ar[2].setName("또치");
		ar[2].setKor(75);
		ar[2].setEng(95);
		ar[2].setMath(86);
		/*
		 * System.out.println("이름: "+ar[i].getName() +"\t 국어: "+ar[i].getKor()
		 * +"\t 영어: "+ar[i].getEng() +"\t 수학: "+ar[i].getMath()
		 * +"\t 총점: "+ar[i].getTot() +"\t 평균: "+String.format("%.2f", ar[i].getAvg())
		 * +"\t 학점: "+ar[i].getGrade());
		 */
		/*
		 * for(int i=0;i<ar.length;i++) { ar[i].calc();
		 * System.out.println("이름: "+ar[i].getName() +"\t 국어: "+ar[i].getKor()
		 * +"\t 영어: "+ar[i].getEng() +"\t 수학: "+ar[i].getMath()
		 * +"\t 총점: "+ar[i].getTot() +"\t 평균: "+String.format("%.2f", ar[i].getAvg())
		 * +"\t 학점: "+ar[i].getGrade()); }
		 */
		for(SungJuk data:ar) {
			data.calc();
			System.out.println(data.getName()
					+"\t"+data.getKor()
					+"\t"+data.getEng()
					+"\t"+data.getMath()
					+"\t"+data.getTot()
					+"\t"+String.format("%.2f", data.getAvg())
					+"\t"+data.getGrade());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println("이름: "+ar[0].getName() +"\t 국어: "+ar[0].getKor()
		 * +"\t 영어: "+ar[0].getEng() +"\t 수학: "+ar[0].getMath()
		 * +"\t 총점: "+ar[0].getTot() +"\t 평균: "+String.format("%.2f", ar[0].getAvg())
		 * +"\t 학점: "+ar[0].getGrade());
		 */
	}
}
