package class_1;
//�����ε�����

/*[����2]
arae(3) �� ȣ���Ͽ� ���� ����
area(5,7)�� ȣ���Ͽ� �ﰢ�� ����
area(2,3 5)�� ȣ���Ͽ� ��ٸ��� ���̸� ���Ͻÿ�

Ŭ������ : ShapeTest
�ʵ� : PI (3.141592)

[������]
���� ���� : 28.274337 // ���������� *3.14
�ﰢ���� ���� : 17.5	//�غ�*����/2
��ٸ����� ���� : 24.5 //(�Ʒ���+����)*����/2
*/

class ShapeTest{
	double PI = 3.141592;
	public double area(int a) {
		return a*a*PI;
	}
	public double area(int a,int b) {
		return (double)a*b/2;
	}
	public double area(int a, int b, int c) {
		return (double)(a+b)*c/2;
	}
	
}
public class Practice2 {

	public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		System.out.println("���� ���� : "+st.area(3));
		System.out.println("�ﰢ���� ���� : "+st.area(5,7));
		System.out.println("��ٸ����� ���� : "+st.area(2,3,5));
	}

}
