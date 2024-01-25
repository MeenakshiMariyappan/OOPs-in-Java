package ProductApp;

import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		// Accept five product information from the user and store in an array
		Product[] products = new Product[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details for Product " + (i + 1) + ":");
			System.out.print("Enter Product ID: ");
			int pid = scanner.nextInt();
			System.out.print("Enter Product Price: ");
			double price = scanner.nextDouble();
			System.out.print("Enter Product Quantity: ");
			int quantity = scanner.nextInt();

			products[i] = new Product(pid, price, quantity);
		}

		// Find Pid of the product with the highest price
		int highestPricePid = findHighestPriceProductPid(products);
		System.out.println("Product with the highest price has Pid: " + highestPricePid);

		// Calculate and display the total amount spent on all products
		double totalAmountSpent = calculateTotalAmountSpent(products);
		System.out.println("Total amount spent on all products: $" + totalAmountSpent);
	}

	// Method to find Pid of the product with the highest price
	private static int findHighestPriceProductPid(Product[] products) {
		double maxPrice = Double.MIN_VALUE;
		int highestPricePid = -1;

		for (Product product : products) {
			if (product.getPrice() > maxPrice) {
				maxPrice = product.getPrice();
				highestPricePid = product.getPid();
			}
		}

		return highestPricePid;
	}

	// Method to calculate and return the total amount spent on all products
	private static double calculateTotalAmountSpent(Product[] products) {
		double totalAmount = 0;

		for (Product product : products) {
			totalAmount += product.getPrice() * product.getQuantity();
		}

		return totalAmount;
	}
}
