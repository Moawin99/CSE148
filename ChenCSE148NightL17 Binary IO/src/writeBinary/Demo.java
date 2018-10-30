package writeBinary;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		int[] numbers = {10032343, 203293, 31233, 4343434, 234345, 344556, 45547, 8343434, 234343, 67734};
		FileOutputStream fos = new FileOutputStream("numbers.dat");
		DataOutputStream dos = new DataOutputStream(fos); //a wrapper
//		dos.writeChar('a');
		
//		dos.writeDouble(1.5);
//		dos.writeBoolean(true);
//		dos.writeUTF("abc");
		for(int num : numbers) {
			dos.writeInt(num);
		}
		dos.close();
		
		System.out.println("Done writing the file.");
		System.out.println("The file size is: " + (new File("numbers.dat")).length());
	}

}
