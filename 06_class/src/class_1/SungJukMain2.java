package class_1;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];//�̷��� Ŭ���� ��ü�� �迭�� ������ �迭�ּҰ� �ϳ��� ������ ��Ʈ�� ���� 
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("ȫ�浿");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		
		ar[1].setName("�ڳ�");
		ar[1].setKor(69);
		ar[1].setEng(75);
		ar[1].setMath(90);
		
		ar[2].setName("��ġ");
		ar[2].setKor(75);
		ar[2].setEng(95);
		ar[2].setMath(86);
		/*
		 * System.out.println("�̸�: "+ar[i].getName() +"\t ����: "+ar[i].getKor()
		 * +"\t ����: "+ar[i].getEng() +"\t ����: "+ar[i].getMath()
		 * +"\t ����: "+ar[i].getTot() +"\t ���: "+String.format("%.2f", ar[i].getAvg())
		 * +"\t ����: "+ar[i].getGrade());
		 */
		/*
		 * for(int i=0;i<ar.length;i++) { ar[i].calc();
		 * System.out.println("�̸�: "+ar[i].getName() +"\t ����: "+ar[i].getKor()
		 * +"\t ����: "+ar[i].getEng() +"\t ����: "+ar[i].getMath()
		 * +"\t ����: "+ar[i].getTot() +"\t ���: "+String.format("%.2f", ar[i].getAvg())
		 * +"\t ����: "+ar[i].getGrade()); }
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
		 * System.out.println("�̸�: "+ar[0].getName() +"\t ����: "+ar[0].getKor()
		 * +"\t ����: "+ar[0].getEng() +"\t ����: "+ar[0].getMath()
		 * +"\t ����: "+ar[0].getTot() +"\t ���: "+String.format("%.2f", ar[0].getAvg())
		 * +"\t ����: "+ar[0].getGrade());
		 */
	}
}
