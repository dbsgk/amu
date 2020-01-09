package constructor;

import java.text.DecimalFormat;

public class SalaryMain_t {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		SalaryDTO_t ar[] ={
			new SalaryDTO_t("ȫ�浿","����",5000000,200000),
			new SalaryDTO_t("���缮","����",3500000,150000),
			new SalaryDTO_t("�ڸ��","���",1800000,100000)};
		//��ü�迭�� �迭�̶� �̷��� ��ǥ(,)�� �� ������ �����ؼ� �̷��� ���������� �ִ�.
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
		for(SalaryDTO_t dto : ar) {
			dto.calc();
			System.out.println(dto.getName()
					+"\t"+dto.getPosition()
					+"\t"+df.format(dto.getBasePay())
					+"\t"+df.format(dto.getBenefit())
					+"\t"+dto.getTaxRate()
					+"\t"+df.format(dto.getTax())+"\t"+df.format(dto.getSalary()));
		}
		
		
	}//main
}//class
