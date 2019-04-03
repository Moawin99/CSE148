package defaultMethods;

public class Faculty extends Person implements Chargeable {
	private String name;
	private double salary;
	public Faculty(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public double chargeTuition() {
		return 0;
	}

	@Override
	public double chargeParking() {
		return 20.00;
	}

	@Override
	public double chargeActivities() {
		return 0;
	}
	
	
}
