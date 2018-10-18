package p2_customExceptionClass;

import java.util.Scanner;

public class Demo {

	private static double gpa;

	public static void main(String[] args)  {
		Student s1 = null;

		try {
			s1 = new Student("John", 3.5);
		} catch (InvalidGPAException e) {
			e.printStackTrace();
		}
		try {
			s1.setGpa(4.5);
		} catch (InvalidGPAException e) {
			gpa = getNewGPA();
		}
		
		try {
			s1.setGpa(gpa);
		} catch (InvalidGPAException e) { // swallow the catch
		}
		
		System.out.println(s1);
	}

	private static double getNewGPA() {
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Enter a new GPA: ");
			gpa = kb.nextDouble();
		} while (gpa > 4.0 || gpa < 0.0);
		return gpa;
	}

}
