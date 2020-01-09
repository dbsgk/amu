package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str= "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");
		
		System.out.println("토큰개수 = "+st.countTokens());//3
		while(st.hasMoreTokens()) {//1. 토큰이 있나 없나 물어봄
			System.out.println(st.nextToken());//2. 토큰을 꺼내고 다음으로 이동함.
			//3.  ... 1,2 반복
			//4.
		
		}//이터레이터에, db에 사용함.
		System.out.println("-------------------------------------------------------");
		
		String[] ar = str.split(",");
		for(String data:ar) {
			System.out.println(data);
		}
		//split은 그냥 배열로 받아서 for로 출력.
		
	}//main

}//class
