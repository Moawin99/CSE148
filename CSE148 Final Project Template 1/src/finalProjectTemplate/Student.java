package finalProjectTemplate;

public class Student extends Person {
	
	private double gpa;

	public Student(String name, int id, double gpa) {
		super(name, id);
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
		return "Student [Name=" + getName()
				+ ", Id=" + getId() + ", gpa=" + gpa + "]";
	}
}
