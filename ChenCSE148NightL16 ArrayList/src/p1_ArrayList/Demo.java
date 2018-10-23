package p1_ArrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Character> myList = new ArrayList<>();
		
		
//		ArrayList<Integer> myList = new ArrayList<>(1000); // Generic
//		for(int i = 0; i < 1000000; i++) {
//			myList.add(i);
//		}
		
//		Object[] o = new Object[10];
//		myList.add(1); // myList.add(new Integer(1));  autoboxing
//		myList.set(0, 10);
//		myList.add(2);
//		myList.add(3);
//		myList.add(4);
		
//		myList.add(2.5);
//		myList.add("Forty");
//		int i = myList.get(0); // auto unboxing
//		
//		Integer m = myList.get(1);
		System.out.println(myList);
		System.out.println(myList.contains(0));
		
		
		
		
		/* array review
		 * 1. An array requires the same data type either primitive or reference
		 * 2. The array length needs to be known when the array is created
		 * 3. slow in deletion and insertion
		 */
		
//		int[] numbers = new int[10];
//		for(int i = 0; i < 5; i++) {
//			numbers[i] = i;
//		}
//		System.out.println(Arrays.toString(numbers));
		
		
//		String[] names = new String[5];
//		double[] realNumbers = new double[10000];
//		realNumbers[1000] = 2.5;
//		System.out.println(realNumbers[1000]);
		
	}

}
