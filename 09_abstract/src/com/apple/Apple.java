package com.apple;
//오늘 패키지 import연습
import com.zoo.Zoo;
public class Apple {
	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		Zoo z= new Zoo();
		z.tiger();
//		z.giraffe();
//		z.elephant();
//		z.lion();
		//접근제어자 때문에 접근불가.
	}
}
