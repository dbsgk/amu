package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����6]
����5������ ����2, ����3�� if������ ó���� ���� switch�� �ٲٽÿ�

[����5] ���� ���� ���α׷�
�߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�

����1) (�߰�+�⸻)/2    ---> 60%
          ����   	      ---> 20%
          �⼮               ---> 20%     
����2)  90�̻� 'A'����     		
          80�̻� 'B'����        		  	 
          70�̻� 'C'����        		  	 
          60�̻� 'D'����        		  	 
          ������ 'F'����
����3)
         A, B����  ---->"excellent"     
         C, D����  ---->"good"
         F����    ---->"poor"

[������]
�߰���縦 �Է��Ͻÿ� : 90
�⸻��縦 �Է��Ͻÿ� : 89
���������� �Է��Ͻÿ� : 99
�⼮������ �Է��Ͻÿ� : 100

����=93.20         <---�Ҽ����� 2°�ڸ�����
����=A              
��=excellent

*/
public class Practice6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�߰���� ������ �Է��Ͻÿ� : ");
		int midExam = Integer.parseInt(br.readLine());
		System.out.print("�⸻��� ������ �Է��Ͻÿ� : ");
		int finExam = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("�⼮ ������ �Է��Ͻÿ� : ");
		int attend = Integer.parseInt(br.readLine());
		
		double score = 0;
		String grade = null;
		String comment = null;
		
		score=((midExam+finExam)/2)*0.6 + report*0.2 + attend*0.2;//����

		switch((int)score/10) {
		case 10 :
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		case 6 : grade="D";break;
		default : grade="f";
		}
		switch((int)score/10) {
		case 9 : case 8 : comment="exellent";break;
		case 7 : case 6 : comment="good";break;
		default : comment="poor";
		}
		
		System.out.println("���� = "+String.format("%.2f", score));
		System.out.println("���� = "+grade);
		System.out.println("�� = "+comment);
	}//main

}//class
