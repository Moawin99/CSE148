package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.TextbookBag;

public class Utils {
	public static void restore() {
		restoreTextbookBag();
		restoreClassroomBag();
		restorePersonBag();
		restoreClassroomBag();
	}
	
//	public static void backup(TextbookBag textbookBag, ClassroomBag classroomBag, PersonBag personBag, CourseBag courseBag) {
//		backupTextbookBag(textbookBag);
//		backupClassroomBag();
//		backupPersonBag();
//		backupClassroomBag();
//	}

	private static void backupPersonBag() {
		// TODO Auto-generated method stub
		
	}

	private static void backupClassroomBag() {
		// TODO Auto-generated method stub
		
	}

	private static void backupTextbookBag(TextbookBag textbookBag) {
		try {
			FileOutputStream fos = new FileOutputStream("textbookBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(textbookBag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void restorePersonBag() {
		
	}

	private static void restoreClassroomBag() {
		
	}

	private static void restoreTextbookBag() {
		FileInputStream fis = null;
		File file = new File("textbookBag.dat");
		if (file.exists()) {
			try {
				fis = new FileInputStream("textbookBag.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				TextbookBag textbookBag = (TextbookBag) (ois.readObject());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

	}
}
