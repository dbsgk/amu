package day02;
//�ζǹ�ȣ ���۱� 1��
//�迭�� ����� �������� ���
import java.util.Random;
public class Ex07 {
	private final static int SIZE = 6;
	private final static int MAX = 45;//�ζǹ�ȣ, �׳� ���ڷ� �Է��ϸ� ���߿� ���� �����Ҷ� ������ �����ؾ���.
	public static void main(String[] args) {
		//RandomŬ������ ���� ������ �Ҷ� ���� Ŭ�����̴�.
		//���������� 0~1������ ������ �Ǽ����� �ְ�
		//�� �Ǽ��� �ϳ��� �̾Ƽ� �����༭ ���ϴ� int�� double�� ������ְ� �ȴ�.
		Random r = new Random();
		//System.out.println(r.nextInt(45)+1);//0~44���� �����ϱ� +1����
		int[] lottoNumbers = new int[SIZE];
		for(int i = 0; i< lottoNumbers.length; i++) {
			lottoNumbers[i] = r.nextInt(MAX)+1;
			//lottoNumbers[i] = r.nextInt(45)+1;
		}
		
		
		//���� for loop �Ẹ��
		//for loop�� ��� �迭�̳� arrayList���� ���� ������Ÿ���� ���ִ�
		//������ ����� �� �ϳ��ϳ��� ��Ҹ� �����ؼ� ����ϴ� ����� �ִ�.
		System.out.println("--�ߺ�������--------");
		for(int i: lottoNumbers) {
			System.out.println(i);
		}
		
		//�ߺ����Ÿ� ���� 2�� for loop�� �����̴�.
		//i��° ��Ҹ� �������� �ؼ� j��° ��Ұ� ������ �񱳸� �ϰ�
		//������ i��° ��Ҹ� �ٽ� ���������ؼ� �־��ش�.
		//�ְ� ������ j�� 0���� ����������.
		
		for(int i =0; i< lottoNumbers.length; i++) {
			for(int j =0;j<lottoNumbers.length;j++) {
				if(lottoNumbers[i] == lottoNumbers[j] && i != j ) {
					System.out.println(i+"��°�� �ߺ��Դϴ�!");
					lottoNumbers[i] = r.nextInt(MAX)+1;
					j =-1;
				}
			}
			
		}
		System.out.println("---�ߺ�������---------");
		for(int i: lottoNumbers) {
			System.out.println(i);
		}
		//���α׷��� ���� �ְ���� �� �ӽ������� ���� �ʿ��ϴ�.
		/*int a=3;
		int b=5;
		int temp = a;
		int b= temp;*/
		for(int i=0; i<lottoNumbers.length-1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1]=temp;
				i=-1;
			}
		}
		System.out.println("---������----");
		for(int i : lottoNumbers) {
			System.out.println(i);
		}
		
	}
	
}
