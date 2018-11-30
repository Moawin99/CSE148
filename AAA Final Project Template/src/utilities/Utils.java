package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.ClassroomBag;
import model.College;
import model.CourseBag;
import model.PersonBag;
import model.TextbookBag;

public class Utils {
	public static void load(College college) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("binaryData/allBag.dat");
		ObjectInputStream oos = new ObjectInputStream(fis);
		PersonBag personBag = college.getPersonBag();
		personBag = (PersonBag) (oos.readObject());
		ClassroomBag classroomBag = college.getClassroomBag();
		classroomBag = (ClassroomBag) (oos.readObject());
		TextbookBag textbookBag = college.getTextbookBag();
		textbookBag = (TextbookBag) (oos.readObject());
		CourseBag courseBag = college.getCourseBag();
		courseBag = (CourseBag) (oos.readObject());
		oos.close();
	}
}
