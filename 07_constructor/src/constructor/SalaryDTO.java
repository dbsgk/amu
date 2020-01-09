package constructor;
//1�κп� ������(setter�� ������ �������� �����ڷ� �޾�. �� �����ڿ� �־����)
public class SalaryDTO {//DTO: Data Transfer Object
	private String name;//�̸�
	private String position;//����
	private int basePay;//�⺻��
	private int benefit;//����
	private int salary;//����
	private int tax;//����
	public double taxRate;//����
	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name =name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
		calc(basePay, benefit);
		System.out.println(this.name+"\t"+this.position+"\t"+this.basePay+"\t"+this.benefit+"\t"+taxRate+"\t"+tax+"\t"+salary);
	}
	public void calc(int basePay, int benefit) {//����,����,���� ���
		if((basePay+benefit)>4000000)taxRate=0.03;
		else if((basePay+benefit)<=4000000) taxRate=0.02;
		else if((basePay+benefit)<=2000000) taxRate=0.01;
		
		tax = (int)((basePay+benefit)*taxRate);
		salary= (basePay+benefit)-tax;
	}
	
	
}
