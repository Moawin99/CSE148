package p1;

import java.util.Random;
import java.util.Scanner;

public class NamesApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		NameWarehouse nameWarehouse = new NameWarehouse();
		nameWarehouse.buildBoysNameArray();
		nameWarehouse.buildGirlsNameArray();
		nameWarehouse.buildLastNameArray();

		do {
			System.out.println("Please enter a first name: ");
			String name = kb.nextLine();
			if (name.equalsIgnoreCase("Finished")) {
				System.out.println("Bye");
				return;
			}
			boolean boyFound = nameWarehouse.checkThroughBoysNames(name);
			boolean girlFound = nameWarehouse.checkThroughGirlsNames(name);

			if (!(boyFound || girlFound)) {
				System.out.println("The first name is not found");
			}
		} while (true);
	}

}
