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
		
		try {
			FileOutputStream fos = new FileOutputStream("Adam.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			System.out.println("Object is written.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// read from a binary file
		FileInputStream fis = new FileInputStream("Adam.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student) ois.readObject();
		System.out.println(s);
		ois.close();
	}

}
