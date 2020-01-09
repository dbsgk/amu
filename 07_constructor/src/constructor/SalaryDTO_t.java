package constructor;

public class SalaryDTO_t {
	private String name;//�̸�
	private String position;//����
	private int basePay;//�⺻��
	private int benefit;//����
	private int salary;//����
	private int tax;//����
	public double taxRate;//����
	public SalaryDTO_t(String name, String position, int basePay, int benefit) {
		this.name =name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
		
	}
	public SalaryDTO_t() {}
	public void calc() {//����,����,���� ���
		int total =basePay+benefit;
		
		if((basePay+benefit)<=2000000) taxRate=0.01;
		else if((basePay+benefit)<=4000000) taxRate=0.02;
		else if((basePay+benefit)>4000000)taxRate=0.03;
		
		tax = (int)((basePay+benefit)*taxRate);
		salary= (basePay+benefit)-tax;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public int getBasePay() {
		return basePay;
	}
	public int getBenefit() {
		return benefit;
	}
	public int getSalary() {
		return salary;
	}
	public int getTax() {
		return tax;
	}
	public double getTaxRate() {
		return taxRate;
	}
	
}
