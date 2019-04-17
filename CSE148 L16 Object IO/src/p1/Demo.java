package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("Adam");
		Person p2 = new Person("Bill");
		FileOutputStream fos = new FileOutputStream("persons.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
		FileInputStream fis = new FileInputStream("persons.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person person1 = (Person) ois.readObject();
		System.out.println(person1.getName());
//		System.out.println(p1);
		Person person2 = (Person) ois.readObject();
//		System.out.println(p2);
		ois.close();
		
	}

}
