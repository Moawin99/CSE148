import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentBag theBag = new StudentBag(20);
		File file = new File("students.txt");
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			String str = input.nextLine();
			String[] tokens = str.split(", ");
			Student s = new Student(tokens[0], tokens[1], tokens[2]);
			theBag.insert(s);
		}
		input.close();
//		theBag.display();
//		System.out.println(theBag.find("6"));
		FileOutputStream fos = new FileOutputStream("students.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(theBag);
		oos.close();
		System.out.println("Done saving!");
		
		FileInputStream fis = new FileInputStream("students.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentBag retrievedBag = (StudentBag)(ois.readObject());
		ois.close();
		System.out.println("Done retrieving! Now displaying: ");
		retrievedBag.display();
		
		
//	}
	}
}
