package for_while_dowhile;
/*[실행결과]
 
 -1+2-3+4-5+6-7+8-9+10 순서로 sum에 더하고 mul에 더하라.
 각 값이 추가될때마다 해당 값과 sum과 mul값을 출력하라.
수	sum	mul 
1	-1	-1
2	1	-2
3	-2	6
4	2	24
5	-3	-120
6	3	-720
7	-4	5040
8	4	40320
9	-5	-362880
10	5	-3628800

 
 */
public class ForTest_Sum_MulEx {

	public static void main(String[] args) {
		int sum=0, mul=1;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			}else {
				sum-=i;
			}
			if(i%2==0) {
				mul*=i;
			}else {
				mul*= -i;
			}
			System.out.println(i+"\t"+sum+"\t"+mul);
		}//for
		
	}

}
