package constructor;

public class VarArgs {
	/*private int sum(int i, int j) {
		return i+j;
	}
	private int sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}
	private int sum(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return i+j+k+l;
	}*/
	public int sum(int... ar) {//... 몇개가 들어오든 배열로 받아서 처리하겠다(파라미터 배열화)
		int tot=0;
		for(int i=0;i<ar.length;i++) {
			tot+=ar[i];
		}
		return tot;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = "+va.sum(10,20));//호출
		System.out.println("합 = "+va.sum(10,20,30));//호출
		System.out.println("합 = "+va.sum(10,20,30,40));//호출
		
		
		
	}//main
	

}//class
