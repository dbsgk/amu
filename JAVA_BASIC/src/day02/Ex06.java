package day02;
//�迭�̶�
//�Ȱ��� ������Ÿ���� ������ѳ��� ������ ����
public class Ex06 {
	private final static int SIZE = 5;
	public static void main(String[] args) {
		//�迭 �����ϱ�
		//������Ÿ��[] �迭�̸� = new ������Ÿ��[�迭ũ��];
		//�������� main�޼ҵ� �Ⱦ�. ������ �����ؼ�. ������ �ܼ� ����ؼ� main��.
		int[] arr= new int[SIZE];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[3]);
		for(int i=0; i<arr.length; i++) {
			//�迭�� �� ��Ҹ� �����Ҷ����� arr[����� �ε�����ȣ]�� �����ϰ� �ȴ�.
			//�ε��� ��ȣ�� 0���� �迭��ũ�� -1�����̴�.
			//�� ��Ҵ� �ϳ��� ������ ��޵ȴ�.
			//�������̳�, arr[0]�� arr[0]�̶� �̸��� ��Ʈ����ó�� ��밡���ϴ�.
			System.out.println(arr[i]);
		}
		
	}

}
