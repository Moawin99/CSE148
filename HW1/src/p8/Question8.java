package p8;

import java.util.Scanner;

public class Question8 {

	private static double subtotal = 0.0;
	private static int count = 0;;
	private static String[] items = new String[20]; // how many times you may pick a menu item
	private static double[] price = new double[20]; // price for each pick
	private static int[] quants = new int[20]; // quantity of each pick

	public static void main(String[] args) {
		showMenu();
		pickItems();
		showCheck();	
	}
	
	public static void pickItems() {
		
		Scanner userInput = new Scanner(System.in);

		boolean flag = true;
		while (flag) {

			System.out.println("Choose an Item Number: ");

			int itemNumber = userInput.nextInt();

			switch (itemNumber) {
			case 1:
				items[count] = "Red Wine";
				price[count] = 6.00;
				break;
			case 2:
				items[count] = "Milk";
				price[count] = 2.50;
				break;
			case 3:
				items[count] = "Pasta";
				price[count] = 5.50;
				break;
			case 4:
				items[count] = "Bread";
				price[count] = 3.50;
				break;
			default:
				System.out.println("Item does not exist.");
			}

			System.out.println("Quantity of items:");
			quants[count] = userInput.nextInt();

			userInput.nextLine();

			System.out.println("Is this the end of the order? Y or N?");
			String response = userInput.nextLine();
			char r = response.charAt(0);
			if (r == 'Y' || r == 'y') {
				flag = false;
			}
			count++; // increase count by 1 for next pick
		}

	}

	public static void showIndividualItem(int itemNumber, String itemName, double itemPrice) {
		System.out.printf("%-5d\t\t%-20s%-10.2f\n", itemNumber, itemName, itemPrice);
	}
	
	public static void showMenu() {
		showHeader();
		String dottedLine = "-----------------------------------------"
;		System.out.printf("%5s\t\t%-20s%-10s\n", "Number", "Item", "Price");
		System.out.println(dottedLine);
		showIndividualItem(1, "Red Wine", 6.00);
		showIndividualItem(2, "Milk", 2.50);
		showIndividualItem(3, "Pasta", 5.50);
		showIndividualItem(4, "Bread", 3.50);
		System.out.println(dottedLine);
	}

	public static void showCheck() {
		showHeader();

		for (int i = 0; i < count; i++) { // count already completed by this point, need i to go back to 0
			System.out.printf("%2d%10s%5d%10.2f\n", (i + 1), items[i], quants[i], quants[i] * price[i]);
			subtotal += quants[i] * price[i];
		}

		double tax = subtotal * 0.0825;

		double total = tax + subtotal;

		System.out.printf("\t\t%10s%10.2f\n", "Subtotal:", subtotal);
		System.out.printf("\t\t%10s%10.2f\n", "Tax:", tax);
		System.out.printf("\t\t%10s%10.2f\n", "Total:", total);
	}

	public static void showHeader() {
		System.out.println("---------------------------------------------------");
		System.out.println("\t\tOliver Garden");
		System.out.println("\tThe Healthy Choice for Your Family");
		System.out.println("\t123 Main Street, Selden, NY 11784");
		System.out.println("\t\t(631) 123 - 4567");
		System.out.println();
		System.out.println("Server: Johnny\t\t\tTable 15");
		System.out.println();
	}
}

