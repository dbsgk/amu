package for_while_dowhile;
/*A~Z �������� 100���� ����Ͻÿ�
 * 1�ٴ� 10���� ����ϼ���
 * [������]
 * F S D L L W ... 
 * �� �߿��� A�� ����� ����Ͻÿ�
 * A�� ���� = 6;
 * */

public class ForTest_RandomEx {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=100; i++) {
			int r = (int)(Math.random()*26)+65;
			System.out.print((char)r+" ");
			if(i%10==0)System.out.println();
			if(r=='A')count++;
			
		}System.out.println("A�� ���� = "+count);
	}

}
