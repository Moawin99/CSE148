package p3;

import java.util.Random;

public class Student extends Person {
	private Random rand = new Random();
	private Major major;
	private int numberOfCreditsTaking;

	public Student(Major major) {
		super();
		this.major = major;
		numberOfCreditsTaking = rand.nextInt(19-12+1) + 12;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + ", major=" + major + ", numberOfCreditsTaking="
				+ numberOfCreditsTaking;
	}
	
	

}
