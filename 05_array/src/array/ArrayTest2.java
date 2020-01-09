package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int)(Math.random()*9)+2;
		
		String[] ar;
		ar = new String[size];
		System.out.println("배열명 ar = "+ar);
		//배열명 ar = [Ljava.lang.String;@6d06d69c
		//			             풀쿼리네임
		System.out.println("배열크기 = "+ar.length);//명령어
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("과일명 입력:");
			ar[i] = br.readLine();
		}
		
		for(String data: ar) {
			System.out.println(data);
			System.out.println("첫번째 문자= "+data.charAt(0));
			System.out.println("문자열의 크기= "+data.length());//함수
			//ar.length : 명령어   ar[0].length(): 함수  -----------함수와 명령어의 차이는??? 
			//이건 배열자체의 크기	이건 해당 방 문자열의 크기.
			//System.out.println("문자열의 위치= "+data.indexOf("딸"));//있으면 인덱스번호출력, 없으면 -1;

			System.out.println();
			
			
		}
		
	}

}
