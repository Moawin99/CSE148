package p1ClassesIntro;

public class Student {

	// fields, instance variables, properties
	// attributes. They describe the state of the object
	private String name;
	private int age;
	private String id;
	private double gpa;

	// behavior, methods
	
	public Student() {
		name = "John";
		id = "2222";
		age = 18;
		gpa = 2.0;
	}
	
	public Student(String name, String id, int age, double gpa) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gpa = gpa;
	}

	// setters

	public void setAll(String name, String id, int age, double gpa) {
		this.gpa = gpa;
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// getters

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name=" + name + ", " + "ID=" + id + ", " 
				+ "Age=" + age; // + ", " + "GPA=" + gpa;
	}

	public void driveToSchool() {
		System.out.println("Drive your car to school.");
	}

	public void takeTheBus() {
		System.out.println("Take the bus to school.");
	}
}
