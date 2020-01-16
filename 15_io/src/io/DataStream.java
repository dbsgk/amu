package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream { //FileNotFoundException �θ� IOException�̶� ������� �θ� throws
	public static void main(String[] args) throws IOException { //���� �ϳ��ۿ� ��� throws ����.�ٸ� �޼ҵ尡 ������ �޼ҵ帶�� throws����� �ؼ� try,catch����ϴµ� �޼ҵ尡 ���θ޼ҵ� �ϳ��� �׷� �ʿ� ����
		
		File file = new File("result.txt"); //�Ʒ�ó�� ���� �̸��� �ᵵ ������, �̷��� ���� �����ص� ������.
		FileOutputStream fos = new FileOutputStream("result.txt");//���۸޸𸮸� ���Ϸ� ��ȯ
		DataOutputStream dos = new DataOutputStream(fos);//���۸޸𸮷� ��ȯ
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt")); �� �� ���� ��ģ ��.

		dos.writeUTF("ȫ�浿");
		dos.writeInt(25);
		dos.writeFloat(185.3f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("�̸�= "+dis.readUTF());
		System.out.println("����= "+dis.readInt());
		//System.out.println("Ű= "+dis.readDouble()); //java.io.EOFException - ������ �� ó���� ����� �ȵƴ�. 
		System.out.println("Ű= "+dis.readFloat());
		dis.close();
	}
}
