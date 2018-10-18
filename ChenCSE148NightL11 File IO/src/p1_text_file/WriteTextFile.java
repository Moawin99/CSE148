package p1_text_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("outputData/names.txt", false);
		PrintWriter pw = new PrintWriter(fw);
		pw.print("\n");
		pw.close();
		
		File file = new File("outputData/names.txt");
		System.out.println(file.length());
	}

}
