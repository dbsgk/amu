package Practice;
/*[����1]
ũ�Ⱑ 50���� ���ڹ迭�� ��Ƽ� 65~90������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
A ~ Z���� ����� ���
�� 1�ٿ� 10���� ���

[������]
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
		int ar[] = new int[50];//���� ��
		for(int i=0; i<50;i++) {
			ar[i] = (int)(Math.random()*26)+65;
			System.out.print((char)ar[i]+" ");
			if((i+1)%10==0)System.out.println();
		}
		System.out.println();
		for(int al ='A';al<='Z';al++) {//���ĺ�
			int count=0;
			
			  for (int i :ar ){ 
				  if(i==al)count++; 
			  }//�迭�ϳ��� ������ count++;
			 
			
			/*
			 * for(int i=0;i<50;i++) { if(ar[i]==al)count++; }
			 */
			 
			if(al!=65 && al%5==0)System.out.println();
			System.out.print((char)al+" : "+count+"\t");
		}//for
	}//main

}//class
