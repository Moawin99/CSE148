package p1Inheritance;

public class Student extends Person{
	
	private double gpa;

	public Student(String name, String ssn, double gpa) {
		super(name, ssn);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", ssn=" + getSsn() + ", gpa=" + gpa + "]";
	}

}
