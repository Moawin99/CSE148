package randomAccessWriteBinary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteLetters {

	public static void main(String[] args) throws IOException {
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "rw");
		for(int i = 0; i < letters.length; i++) {
			randomFile.writeChar(letters[i]);
		}
		randomFile.close();
		File file = new File("letters.dat");
		System.out.println("The file size is: " + file.length());
		System.out.println("Done writing file");
	}

}
