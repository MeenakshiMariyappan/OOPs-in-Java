package EmployeeApp;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get user input for Human attributes
		System.out.print("Enter name: ");
		String humanName = scanner.nextLine();
		System.out.print("Enter age: ");
		int humanAge = scanner.nextInt();
		scanner.nextLine();

		// Get user input for Employee attributes
		System.out.print("Enter employee ID: ");
		int employeeID = scanner.nextInt();
		System.out.print("Enter salary: ");
		double salary = scanner.nextDouble();

		Employee employee = new Employee(humanName, humanAge, employeeID, salary);

		// Display employee information
		System.out.println("\nEmployee Information:");
		employee.displayEmployeeInfo();
	}
}
