package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException { //���� �θ�� Throwable�̶� ���߿� MVC���� ���� ��
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		while((data = bis.read()) != -1){ //read()�޼ҵ�� int���� read
			System.out.print((char)data);
		} //���̻� ���� �� ������ -1�� ��������. ���� �� ���� �� ���� �ѱ��ھ� �ҷ�����
		
		//������ ������ 1310�� �����µ� ���Ͱ��̴� 
		//13�� �Ǿ����� ���� \r
		//10�� �����ٷ� ���� \n
		//�̷��� ���ʹ� �ι���Ʈ�� ������ �ִ� ����.
		
	}
}
