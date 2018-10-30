package readBinary;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		boolean endOfFile = false;
		
		while(!endOfFile) {
			try {
				int number = dis.readInt();
				System.out.print(number + " ");
			} catch (IOException e) {
				endOfFile = true;
			}
		}
		
		dis.close();
		System.out.println("\nDone reading!");
	}

}
