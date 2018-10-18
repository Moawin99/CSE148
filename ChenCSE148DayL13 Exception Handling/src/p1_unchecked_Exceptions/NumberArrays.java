package p1_unchecked_Exceptions;

import java.util.Arrays;

public class NumberArrays {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		try {
			numbers[0] = 1;
			numbers[1] = 2;
			numbers[2] = 3;
			numbers[3] = 4;
			numbers[4] = 5;
			numbers[5] = 2;
			System.out.println("Line 16");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("hey the fifth index is not valid");
		}
		System.out.println(Arrays.toString(numbers));
//		
	}

}
