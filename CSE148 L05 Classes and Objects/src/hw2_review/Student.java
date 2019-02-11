package hw2_review;

public class Student {
	private String name;
	private double gpa;
	private static int id;

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void curveGpa(double curveAmount) {
		gpa += curveAmount;
	}
}
