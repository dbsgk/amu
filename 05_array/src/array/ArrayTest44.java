package array;

/*boolean[] ar = new boolean[5];

주차장 관리 프로그램

menu()
**************
   1. 입차            input()
   2. 출차            output()
   3. 리스트         list()
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest44 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest44 at = new ArrayTest44();
		at.menu(ar);//메뉴함수() 호출
		
		
	}//main
	
	public void input(boolean[] ar) throws IOException {
		System.out.print("위치입력 :");
		int index = Integer.parseInt(br.readLine());
		if(ar[index-1]) System.out.println("이미 주차되어있습니다.");//입력값은 1부터 시작이라 
		//ar[index-1] 얘네 자체가 boolean형태라서  참이면 블록실행하고 아니면 실행 안함. 그래서 ar[index-1]==true 이렇게 쓸필요없다.
		else {ar[index-1]= true;System.out.println(index+"위치에 입차");}
		
	}//input
	
	public void output(boolean[] ar)throws IOException {
		System.out.print("출차할 번호를 선택해주세요 : ");
		int index = Integer.parseInt(br.readLine());
		if(ar[index-1]) {System.out.println(index+"위치에 출차");ar[index-1]= false;}
		else System.out.println("주차되어 있지 않습니다.");
		
		
	}//output
	
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+1+"위치 : "+ar[i]);
		}//for
		System.out.println();
	}//list
	public void menu(boolean ar[]) throws IOException{ //메소드에 exception을 걸면 이 메소드를 사용하는 메인 쪽에도 exception을 걸어야 함.
		int num;
		while(true) {
			System.out.println();
			System.out.println("*************************");
			System.out.println("\t1. 입차");
			System.out.println("\t2. 출차");
			System.out.println("\t3. 리스트");
			System.out.println("\t4. 종료");
			System.out.println("*************************");
			System.out.println(" 번호: ");
			num=Integer.parseInt(br.readLine());
			if(num==4)break;
			if(num<1||num>4) {
				System.out.println("1~4번 입력가능");continue;
			}
			if(num==1) input(ar);
			if(num==2) output(ar);
			if(num==3) list(ar);
			
		}//while
	}//menu

}
