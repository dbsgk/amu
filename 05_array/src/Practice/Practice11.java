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


public class Practice11 {
	public static void main(String[] args) {
		int ar[] = new int[50];//���� ��
		int count[] =new int[26];//���ĺ� ī��Ʈ ��
		
		for(int i=0; i<50;i++) {
			ar[i] = (int)(Math.random()*26)+65;
			System.out.print((char)ar[i]+" ");
			if((i+1)%10==0)System.out.println();
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			for(int j=0; j<count.length;j++) {
				if(ar[j]=='A'+j)count[j]++; //if(ar[j]=='A'+j)
			}//��
		}//�ٱ�for
		
		System.out.println();
		for(int i=0;i<count.length;i++) {
			System.out.println((char)(i+'A')+"\t"+count[i]);
		}

	}//main

}//class
