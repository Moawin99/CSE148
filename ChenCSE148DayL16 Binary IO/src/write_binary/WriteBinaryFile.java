package write_binary;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {

	public static void main(String[] args) throws IOException {
		int[] numbers = { 1232434, 2, 3, 402343, 5, 6, 7 };
		
		FileOutputStream fos = new FileOutputStream("numbers.dat");
		DataOutputStream dos = new DataOutputStream(fos); // a wrapper
		for(int num : numbers) {
			dos.writeInt(num);
		}
		dos.close();
		System.out.println("File is written.");
		File file = new File("numbers.dat");
		System.out.println("The file size is: " + file.length());
	}

}
