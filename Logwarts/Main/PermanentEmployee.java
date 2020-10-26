package main;

public class PermanentEmployee extends Employee {

	private int bonusSalary;

	public PermanentEmployee(String name, String address, String gender, String position, int salary, int bonusSalary) {
		super(name, address, gender, position, salary);
		this.bonusSalary = bonusSalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateTotalSalary() {
		return super.calculateTotalSalary() + bonusSalary;
	}

	public int getBonusSalary() {
		return bonusSalary;
	}

	public void setBonusSalary(int bonusSalary) {
		this.bonusSalary = bonusSalary;
	}

}
