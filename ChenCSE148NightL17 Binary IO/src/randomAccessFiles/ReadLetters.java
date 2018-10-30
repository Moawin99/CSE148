package randomAccessFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadLetters {

	public static void main(String[] args) throws IOException {
		final int CHAR_SIZE = 2;
		long byteNumber;
		char ch;
		// a b c d e f
		RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "r");
		ch = randomFile.readChar();
		System.out.println(ch);
		byteNumber = CHAR_SIZE * 1;
		randomFile.seek(byteNumber);
		System.out.println(randomFile.readChar());
	}

}
