package Tasks;

import java.util.Scanner;

public class Account {
	// Data member
	private double balance;

	// Constructors
	public Account() {
		// Default constructor with no arguments
		this.balance = 0.0;
	}

	public Account(double initialBalance) {
		// Constructor with two arguments
		this.balance = initialBalance;
	}

	// Method to deposit the amount to the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. Updated balance: $" + balance);
		} else {
			System.out.println("Invalid deposit amount. Please enter a positive value.");
		}
	}

	// Method to withdraw the amount from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. Updated balance: $" + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}

	// Method to display the balance
	public void displayBalance() {
		System.out.println("Current Balance: $" + balance);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create an account with default constructor
		Account account = new Account();

		// Get initial balance from the user
		System.out.print("Enter initial balance for the account: $");
		double initialBalance = scanner.nextDouble();
		account = new Account(initialBalance);

		// Deposit and withdraw operations
		System.out.print("Enter the amount to deposit: $");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);

		System.out.print("Enter the amount to withdraw: $");
		double withdrawAmount = scanner.nextDouble();
		account.withdraw(withdrawAmount);

		// Display the final balance
		account.displayBalance();
	}
}
