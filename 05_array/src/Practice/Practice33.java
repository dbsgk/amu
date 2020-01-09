package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice33 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice33 p = new Practice33();
		int lotto[] = new int[6];
		System.out.print("���� �Է� : ");
		int money = Integer.parseInt(br.readLine());//�����Է� : 
		//5�پ� �μ�ǰ� �����ض�.
		//õ���� ���پ�
		
		for(int i=1; i<=money/1000;i++) {
			p.input(lotto);
			//Arrays.sort(lotto);	//��������
			p.sort(lotto);
			p.output(lotto);
			System.out.println();
			if(i%5==0)System.out.println();
		}
		//�����Թ���̾�
		
		
		/*
		int count=0;
		for(int i=money/1000; i>0;i--) {
			count++;
			p.input(lotto);
			Arrays.sort(lotto);	//��������
			p.output(lotto);
			System.out.println();
			if(count%5==0)System.out.println();
		}*/
		//������̾�
		
	}//main
	private void sort(int[] lotto) {
		//Selection Sort
		int temp = 0;
		for(int i=0;i<lotto.length-1;i++) {//������ �濡�� j�� ���ϱ� i�� length-1������.
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {// >: ��������  	<:��������  
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}	
	}//sort
	public void input(int lotto[]) {
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
		//�����߻�
	
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {i--; break;}
			//�ߺ�üũ
			}
		}
	}//input
	private void output(int[] lotto) {
		for(int n: lotto)System.out.print(String.format("%3d", n)+" ");
	}//output

}
