package for_while_dowhile;

/*A~Z �������� 100���� ����Ͻÿ�
 * 1�ٴ� 10���� ����ϼ���
 * [������]
 * F S D L L W ... 
 * �� �߿��� A�� ����� ����Ͻÿ�
 * A�� ���� = 6;
 * */

public class ForTest_Random {

	public static void main(String[] args) {
		int r,i,count = 0;
		for(i=1; i<=100; i++) {
			r=(int)(Math.random()*26)+65;//65~90
			System.out.print((char)r+" ");
			if(r=='A')count++;
			if(i%10==0)System.out.println();//10���� ���� ���� 0���� �������� ���ٶ���.
		}
		System.out.println();
		System.out.println("A�� ���� : "+count);
		
		
		
	}

}
