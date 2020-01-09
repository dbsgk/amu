package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*소수구하기(1과 자기 자신의 수만 약수로 갖는 수)

[실행결과]
숫자 입력 : 7
7은 소수이다.

숫자 입력: 12
12는 소수가 아니다.

숫자 입력 :0
단, 0이 업력되면 프로그램을 종료합니다.
*/
public class ForTest_Sosu {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while(true) {//내가한거
//			System.out.print("숫자 입력 : ");
//			int num = Integer.parseInt(br.readLine());
//			if(num==0)break;
//			for(int i =1; i<=num;i++) {
//				if(num%i==0	)System.out.print(i+" ");
//			}
//			System.out.println();
//			int count=0;
//			for(int i=1;i<=num;i++) {
//				if(num%i==0)count++;
//			}
//			if(count==2)System.out.println(num+"는 소수이다.");
//			else System.out.println(num+"는 소수가 아니다.");
//			System.out.println();
//		}//while
		int sw;//스위치 0:불꺼짐, 1:불켜짐
		while(true) {
			sw=0;
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(br.readLine());
			if(num==0)break;
			for(int i=2;i<num;i++) {//소수는 1이 아닌 수로 나누어 떨어지지 않는 수, 자기자신 전까지 
				if(num%i==0)sw=1;//2~ (자기자신-1)중에 나눠떨어지는게 있으면 스위치를 1로 바꿔주고 
			}
			if(sw==0)System.out.println(num+"는 소수이다.");//스위치가 1로 안바뀐것만 소수임.
			else System.out.println(num+"는 소수가 아니다.");
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
