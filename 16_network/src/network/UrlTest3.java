package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest3 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://liebli.com/goods/goods_list.php?cateCd=001002");
		//18k 개수 구하기. 대소문자 상관 ㄴㄴ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		int count=0;
//		int index=0;
		while((line = br.readLine())!=null) {
			int start=0;
			while ((start=line.toUpperCase().indexOf("18K", start))!=-1) {
				count++;
				start += "18K".length(); 
			}
		}
		System.out.println("18k 개수 = "+count);
	}
}
