package Tasks;

import java.util.Scanner;

public class Person {
	// Properties
	private String name;
	private int age;

	// Default constructor with default age set to 18
	public Person() {
		this.age = 18;
	}

	// Parameterized constructor to initialize name and age
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display name and age of the person
	public void displayPersonInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating a person object using default constructor
		Person defaultPerson = new Person();
		System.out.println("Default Person:");
		defaultPerson.displayPersonInfo();
		System.out.println();
		// Creating a person object with user input
		System.out.print("Enter name for custom person: ");
		String customName = scanner.nextLine();
		System.out.print("Enter age for custom person: ");
		int customAge = scanner.nextInt();
		Person customPerson = new Person(customName, customAge);
		System.out.println("Custom Person:");
		customPerson.displayPersonInfo();
	}
}
