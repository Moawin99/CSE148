package courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseImporter {
	
	private CourseBag courseBag;
	private String courseFileName;
	private Scanner scanner;
	
	public CourseImporter(CourseBag courseBag, String courseFileName) {
		this.courseBag = courseBag;
		this.courseFileName = courseFileName;
	}
	
	public void importData() throws FileNotFoundException {
		File file = new File("import_data/"+ courseFileName);
		scanner = new Scanner(file);
		
			while (scanner.hasNextLine()) {
				String numberStr = scanner.nextLine();
				String titleStr = scanner.nextLine();
				String description = scanner.nextLine();
				String creditStr = scanner.nextLine();
				scanner.nextLine();
				Course course = new Course(numberStr, titleStr, description, Double.parseDouble(creditStr));
				courseBag.insert(course);
//				System.out.println(course);
				
			}
		scanner.close();
	}

}
