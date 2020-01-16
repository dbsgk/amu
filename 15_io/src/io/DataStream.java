package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream { //FileNotFoundException 부모가 IOException이라서 사라지고 부모만 throws
	public static void main(String[] args) throws IOException { //메인 하나밖에 없어서 throws 던짐.다른 메소드가 있으면 메소드마다 throws해줘야 해서 try,catch사용하는데 메소드가 메인메소드 하나라서 그럴 필요 ㄴㄴ
		
		File file = new File("result.txt"); //아래처럼 파일 이름만 써도 괜찮고, 이렇게 파일 생성해도 괜찮고.
		FileOutputStream fos = new FileOutputStream("result.txt");//버퍼메모리를 파일로 변환
		DataOutputStream dos = new DataOutputStream(fos);//버퍼메모리로 변환
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt")); 위 두 줄을 합친 것.

		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeFloat(185.3f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("이름= "+dis.readUTF());
		System.out.println("나이= "+dis.readInt());
		//System.out.println("키= "+dis.readDouble()); //java.io.EOFException - 파일의 끝 처리가 제대로 안됐다. 
		System.out.println("키= "+dis.readFloat());
		dis.close();
	}
}
