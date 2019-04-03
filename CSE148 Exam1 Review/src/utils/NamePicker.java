package utils;

import java.util.Random;

public class NamePicker {
	private static Random rand = new Random();
	private static String firstNameStr = "Emma	Olivia	Ava	Isabella	Sophia	Mia	Charlotte	Amelia	 Evelyn	Abigail	Harper	Emily	Elizabeth	Avery	Sofia	Ella	Madison	Scarlett	Victoria	Aria	Grace";
	private static String lastNameStr = "Joyce																				\n" + 
			"Kirkpatrick\n" + 
			"Zhang\n" + 
			"Hudson																				\n" + 
			"Simpson																				\n" + 
			"Cannon																				\n" + 
			"Silva																				\n" + 
			"Sweeney																				\n" + 
			"Cochran																				\n" + 
			"Ellwood																				\n" + 
			"Henderson																				\n" + 
			"Mcmillan																				\n" + 
			"Craft																				\n" + 
			"Stokes																				\n" + 
			"Jimenez																				\n" + 
			"Hale																				\n" + 
			"Alfaro																				\n" + 
			"Mitchell																				\n" + 
			"Merritt																				\n" + 
			"Fuentes																				\n" + 
			"Harvey																				\n" + 
			"Chase																				\n" + 
			"Sharples																				\n" + 
			"Chandler																				\n" + 
			"Adamson																				\n" + 
			"Hopper																				\n" + 
			"Robbins																				\n" + 
			"Joseph																				\n" + 
			"Santana																				\n" + 
			"Wickens";
	
	private static String[] firstNames = firstNameStr.split("\t");
	private static String[] lastNames = lastNameStr.split("\n");
	
	public static String pickFirstName() {
		String firstName = firstNames[rand.nextInt(firstNames.length)];
		return firstName.trim();
	}

	public static String pickLastName() {
		String lastName = lastNames[rand.nextInt(lastNames.length)];
		return lastName.trim();
	}
}
