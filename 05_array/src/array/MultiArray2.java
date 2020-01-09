package array;

public class MultiArray2 {

	public static void main(String[] args) {
		int ar[][] =new int[10][10];
		int num=100;
		//입력
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				num--;
				ar[j][i] = num;
				//ar[i][j] = (j*10)+i+1; // 1 11 21 31 41 51 ...
				
				//num++;
				//ar[i][j] = num;
				//ar[i][j] = (i*10)+j+1; //1 2 3 4 5 6 ...
			}
		}
		//출력
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(String.format("%4d", ar[i][j]));
				//System.out.print("ar["+i+"]["+j+"] ="+ar[i][j]+"\t");
			}
			System.out.println();
		}
	}
	/*
	 * public static void main(String[] args) { int ar[][] =new int[10][10]; int
	 * num=0; //입력
	 * 
	 * for(int i=0;i<ar.length;i++) { for(int j=0;j<ar[i].length;j++) { num++;
	 * ar[j][i] = num; //ar[i][j] = (j*10)+i+1; // 1 11 21 31 41 51 ...
	 * 
	 * //num++; //ar[i][j] = num; //ar[i][j] = (i*10)+j+1; //1 2 3 4 5 6 ... } }
	 * //출력 for(int i=0;i<ar.length;i++) { for(int j=0;j<ar[i].length;j++) {
	 * System.out.print(String.format("%4d", ar[i][j]));
	 * //System.out.print("ar["+i+"]["+j+"] ="+ar[i][j]+"\t"); }
	 * System.out.println(); } }
	 */

}
