package instance;
//and ������
public class CompTest2 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1 +=10)<0 && (num2+=10)>0);
		//num1�� ����� false �̹Ƿ� �ڿ� ������ �������� �ʴ´�. ���� num2=0
		//���� &&�����ڰ� �ƴ� &�����ڸ� ����ߴٸ� num2=10; &�����ڴ� �տ��� ����� ���͵� ������ ������ �����ϱ� ����.
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2);
		System.out.println();
		
		result = ((num1+=10)>0)|| ((num2+=10)>0);
		//�Ʊ�� ���������� num1�� ���길���� ����� ���ͼ� �ڿ� ������ �������� �ʴ´�. ���� num2=0
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2);//num1=20, num2=0

	}

}
