package p5;

public class Faculty extends Person implements Billable {
	private double salary;

	public Faculty(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty: " + super.toString() + ", salary=" + salary;

	}

	public double bill() {
		return 0.01 * salary;
	}

}
