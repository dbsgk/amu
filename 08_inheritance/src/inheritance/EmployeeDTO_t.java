package inheritance;

public class EmployeeDTO_t {
	private String name, position;
	private int basePay, benefit, salary;
	private double taxRate;

	public EmployeeDTO_t() {}
	public EmployeeDTO_t(String name, String position, int basePay, int benefit) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
	}

	public void calc() {
		if (basePay > 4000000) {
			taxRate = 0.03;
		} else if (basePay <= 2000000) {
			taxRate = 0.01;
		} else
			taxRate = 0.02;

		salary = (int) ((basePay + benefit) - ((basePay + benefit) * taxRate));
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

	public double getTaxRate() {
		return taxRate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	@Override
	public String toString() {
		return name+"\t"
				+position+"\t"
				+basePay+"\t"
				+benefit+"\t"
				+taxRate+"\t"
				+salary;
	}
}
