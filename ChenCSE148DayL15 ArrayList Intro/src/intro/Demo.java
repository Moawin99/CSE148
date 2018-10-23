package intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(1); //autoboxing
		myList.add(3);
		myList.add(2);
		myList.add(0); //autoboxing
		myList.add(5);
		myList.add(-1);
		myList.set(0, 10);
		System.out.println(myList.contains(0));
		System.out.println(myList.size());
		System.out.println(myList.indexOf(0));
		Integer[] numbers =  (Integer[])(myList.toArray());
		System.out.println(Arrays.toString(numbers));
//		System.out.println(myList);
		
//		myList.add(3.0);
//		myList.add("Four");
//		System.out.println(myList.get(1)); //autounboxing
//		int i = myList.get(0);
//		int j = myList.get(1);
//		int m = myList.get(2);
//		String x = (String)myList.get(3);
//		String str = (String)myList.get(4);
	}

}
