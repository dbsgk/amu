package com.zoo;

public class ZooMain {

	public static void main(String[] args) {
		Zoo z= new Zoo();
		z.tiger();
		z.giraffe();
		z.elephant();
//		z.lion();
		//같은 패키지라 private 제외한 모든 메소드 다 호출가능
	}

}
