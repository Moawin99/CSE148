package TextFileSampleCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <Student> myList = new ArrayList<>();
		Scanner input = new Scanner(new File("names.txt"));
		input.nextLine();
		while(input.hasNextLine()) {
			String data = input.nextLine();
			String[] tokens = data.split(" ");
			Student s = new Student(tokens[0], Double.parseDouble(tokens[1]));
			myList.add(s);
		}
		
		input.close();
		System.out.println(myList);
		
	}

}
