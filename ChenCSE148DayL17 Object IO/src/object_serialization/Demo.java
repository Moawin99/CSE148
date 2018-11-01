package object_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		Student s1 = new Student("Adam", "Male", "6311234567", 3.5);
		Student s2 = new Student("Bill", "Male", "1234567890", 3.0);
		Student s3 = new Student("Cathy", "Female", "6311234567", 3.1);
		Student s4 = new Student("Dave", "Male", "1234567890", 3.1);
		PersonBag theBag = new PersonBag(10);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.display();
		System.out.println(theBag.deleteStudentById("2"));
		theBag.display();
		
		System.out.println(Major.ENG);
		
//		Utilities.saveStudent(s1);		
//		Student s = Utilities.loadStudent();
//		System.out.println(s);
	}

}
