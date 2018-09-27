package p6;

import java.util.Arrays;

public class Person {
	private String name;
	private int age;
	private int[] scores = { 1, 2, 3, 4, 5, 6 };

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + "]";
//	}
	
	private String formatString(int[] scores) {
		String str = "\t\t";
		for(int i : scores) {
			str += i + "\n\t\t";
		}
		return str;
	}

	@Override
	public String toString() {
		return name + ":\n\tage=" + age 
				+ "\n\tscores=\n" + formatString(scores);
	}

	
}
