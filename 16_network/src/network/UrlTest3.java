package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest3 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://liebli.com/goods/goods_list.php?cateCd=001002");
		//18k ���� ���ϱ�. ��ҹ��� ��� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		int count=0;
//		int index=0;
		while((line = br.readLine())!=null) {
			int start=0;
			while ((start=line.toLowerCase().indexOf("18k", start))!=-1) {
				count++;
				start += "18k".length(); 
			}
		}
//		while((line = br.readLine())!=null) {
//			int start=0;
//			while ((start=line.toUpperCase().indexOf("18k", start))!=-1) {
//				count++;
//				start += "18k".length(); 
//			}
//		}
		System.out.println("18k ���� = "+count);
	}
}
