package for_while_dowhile;
/*�ּҰ����(Least Common Multiple)
1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ������ ����Ͻÿ�.
��, 1�ٿ� 7���� ����Ͻÿ�.
[������]
36 12 ...
2�� 3�� ����� ����  =
2�� 3�� ����� �� =
*/
public class ForTest_LCM {

	public static void main(String[] args) {
		int i,sum=0,count=0,random;
		//�߻��ϴ� ��� 2��3�� ��������� ����ϰ�
		//2�� 3�� ������̸� sum�� �ְ�
		//		=		count++;
		//for���� i�� 100���� �����ϱ� i%7==0�̸� syso
		
		for(i=1;i<=100;i++) {
			random = (int)(Math.random()*500)+1;
			if(random%2==0&&random%3==0) {//random%6==0
				System.out.print(String.format("%5d", random)+" ");//String.format���� �ڸ���5�� �༭ ���� ������.
				sum+=random;
				count++;
				if(count%7==0)System.out.println();
			}
		}//for
		System.out.println();
		System.out.println("2�� 3�� ����� ���� = "+count);
		System.out.println("2�� 3�� ����� �� = "+sum);
	}

}
