package interface_Comparable;

public class Faculty {
	private String name;
	private int salary;

	public Faculty(String name, int salary) throws MyCustomException {
		super();
		this.name = name;
		if(salary < 0) {
			throw new MyCustomException("Salary cannot be negative");
		}
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", salary=" + salary + "]";
	}

}
