package abstract_methods;

public class Student extends Person implements Chargeable {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public double chargeTuition() {
		return 4000.00;
	}

	@Override
	public double chargeParking() {
		return 10.00;
	}

	@Override
	public double chargeActivities() {
		return 50.00;
	}

	public double chargeFood() {
		return 200.00;
	}
}
