package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };

		try {
			FileOutputStream fos = new FileOutputStream("numbers.dat");
			DataOutputStream dos = new DataOutputStream(fos); // wrapper class
			for (int i = 0; i < numbers.length; i++) {
				dos.writeInt(numbers[i]);
			}
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("numbers.dat");
			DataInputStream dis = new DataInputStream(fis);
			boolean endOfFile = false;
			while (!endOfFile) {
				try {
					System.out.println(dis.readInt());
				} catch (EOFException e) {
					endOfFile = true;
					dis.close();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
