package Practice;
/*[문제3] 로또 
크기가 6개인 정수형 배열을 잡아서 1~45사이의 난수를 발생하여 저장 후 출력하시오
단, 숫자가 중복되면 안된다

input() - 난수 발생, 중복된 숫자가 나오면 다시 발생
output() - 출력

*/
public class Practice3 {
	int ar[] = new int[6];

	public static void main(String[] args) {
		Practice3 p3 = new Practice3();
		p3.input();
		p3.output();
	}//main
	public void input() {
		//난수발생, 중복숫자 나오면 다시발생
		for(int i=0;i<6;i++) {
			ar[i] = (int)(Math.random()*45)+1;
		}//난수발생
		for(int i=0;i<=4;i++) {//중복처리
			for(int j=0;j<=5;j++) {
				if(ar[i]==ar[j]&& i!=j) {
					ar[i]=(int)(Math.random()*45)+1;
					j=-1;
				}
			}
		}//중복처리
		
	}//input
	
	public void output() {
		System.out.print("로또번호: ");
		for(int i: ar) {
			System.out.print(i+" ");
		}
	}//output
}
