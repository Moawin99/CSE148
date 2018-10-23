package p1_text_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student> myList = new ArrayList<>();
		
		File file = new File("outputData/names.txt");
		System.out.println(file.length());
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			String[] tokens = str.split("[,]"); // regular expression
			System.out.println("The tokens are like this: " + Arrays.toString(tokens));
			Student s = new Student(tokens[0], Double.parseDouble(tokens[1]));
			myList.add(s);
		}
		in.close();
		System.out.println(myList);
	}

}
