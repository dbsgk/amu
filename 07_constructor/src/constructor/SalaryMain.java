package constructor;

/*
�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
��ü �迭�� �ۼ��Ͻÿ�
�����ڸ� ���ؼ� �����͸� �Է�
����� calc()
name, position, basePay, benefit, taxRate, tax, salary

���� = (�⺻�� + ����) * ����;
���� = �⺻�� + ���� - ����;

������ 200���� ���� : 1%(0.01), 
     400���� ���� : 2%(0.02), 
     400���� �ʰ� : 3%(0.03)���� �����Ѵ�.

[������]
�̸�		����		�⺻��		����		����		����		����
ȫ�浿		����		5000000		200000
���缮		����		3500000		150000
�ڸ��		���		1800000		100000

*/

public class SalaryMain {

	public static void main(String[] args) {
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
		
		SalaryDTO[] dto = new SalaryDTO[3];
		dto[0] = new SalaryDTO("ȫ�浿","����",5000000,200000);
		dto[1] = new SalaryDTO("���缮","����",3500000,150000);
		dto[2] = new SalaryDTO("�ڸ��","���",1800000,100000);

	}

}
