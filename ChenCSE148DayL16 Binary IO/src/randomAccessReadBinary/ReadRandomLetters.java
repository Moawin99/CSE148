package randomAccessReadBinary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomLetters {

	public static void main(String[] args) throws IOException {
		final int CHAR_SIZE = 2;
		long byteNumber;
		char ch;
		RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "r");
		byteNumber = CHAR_SIZE * 1;
		randomFile.seek(byteNumber);
		ch = randomFile.readChar();
		System.out.println(ch);
		
	}

}
