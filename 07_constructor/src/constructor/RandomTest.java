package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		Random r = new Random();
		System.out.println("����= "+Math.random());
		System.out.println("����= "+r.nextDouble());//��ȸ��
		System.out.println("����= "+new Random().nextInt());//��ȸ�� new Random; �̷��� �ȿ� �μ��� �ȳִ� nextInt�� ������ ����.
		System.out.println("����= "+new Random().nextInt(100));//0~99
		System.out.println("����= "+(new Random().nextInt(100)+1));//1~100
		
	}
	public static void main(String[] args) {
		new RandomTest();//�̰� ��ȸ��. �ּҰ�����. 
	
		
		
	}//main

}//class
