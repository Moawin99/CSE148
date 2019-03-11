package toll_booth_utils;

import java.util.Random;

public class TollUtils {
	static Random rand = new Random();

	private final static String[] MAKES = { "Acura", "BMW", "Chevy", "Dodge", "Ford", "GMC", "Honda", "Isuza", "Jeep",
			"Kia", "Land Rover" };
	private final static String[] COLORS = { "White", "Black", "Red", "Blue", "Green", "Gray", "Purple", "Silver",
			"Beige", "Brown" };

	public static String pickMake() {
		return MAKES[rand.nextInt(MAKES.length)];
	}

	public static String pickYear() {
		return String.valueOf(rand.nextInt(2019 - 1950 + 1) + 1950);
	}

//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(pickMake());
//			System.out.println(pickYear());
//			System.out.println(pickColor());
//			System.out.println(makeVin());
//			System.out.println(makeLicensePlate());
//
//		}
//	}

	public static String pickColor() {
		return COLORS[rand.nextInt(COLORS.length)];
	}

	public static String makeVin() {
		String vin = "";
		int randomNumber;
		char letter;
		char digit;
		for (int i = 0; i < 17; i++) {
			randomNumber = rand.nextInt(37);
			if (randomNumber <37 / 2) {
				letter = (char) (rand.nextInt(90 - 65 + 1) + 65);
				vin += letter;
			} else {
				digit = (char) (rand.nextInt(57 - 48 + 1) + 48);
				vin += digit;
			}
		}
		return vin;
	}

	public static String makeLicensePlate() {
		String licensePlate = "";
		int randomNumber;
		char lowercaseLetter;
		char uppercaseLetter;
		char digit;
		for (int i = 0; i < 3; i++) {
			randomNumber = rand.nextInt(52);
			if (randomNumber < 52 / 2) {
				lowercaseLetter = (char) (rand.nextInt(122 - 97 + 1) + 97);
				licensePlate += lowercaseLetter;
			} else {
				uppercaseLetter = (char) (rand.nextInt(90 - 65 + 1) + 65);
				licensePlate += uppercaseLetter;
			}
		}
		for (int i = 0; i < 4; i++) {
			digit = (char) (rand.nextInt(57 - 48 + 1) + 48);
			licensePlate += digit;
		}
		return licensePlate;
	}
}
