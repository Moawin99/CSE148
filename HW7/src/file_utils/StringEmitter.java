package file_utils;

public class StringEmitter {
	
	public static String emitFirstName(String fileName) {
		StringBag firstNameBag = new StringBag(fileName);
		return firstNameBag.emitString();
	}
	
	public static String emitLastName(String fileName) {
		StringBag lastNameBag = new StringBag(fileName);
		return lastNameBag.emitString();
	}

	public static String emitBookTitle(String fileName) {
		StringBag bookTitleBag = new StringBag(fileName);
		return bookTitleBag.emitString();
	}

	public static String emitBookIsbn(String fileName) {
		StringBag bookIsbnBag = new StringBag(fileName);
		return bookIsbnBag.emitString();
	}
	
	
}
