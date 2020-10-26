package main;

public class Employee {

	private String name, address, gender, position;
	private int salary;

	public Employee(String name, String address, String gender, String position, int salary) {
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}

	public int calculateTotalSalary() {
		if (position.equals("Teacher")) {
			return (int) (salary + (salary * 0.2));
		} else if (position.equals("Staff")) {
			return (int) (salary + (salary * 0.15));
		} else {
			return salary;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
