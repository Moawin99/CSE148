package model;

import java.io.Serializable;

public class Faculty extends Person implements Serializable{
	private double salary;

	public Faculty(String name, double salary) {
		super(name);
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
		return super.toString() + ", salary=" + salary;
	}
	
	
}
