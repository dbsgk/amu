package day02;
//1~100������ �Ҽ��� ����ϴ� ���α׷�
//�Ҽ���? 1�� �ڱ� �ڽ� �ܿ��� ����� ���� ����
//�Ҽ�=����� ������ 2���μ���
//���= �������� 0�μ���
public class Ex04 {
	public static void main(String[] args) {
		Ex03.main(args);//static ����. static�پ������� �ٸ� �޼ҵ忡���� �󸶵��� �ҷ��� �� �� ����
		for(int i=1;i<=100;i++) {
			//i�� ������� �ƴ��� �˻���� ���ڰ� �ȴ�.
			int count = 0;//����� ������ ������ ����.
			for(int j=1; j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+"�� �Ҽ��Դϴ�.");
			}
		}
	}
}
