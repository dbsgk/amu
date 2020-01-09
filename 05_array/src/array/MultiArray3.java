package array;

public class MultiArray3 {

	public static void main(String[] args) {
		int ar[][] = { { 1, 2, 3, 0 }, { 4, 5, 6, 0 }, { 7, 8, 9, 0 }, { 0, 0, 0, 0 } };// 4x4
		// 쌤 답
		for (int i = 0; i < ar.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j < ar[i].length - 1; j++) {
				ar[i][3] += ar[i][j];//가로
				//ar[3][i] += ar[j][i];//세로(하나의 행씩 )
				ar[3][j] += ar[i][j];//세로2(하나의 열씩 )
				ar[3][3] += ar[i][j];//마지막합.
			}

		}

		/*
		 * //입력 //00 +01 +02 =03 for(int i =0;i<ar.length;i++) { int sum =0; for(int j =
		 * 0;j<ar[i].length;j++) {
		 * 
		 * sum+= ar[i][j]; if(j==ar.length-2)ar[i][ar.length-1]=sum; }
		 * 
		 * }//가로합 //00 10 20 30 for(int i =0;i<ar.length-1;i++) { int sum =0; for(int j
		 * = 0;j<ar[i].length-1;j++) { ar[3][i] +=ar[j][i];
		 * 
		 * 
		 * sum+= ar[j][i]; if(j==ar[i].length-2)ar[j][ar.length-1]=sum;
		 * 
		 * }
		 * 
		 * }//세로합
		 */

		// 출력
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
				// System.out.print("ar["+i+"]["+j+"] ="+ar[i][j]+"\t");
			}
			System.out.println();
		} // 출력

	}// main
}// class
