package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MoneyEx1 {

	public static void main(String[] args) throws IOException {
		ArrayList<Money> list = new ArrayList<Money>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("****** �뵷������ *****");
		while(true) {
			System.out.println("1.�Է� 2.���� 3.��� 4.���� ");
			int choice = Integer.parseInt(br.readLine());
			if(choice==1) {
				//�Է�(��¥,�ݾ�,�޸�)
				Money m = new Money();
				System.out.print("��¥: ");
				m.setDate(br.readLine());
				System.out.print("�ݾ�: ");
				m.setPaid(Integer.parseInt(br.readLine()));
				System.out.print("�޸�: ");
				m.setMemo(br.readLine());
				
				list.add(m);
				
			}else if(choice==2) {
				//����
				System.out.println("=================");
				System.out.println("     ��볻��          ");
				System.out.println("=================");
				for(int i=0;i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				System.out.println("������ ��ȣ�� �Է����ּ���.");
				//������ȣ�Է¹ް�
				int number = Integer.parseInt(br.readLine()); 
				//�׹�ȣ�� �ش��ϴ� �ε��������
				list.remove(number);
			}else if(choice==3) {
				//���
				System.out.println("=================");
				System.out.println("     ��볻��          ");
				System.out.println("=================");
				for(int i=0;i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				
			}else if(choice==4) {
				System.out.println("�����մϴ�.");
				break;
			}
		}//while

	}//main

}//class
