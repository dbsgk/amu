package constructor;

/*
직원들의 월급을 계산하는 프로그램을 작성하시오
객체 배열로 작성하시오
생성자를 통해서 데이터를 입력
계산은 calc()
name, position, basePay, benefit, taxRate, tax, salary

세금 = (기본급 + 수당) * 세율;
월급 = 기본급 + 수당 - 세금;

세율은 200만원 이하 : 1%(0.01), 
     400만원 이하 : 2%(0.02), 
     400만원 초과 : 3%(0.03)으로 설정한다.

[실행결과]
이름		직급		기본급		수당		세율		세금		월급
홍길동		부장		5000000		200000
유재석		과장		3500000		150000
박명수		사원		1800000		100000

*/

public class SalaryMain {

	public static void main(String[] args) {
		System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월급");
		
		SalaryDTO[] dto = new SalaryDTO[3];
		dto[0] = new SalaryDTO("홍길동","부장",5000000,200000);
		dto[1] = new SalaryDTO("유재석","과장",3500000,150000);
		dto[2] = new SalaryDTO("박명수","사원",1800000,100000);

	}

}
