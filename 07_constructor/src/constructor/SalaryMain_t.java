package constructor;

import java.text.DecimalFormat;

public class SalaryMain_t {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		SalaryDTO_t ar[] ={
			new SalaryDTO_t("홍길동","부장",5000000,200000),
			new SalaryDTO_t("유재석","과장",3500000,150000),
			new SalaryDTO_t("박명수","사원",1800000,100000)};
		//객체배열도 배열이라 이렇게 쉼표(,)로 각 데이터 구분해서 이렇게 때려넣을수 있다.
		System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월급");
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
