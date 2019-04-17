package p1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LetterWriter {
	public static void main(String[] args) throws IOException {
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		RandomAccessFile randomAccessFile = new RandomAccessFile("letters.dat", "rw");
		for(int i = 0; i < letters.length; i++) {
			randomAccessFile.writeChar(letters[i]);
		}
		randomAccessFile.close();
		
		
		final int CHAR_SIZE = 2;
		long byteNum;
		char ch;
		RandomAccessFile randRead = new RandomAccessFile("letters.dat", "r");
		byteNum = CHAR_SIZE * 4;
		randRead.seek(byteNum);
		ch = randRead.readChar();
		System.out.println(ch);
		System.out.println();
		byteNum = CHAR_SIZE * 2;
		randRead.seek(1);
		ch = randRead.readChar();
		ch = randRead.readChar();
		System.out.println(ch);
		
	}
}
