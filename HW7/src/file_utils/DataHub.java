package file_utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataHub {

	private final static String FIRST_NAME_FILE = "inputData/FirstNames.txt";
	private final static String LAST_NAME_FILE = "inputData/LastNames.txt";
	private final static String BOOK_TITLE_FILE = "inputData/BookTitles.txt";
	private final static String BOOK_ISBN_FILE = "inputData/BookIsbns.txt";
	private static int idNumber = 0;

	private static String emit(Categories category) {
		switch (category) {
		case FIRST:
			return StringEmitter.emitFirstName(FIRST_NAME_FILE);
		case LAST:
			return StringEmitter.emitLastName(LAST_NAME_FILE);
		case BOOK_TITLE:
			return StringEmitter.emitBookTitle(BOOK_TITLE_FILE);
		case BOOK_ISBN:
			return StringEmitter.emitBookIsbn(BOOK_ISBN_FILE);
		case ID: return String.valueOf(idNumber++);
		default:
			return null;
		}
	}
	
	public static String spew(Categories ... categories) {
		String data = "";
		for (int i = 0; i < categories.length; i++) {
			data +=  emit(categories[i]) + ", ";
		}
			return data;
	}
	
	public static void exportData(int numberOfItems, String fileName) {
		PrintWriter pw = openFile(fileName);
		for(int i = 0; i < numberOfItems; i++) {
			pw.println(spew(Categories.FIRST, Categories.LAST, 
					Categories.BOOK_TITLE, Categories.BOOK_ISBN,
					Categories.ID));
		}
		pw.close();
	}
	
	private static PrintWriter openFile(String fileName) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			PrintWriter pw = new PrintWriter(fw);
			return pw;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
		
}
