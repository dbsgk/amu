package Practice;
/*[����3] �ζ� 
ũ�Ⱑ 6���� ������ �迭�� ��Ƽ� 1~45������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
��, ���ڰ� �ߺ��Ǹ� �ȵȴ�

input() - ���� �߻�, �ߺ��� ���ڰ� ������ �ٽ� �߻�
output() - ���

*/
public class Practice3 {
	int ar[] = new int[6];

	public static void main(String[] args) {
		Practice3 p3 = new Practice3();
		p3.input();
		p3.output();
	}//main
	public void input() {
		//�����߻�, �ߺ����� ������ �ٽù߻�
		for(int i=0;i<6;i++) {
			ar[i] = (int)(Math.random()*45)+1;
		}//�����߻�
		for(int i=0;i<=4;i++) {//�ߺ�ó��
			for(int j=0;j<=5;j++) {
				if(ar[i]==ar[j]&& i!=j) {
					ar[i]=(int)(Math.random()*45)+1;
					j=-1;
				}
			}
		}//�ߺ�ó��
		
	}//input
	
	public void output() {
		System.out.print("�ζǹ�ȣ: ");
		for(int i: ar) {
			System.out.print(i+" ");
		}
	}//output
}
