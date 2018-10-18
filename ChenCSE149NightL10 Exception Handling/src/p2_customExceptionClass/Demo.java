package p2_customExceptionClass;

import java.util.Scanner;

public class Demo {

	private static double gpa;
	public static void main(String[] args)  {
		Student s1 = null;
		try {
			s1 = new Student("John", 3.5);
			s1.setGpa(4.5);
		} catch (InvalidGPAException e) {
			gpa = getNewGPA();
		}
		System.out.println(s1);
	}
	
	private static double getNewGPA() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a new GPA: ");
		gpa = kb.nextDouble();
	}

}
