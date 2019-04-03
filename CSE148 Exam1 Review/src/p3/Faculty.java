package p3;

public class Faculty extends Person {
	private double salary;

	public Faculty(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty: " + super.toString() + ", salary=" + salary;
	}
	
	
}
