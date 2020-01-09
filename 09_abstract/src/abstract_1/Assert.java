package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 입력: ");
		x= sc.nextInt();
		System.out.print("y값 입력: ");
		y= sc.nextInt();
		System.out.println("--------------------");
	}
	public void output() {
		assert y>=0:"y는 0보다 크거나 같아야 한다.";//y가 0보다 크거나 같으면 하는거임. 틀리면 error발생.(debug 체크시 사용)
		//Run as -- Run configurations -- arguments -- VM arguments 박스 안에 ( -ea ) 적어주기
		int mul=1;
		for(int i=0;i<y;i++) {
			mul*=x;
		}
		System.out.println(x+"의 "+y+"승은 "+mul);
	}
	public static void main(String[] args) {
		Assert a = new Assert();
		a.input();
		a.output();
	}

}
