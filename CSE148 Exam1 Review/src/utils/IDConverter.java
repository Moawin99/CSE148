package utils;

public class IDConverter {
	
	public static String convertId(int idLength, String rawId) {
		String id = rawId;
		for (int i = rawId.length(); i < idLength; i++) {
			id = "0" + id;
		}
		return id;
	}

}
