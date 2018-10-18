package p1_textFile_IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextFileDemo {

	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		FileWriter fw = new FileWriter("names.txt", true);
		PrintWriter outputFile = new PrintWriter(fw);
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter name number " + (i+1) + ": ");
			outputFile.println(kb.nextLine());
		}
//		int n = 100;
//		outputFile.print(String.valueOf(n));
//		outputFile.write(65);
		outputFile.close();
	}

}
