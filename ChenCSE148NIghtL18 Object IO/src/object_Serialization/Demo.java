package object_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1 = new Student("Adam", 3.5);
		Student s2 = new Student("Billy", 3.6);
		Student s3 = new Student("Cathy", 3.5);
		Student s4 = new Student("Dave", 3.6);
		Student s5 = new Student("Ellen", 3.5);
		Student s6 = new Student("Frankie", 3.6);
		Student s7 = new Student("Gary", 3.5);
		Student s8 = new Student("Hellen", 3.6);
//		Student[] arr = { s1, s2, s3 };
		
		PersonBag theBag = new PersonBag(10);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.insert(s5);
		theBag.insert(s6);
		theBag.insert(s7);
		theBag.insert(s8);
		
		theBag.display();
		System.out.println(theBag.deletePersonById("3"));
		System.out.println("\nBag content after deletion:");
		theBag.display();
		System.out.println(Major.BIO);
		
//		Utilities.saveStudentArray(arr);
//		Utilities.saveStudentArray("myFile.dat", arr);
//		System.out.println("Done saving!");
//		Student[] myArray = Utilities.loadStudentArray();
//		System.out.println(Arrays.toString(myArray));

		
		
		

	}

}
