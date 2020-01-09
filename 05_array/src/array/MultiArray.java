package array;

public class MultiArray {

	public static void main(String[] args) {
		int ar[][] = new int[3][2];
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[2][0] = 50;
		ar[2][1] = 60;
		
		System.out.println("배열명 ar = "+ar);//주소값나옴
		System.out.println("ar[0] = "+ar[0]);
		System.out.println("ar[1] = "+ar[1]);
		System.out.println("ar[2] = "+ar[2]);//여기까지 주소값
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("ar ["+i+"] ["+j+"] ="+ar[i][j]);
			}
		}
		
		
		
		
	}

}
