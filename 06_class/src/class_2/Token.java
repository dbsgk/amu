package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str= "�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str,",");
		
		System.out.println("��ū���� = "+st.countTokens());//3
		while(st.hasMoreTokens()) {//1. ��ū�� �ֳ� ���� ���
			System.out.println(st.nextToken());//2. ��ū�� ������ �������� �̵���.
			//3.  ... 1,2 �ݺ�
			//4.
		
		}//���ͷ����Ϳ�, db�� �����.
		System.out.println("-------------------------------------------------------");
		
		String[] ar = str.split(",");
		for(String data:ar) {
			System.out.println(data);
		}
		//split�� �׳� �迭�� �޾Ƽ� for�� ���.
		
	}//main

}//class
