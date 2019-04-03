package courses;

import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		CourseBag theBag = new CourseBag(10);
		CourseImporter importer = new CourseImporter(theBag, "courses.txt");
		importer.importData();
		System.out.println(theBag.emitCourse());
	}

}
