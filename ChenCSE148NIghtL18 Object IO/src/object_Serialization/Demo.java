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
		Student s3 = new Student(s1.getName(), s2.getGpa());
		Student[] arr = { s1, s2, s3 };
		Utilities.saveStudentArray(arr);
		Utilities.saveStudentArrayAs("myFile.dat", arr);
		System.out.println("Done saving!");
		Student[] myArray = Utilities.loadStudentArray();
		System.out.println(Arrays.toString(myArray));

		
		
		

	}

}
