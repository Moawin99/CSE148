package finalProjectTemplate;

public class Faculty extends Person {
	
	private double salary;

	public Faculty(String name, int id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [ Name=" + getName()
				+ ", Id=" + getId() + "Salary=" + salary + "]";
	}
}
