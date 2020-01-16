package network;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.co.kr/index.html");
		System.out.println("�������� = "+url.getProtocol());//
		System.out.println("ȣ��Ʈ = "+url.getHost());
		System.out.println("��Ʈ = "+url.getPort());
		System.out.println("�⺻ ��Ʈ = "+url.getDefaultPort());//�⺻ ��Ʈ = 80
		System.out.println("���� = "+url.getFile());
		System.out.println();
		
		URL url2 = new URL("https://www.google.co.kr/index.html");
		System.out.println("�������� = "+url2.getProtocol());//
		System.out.println("ȣ��Ʈ = "+url2.getHost());
		System.out.println("��Ʈ = "+url2.getPort());
		System.out.println("�⺻ ��Ʈ = "+url2.getDefaultPort());//�⺻ ��Ʈ = 443
		System.out.println("���� = "+url2.getFile());
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		
	}
}
