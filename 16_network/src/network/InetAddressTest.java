package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
//네이버 아이피를 얻어내고 싶어요
	public static void main(String[] args) throws UnknownHostException {
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("NAVER IP = "+naver.getHostAddress());
		System.out.println(naver);
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCALHOST IP = "+local.getHostAddress());
		System.out.println();
		
		InetAddress[] ar = InetAddress.getAllByName("www.daum.net");
		for(int i=0;i<ar.length;i++) {
			System.out.println("DAUM IP = "+ar[i]);
		}
		
	}
}
