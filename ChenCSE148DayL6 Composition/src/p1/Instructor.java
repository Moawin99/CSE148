package p1;

public class Instructor {
	private String name;
	private String rank;
	private double salary;

	public Instructor(String name, String rank, double salary) {
		super();
		this.name = name;
		this.rank = rank;
		this.salary = salary;
	}
	
	public Instructor(Instructor i1) {
		this(i1.name, i1.rank, i1.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", rank=" + rank + ", salary=" + salary + "]";
	}

}
