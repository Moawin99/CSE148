package p2_customExceptionClass;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) throws InvalidGPAException {
		super();
		this.gpa = gpa;
		checkGPAValidity(gpa);
		this.name = name;

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

	public void setGpa(double gpa) throws InvalidGPAException {
		this.gpa = gpa;
		checkGPAValidity(gpa);

	}

	public void checkGPAValidity(double gpa) throws InvalidGPAException {
		if (gpa > 4.0 || gpa < 0.0) {
			throw new InvalidGPAException("Invalid GPA");
		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
