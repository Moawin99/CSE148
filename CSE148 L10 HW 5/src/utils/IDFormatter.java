package utils;

public class IDFormatter {
	
	public static String formatID(int idLength, String idNumber) {
		String id = idNumber;
		for (int i = idNumber.length(); i < idLength; i++) {
			id = "0" + id;
		}
		return id;
	}

}
