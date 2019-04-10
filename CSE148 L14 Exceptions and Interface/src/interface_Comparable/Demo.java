package interface_Comparable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args)  {
		Faculty f1 = null;
		Faculty f2 = null;
		Faculty f3 = null;
		try {
			f1 = new Faculty("Adam", 1500);
			f2 = new Faculty("Zack", -2000);
			f3 = new Faculty("Cathy", 3500);
		} catch (MyCustomException e1) {
			System.out.println(e1.getMessage());;
		}

		Faculty[] teachers = { f1, f2, f3 };
		try {
			Arrays.sort(teachers);
		} catch (ArrayIndexOutOfBoundsException el) {
			System.out.println("Hey, I caught an IOException");
//			el.printStackTrace();
		} catch (Exception e) {
			System.out.println("I give up!");
		}
		System.out.println("Here are the teachers: ");
		for (Faculty f : teachers) {
			System.out.println(f);
		}
	}

//		Student s1 = new Student("Zack", 10);
//		Student s2 = new Student("Bill", 9);
//		Student s3 = new Student("Cathy", 8);
//		Student[] students = {s1, s2, s3};
//		Arrays.sort(students);
//		for(Student s : students) {
//			System.out.println(s);
//		}
//		
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		Collections.sort(list);
//		System.out.println(list);
//		

//	}
//		int[] numbers = {2, 4, 1, 3, 5};
//		display(numbers);
//		Arrays.sort(numbers);
//		display(numbers);
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(4);
//		list.add(1);
//		list.add(3);
//		list.add(5);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//	}
//	
//	private static void display(int[] numbers) {
//		for(int n : numbers) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//	}

}
