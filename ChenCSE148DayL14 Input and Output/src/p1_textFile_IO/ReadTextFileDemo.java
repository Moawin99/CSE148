package p1_textFile_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("names.txt");
		Scanner in = new Scanner(inputFile);
		
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();
	}

}
