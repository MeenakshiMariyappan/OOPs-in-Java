package EmployeeApp;

public class Employee extends Human {
    private int employeeID;
    private double salary;
 
    // Constructor using super keyword to initialize Human attributes
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
 
    // Method to display employee information
    public void displayEmployeeInfo() {
        super.displayHumanInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}