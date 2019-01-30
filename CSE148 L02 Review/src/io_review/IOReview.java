package io_review;

import java.util.Scanner;

public class IOReview {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter two names: ");
		String name = kb.nextLine();
		String[] names = name.split("[,. ;]"); // regular expression
		System.out.println("Name 1 is: " + names[0]); // output
		System.out.println("Name 2 is: " + names[1]);
		System.out.println("Name 3 is: " + names[2]);
	}

}
