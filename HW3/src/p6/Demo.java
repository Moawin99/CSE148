package p6;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		Person p = new Person("John", 20);
//		System.out.println(p);
		
		String[] names = {"Alan", "Bill", "Cathy", "David"};
//		System.out.println(Arrays.toString(names));
		System.out.println(formatNames(names));
	}

	private static String formatNames(String[] names) {
		String nameString = "\t";
		for(String name : names) {
			nameString += name + ";\n\t";
		}
		return nameString;
	}
	
	

}
