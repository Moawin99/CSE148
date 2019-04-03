package textFile_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("students.txt", true);
		PrintWriter output = new PrintWriter(fw);
		String firstName = Utils.emitFirstName();
		String lastName = Utils.emitLastName();
		output.print(firstName + "\t");
		output.print(lastName + "\t");
		output.close();

		// -------------------
		File file = new File("numbers.txt");
		Scanner input = new Scanner(file);
		try {
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());
			System.out.println(input.nextLine());

		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("No such line to read!");
		}
		System.out.println("The end of the program");
	}

}
