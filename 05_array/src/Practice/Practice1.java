package Practice;
/*[문제1]
크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
A ~ Z까지 몇개인지 출력
단 1줄에 10개씩 출력

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0*/
public class Practice1 {
	public static void main(String[] args) {
		int ar[] = new int[50];//난수 방
		for(int i=0; i<50;i++) {
			ar[i] = (int)(Math.random()*26)+65;
			System.out.print((char)ar[i]+" ");
			if((i+1)%10==0)System.out.println();
		}
		System.out.println();
		for(int al ='A';al<='Z';al++) {//알파벳
			int count=0;
			
			  for (int i :ar ){ 
				  if(i==al)count++; 
			  }//배열하나씩 뒤져서 count++;
			 
			
			/*
			 * for(int i=0;i<50;i++) { if(ar[i]==al)count++; }
			 */
			 
			if(al!=65 && al%5==0)System.out.println();
			System.out.print((char)al+" : "+count+"\t");
		}//for
	}//main

}//class
