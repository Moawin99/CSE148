package read_binary;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		boolean endOfFile = false;
		int number;
		while(!endOfFile) {
			try {
				number = dis.readInt();
				System.out.print(number + ", ");
			} catch (EOFException e) {
				endOfFile = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nDone reading the file!");
	}

}
