package for_while_dowhile;
/*[실행결과]
 -1+2-3+4-5+6-7+8-9+10 = 5
 -----------------------------
1 출력할 때부터 sum 같이 출력하기.
 
*/
public class ForTest_SumEx {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				sum+=i;
				System.out.print("+"+i);
			}else {
				sum-=i;
				System.out.print("-"+i);

			}
		}//for
		System.out.println(" = "+sum);
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				sum+=i;
			}else {
				sum-=i;
			}
			System.out.println(i+"\t"+sum);
		}//for
		
		
	}

}
