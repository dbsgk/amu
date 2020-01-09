package for_while_dowhile;

/*
수    합     곱
1	1	1
2	3	2
3	6	6
4	10	24
5	15	120
6	21	720
7	28	5040
8	36	40320
9	45	362880
10	55	3628800*/
public class ForTest_Sum_Mul {

	public static void main(String[] args) {
		int sum=0, mul=1;//mul의 초기값은 1. 곱하기라 0으로 하면 0밖에 안나옴.
		
		for(int i =1; i<=10; i++) {
			sum+=i;//sum= sum+i;
			mul*=i;//mul= mul*i;
			System.out.println(i+"\t"+sum+"\t"+mul);
		}
	}

}
