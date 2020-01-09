package for_while_dowhile;

/*[실행결과]
 * -1+2-3+4-5+6-7+8-9+10 = 5*/
public class ForTest_Sum {

	public static void main(String[] args) {
		int num;
		int sum=0;
		
		for(num=1;num<=10;num++) {
			if(!(num%2==0)) {
				num*=-1;
				System.out.print(num);
				sum+=num;
				num*=-1;
			}else {
				sum+=num;
				System.out.print("+"+num);
			}
			
		}System.out.println(" = "+sum);
		
		int sum1=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print("+"+i);
				sum1+=i;
			}else {
				System.out.print("-"+i);
				sum1-=i;
			}
		}//for
		System.out.println(" = "+sum1);
	}

}
