package for_while_dowhile;
/*최소공배수(Least Common Multiple)
1~500사이의 난수를 100개 발생하여 2와 3의 공배수만 출력하고 합과 개수를 출력하시오.
단, 1줄에 7개씩 출력하시오.
[실행결과]
36 12 ...
2와 3의 공배수 개수  =
2와 3의 공배수 합 =
*/
public class ForTest_LCM {

	public static void main(String[] args) {
		int i,sum=0,count=0,random;
		//발생하는 즉시 2와3의 공배수인지 출력하고
		//2와 3의 공배수이면 sum에 넣고
		//		=		count++;
		//for문에 i가 100까지 뽑으니까 i%7==0이면 syso
		
		for(i=1;i<=100;i++) {
			random = (int)(Math.random()*500)+1;
			if(random%2==0&&random%3==0) {//random%6==0
				System.out.print(String.format("%5d", random)+" ");//String.format으로 자리수5개 줘서 간격 맞춰줌.
				sum+=random;
				count++;
				if(count%7==0)System.out.println();
			}
		}//for
		System.out.println();
		System.out.println("2와 3의 공배수 개수 = "+count);
		System.out.println("2와 3의 공배수 합 = "+sum);
	}

}
