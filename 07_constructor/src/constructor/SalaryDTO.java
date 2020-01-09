package constructor;
//1인분용 데이터(setter로 데이터 받지말고 생성자로 받아. 다 생성자에 넣어놓고)
public class SalaryDTO {//DTO: Data Transfer Object
	private String name;//이름
	private String position;//직급
	private int basePay;//기본급
	private int benefit;//수당
	private int salary;//월급
	private int tax;//세금
	public double taxRate;//세율
	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name =name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
		calc(basePay, benefit);
		System.out.println(this.name+"\t"+this.position+"\t"+this.basePay+"\t"+this.benefit+"\t"+taxRate+"\t"+tax+"\t"+salary);
	}
	public void calc(int basePay, int benefit) {//세율,세금,월급 계산
		if((basePay+benefit)>4000000)taxRate=0.03;
		else if((basePay+benefit)<=4000000) taxRate=0.02;
		else if((basePay+benefit)<=2000000) taxRate=0.01;
		
		tax = (int)((basePay+benefit)*taxRate);
		salary= (basePay+benefit)-tax;
	}
	
	
}
