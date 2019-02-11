package hw2_review;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("Enter a GPA: ");
		double gpa = kb.nextDouble();
		
//		kb.nextLine();
		
		System.out.println("Enter a name: ");
		String name = kb.next();
		
		
		s1.setName(name);
		s1.setGpa(gpa);
		System.out.println(s1.getName());
		System.out.println(s1.getGpa());
		
		System.out.println("Enter the curveAmount: ");
		double curveAmount = kb.nextDouble();
		
		s1.curveGpa(curveAmount);
		System.out.println(s1.getGpa());
	}

}
