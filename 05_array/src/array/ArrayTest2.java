package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int)(Math.random()*9)+2;
		
		String[] ar;
		ar = new String[size];
		System.out.println("�迭�� ar = "+ar);
		//�迭�� ar = [Ljava.lang.String;@6d06d69c
		//			             Ǯ��������
		System.out.println("�迭ũ�� = "+ar.length);//��ɾ�
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("���ϸ� �Է�:");
			ar[i] = br.readLine();
		}
		
		for(String data: ar) {
			System.out.println(data);
			System.out.println("ù��° ����= "+data.charAt(0));
			System.out.println("���ڿ��� ũ��= "+data.length());//�Լ�
			//ar.length : ��ɾ�   ar[0].length(): �Լ�  -----------�Լ��� ��ɾ��� ���̴�??? 
			//�̰� �迭��ü�� ũ��	�̰� �ش� �� ���ڿ��� ũ��.
			//System.out.println("���ڿ��� ��ġ= "+data.indexOf("��"));//������ �ε�����ȣ���, ������ -1;

			System.out.println();
			
			
		}
		
	}

}
