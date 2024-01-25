package EmployeeApp;

public class Human {
	// Attributes
	protected String name;
	protected int age;

	// Constructor
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display human information
	public void displayHumanInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}