package Practice;
//���ڸ� �������迭�� �ض�.
/*

*/
public class MultiArray4 {
	public static void main(String[] args) {
		String name[] = {"ȫ�浿", "�ڳ�", "��ġ"};
		int score[][] = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};//4��3��
		double avg[] = new double[3];
		char grade[] = new char[3];
		System.out.println("--------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("--------------------------------------------------------");
		int i,j=0;
		for(i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			for(j=0;j<score[i].length-1;j++) {
//				score
				score[i][3]+= score[i][j];
				avg[i] = score[i][3]/3.0;
				if(avg[i]>=90)grade[i]='A';
				else if(avg[i]>=80)grade[i]='B';
				else if(avg[i]>=70)grade[i]='C';
				else if(avg[i]>=60)grade[i]='D';
				else grade[i]='F';
				
				System.out.print(score[i][j]+"\t");
			}//for(j)
			System.out.print(score[i][3]+"\t"+String.format("%.2f", avg[i])+"\t"+grade[i]+"\t");
			System.out.println();
		}//for(i)
		System.out.println("--------------------------------------------------------");

		
	}//main
}//class
