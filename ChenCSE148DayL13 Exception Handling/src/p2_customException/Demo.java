package p2_customException;

import java.util.Scanner;

public class Demo {

	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws IllegalGPAException {

		Student s = new Student("John", 3.5);
		double gpa;
		do {
			gpa = getNewGPA();
		} while (gpa < 0.0 || gpa > 4.0);
		
		s.setGpa(gpa);
//		try {
//			s.setGpa(gpa);
//		} catch (IllegalGPAException e1) {
//		} // swallow catch
		
		System.out.println(s);
	}

	private static double getNewGPA() {
		System.out.println("Enter a new GPA value: ");
		return kb.nextDouble();
	}

}
