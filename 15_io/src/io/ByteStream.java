package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException { //제일 부모는 Throwable이라 나중에 MVC가면 많이 씀
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		while((data = bis.read()) != -1){ //read()메소드는 int형만 read
			System.out.print((char)data);
		} //더이상 읽을 게 없으면 -1을 내보낸다. 읽을 게 없을 때 까지 한글자씩 불러오기
		
		//파일을 읽으면 1310이 잡히는데 엔터값이다 
		//13은 맨앞으로 가는 \r
		//10은 다음줄로 가는 \n
		//이렇게 엔터는 두바이트가 합쳐져 있는 거임.
		
	}
}
