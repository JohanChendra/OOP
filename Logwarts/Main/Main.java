package main;

import java.util.Scanner;

public class Main {

	// Johan Chendra
	// 2201731945

	Scanner scan = new Scanner(System.in);
	Employee employee;
	PermanentEmployee permanentEmployee;

	private String name, address, gender, position;
	private int salary, bonusSalary;

	public Main() {
		int choose = 0;
		do {
			showMenu();
			choose = scan.nextInt();
			scan.nextLine();
			switch (choose) {
			case 1: {
				insertEmployee();
				showEmployee();
				break;
			}

			case 2: {
				insertPermanentEmployee();
				showPermanentEmployee();
				break;
			}
			}
		} while (choose != 3);
	}

	private void showMenu() {
		System.out.println("Logwarts School");
		System.out.println("===============");
		System.out.println("1. Insert Employee");
		System.out.println("2. Insert Permanent Employee");
		System.out.println("3. Exit");
		System.out.print(">>");
	}

	private void showPermanentEmployee() {
		System.out.println("Insert Permanent Employee Success !!");
		System.out.println("Name : " + permanentEmployee.getName());
		System.out.println("Address : " + permanentEmployee.getAddress());
		System.out.println("Gender : " + permanentEmployee.getGender());
		System.out.println("Position : " + permanentEmployee.getPosition());
		System.out.println("Total Salary : " + permanentEmployee.calculateTotalSalary());
		System.out.println("Bonus Salary : " + permanentEmployee.getBonusSalary());
		cls();
	}

	private void showEmployee() {
		System.out.println("Insert Employee Success !!");
		System.out.println("Name : " + employee.getName());
		System.out.println("Address : " + employee.getAddress());
		System.out.println("Gender : " + employee.getGender());
		System.out.println("Position : " + employee.getPosition());
		System.out.println("Total Salary : " + employee.calculateTotalSalary());
		cls();
	}

	private void insertPermanentEmployee() {
		do {
			System.out.print("Employee Name : ");
			name = scan.nextLine();
		} while (!name.startsWith("Mr.") && !name.startsWith("Mrs."));
		do {
			System.out.print("Employee Address [Must end with 'Street'] : ");
			address = scan.nextLine();
		} while (!address.endsWith("Street"));
		do {
			System.out.print("Employee Gender [Male | Female] :");
			gender = scan.nextLine();
		} while (!gender.equals("Male") && !gender.equals("Female"));
		do {
			System.out.print("Employee Position [Teacher | Staff | Office boy] :");
			position = scan.nextLine();
		} while (!position.equals("Teacher") && !position.equals("Staff") && !position.equals("Office boy"));
		do {
			System.out.print("Employee Salary [Minimum Salary = 4000000] :");
			salary = scan.nextInt();
			scan.nextLine();
		} while (salary < 4000000);
		do {
			System.out.print("Bonus Salary [Must be greater than 50000] :");
			bonusSalary = scan.nextInt();
			scan.nextLine();
		} while (bonusSalary < 50000);
		permanentEmployee = new PermanentEmployee(name, address, gender, position, salary, bonusSalary);
		cls();
	}

	private void insertEmployee() {
		do {
			System.out.print("Employee Name : ");
			name = scan.nextLine();
		} while (!name.startsWith("Mr.") && !name.startsWith("Mrs."));
		do {
			System.out.print("Employee Address [Must end with 'Street'] : ");
			address = scan.nextLine();
		} while (!address.endsWith("Street"));
		do {
			System.out.print("Employee Gender [Male | Female] :");
			gender = scan.nextLine();
		} while (!gender.equals("Male") && !gender.equals("Female"));
		do {
			System.out.print("Employee Position [Teacher | Staff | Office boy] :");
			position = scan.nextLine();
		} while (!position.equals("Teacher") && !position.equals("Staff") && !position.equals("Office boy"));
		do {
			System.out.print("Employee Salary [Minimum Salary = 4000000] :");
			salary = scan.nextInt();
			scan.nextLine();
		} while (salary < 4000000);
		employee = new Employee(name, address, gender, position, salary);
		cls();
	}

	public void cls() {
		for (int i = 0; i < 5; i++) {
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		new Main();
	}

	

}
