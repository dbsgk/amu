package for_while_dowhile;
/*[������]
 
 -1+2-3+4-5+6-7+8-9+10 ������ sum�� ���ϰ� mul�� ���϶�.
 �� ���� �߰��ɶ����� �ش� ���� sum�� mul���� ����϶�.
��	sum	mul 
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
