package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
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
//			for (int i = 0; i < numbers.length; i++) {
				dos.writeUTF("HH");
				dos.writeUTF("H");
//				dos.writeInt(numbers[i]);
				File file = new File("numbers.dat");
				System.out.println("The file size is: " + file.length());
//			}
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
					System.out.println(dis.readUTF());
//					System.out.println(dis.readInt());
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
