package defaultMethods;

public class Student extends Person {
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double chargeActivities() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}