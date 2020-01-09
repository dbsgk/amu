package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		Random r = new Random();
		System.out.println("난수= "+Math.random());
		System.out.println("난수= "+r.nextDouble());//다회용
		System.out.println("난수= "+new Random().nextInt());//일회용 new Random; 이렇게 안에 인수를 안넣는 nextInt는 음수도 나옴.
		System.out.println("난수= "+new Random().nextInt(100));//0~99
		System.out.println("난수= "+(new Random().nextInt(100)+1));//1~100
		
	}
	public static void main(String[] args) {
		new RandomTest();//이건 일회용. 주소값없음. 
	
		
		
	}//main

}//class
