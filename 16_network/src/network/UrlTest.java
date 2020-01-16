package network;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.co.kr/index.html");
		System.out.println("프로토콜 = "+url.getProtocol());//
		System.out.println("호스트 = "+url.getHost());
		System.out.println("포트 = "+url.getPort());
		System.out.println("기본 포트 = "+url.getDefaultPort());//기본 포트 = 80
		System.out.println("파일 = "+url.getFile());
		System.out.println();
		
		URL url2 = new URL("https://www.google.co.kr/index.html");
		System.out.println("프로토콜 = "+url2.getProtocol());//
		System.out.println("호스트 = "+url2.getHost());
		System.out.println("포트 = "+url2.getPort());
		System.out.println("기본 포트 = "+url2.getDefaultPort());//기본 포트 = 443
		System.out.println("파일 = "+url2.getFile());
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		
	}
}
