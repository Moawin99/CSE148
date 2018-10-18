package p1_arrayIndexOutOfBounds;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		try {
			numbers[0] = 1;
			numbers[1] = 2;
			numbers[2] = 3;
			numbers[3] = 4;
			numbers[4] = 5;
			numbers[5] = 6;
			System.out.println("hi");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Caught an ArrayIndexOutOfBoundsException object");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Caught an Exception object");
		}
		System.out.println(Arrays.toString(numbers));
	}

}
