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

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest4 at = new ArrayTest4();
		
		while(true) {
			at.menu();//메뉴함수() 호출
			int choice = Integer.parseInt(at.br.readLine());
			if(choice==1) {
				//입차
				at.input(ar);continue;
			}else if(choice==2) {
				//출차
				at.output(ar);continue;
			}else if(choice==3) {
				//리스트
				at.list(ar);continue;
			}else if(choice==4) {
				//종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}//while
		
	}//main
	
	public boolean input(boolean[] ar) throws IOException {
		System.out.print("위치입력 :");
		int choice = Integer.parseInt(br.readLine());
		if(ar[choice-1]==true) System.out.println("이미 주차되어있습니다.");
		else System.out.println(choice+"위치에 입차");
		System.out.println();
		return ar[choice-1]= true;//입력값은 1부터 시작이라 
	}//input
	
	public boolean output(boolean[] ar)throws IOException {
		System.out.print("출차할 번호를 선택해주세요 : ");
		int choice = Integer.parseInt(br.readLine());
		if(ar[choice-1]==false) System.out.println("주차되어 있지 않습니다.");
		else System.out.println(choice+"위치에 출차");
		System.out.println();
		return ar[choice-1]= false;
		
	}//output
	
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+1+"위치 : "+ar[i]);
		}//for
		System.out.println();
	}//list
	public void menu() {
		System.out.println("*************************");
		System.out.println("\t1. 입차");
		System.out.println("\t2. 출차");
		System.out.println("\t3. 리스트");
		System.out.println("\t4. 종료");
		System.out.println("*************************");

	}//menu

}
