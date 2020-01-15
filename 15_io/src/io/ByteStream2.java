package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int size = (int)file.length();//파일 크기
		//배열은 int로만 잡힘. long으로는 배열안됨. 그래서 그냥 파일크기를 int형으로 변환시켜줘야함.
		byte[] ar = new byte[size];
		
		bis.read(ar, 0, size);//read(배열, 시작점 ,크기)
		
		//System.out.println(ar);//이렇게 찍으면 주소값만 나옴
		System.out.println(new String(ar));//String생성자가 byte배열을 받아서 문자로 변환해줌
		
		bis.close();
	}
}
