package p1Intro;

public class Student {
	
	//instance variables, fields, attributes
	// properties, data fields
	String name;
	String id;
	int age;
	double gpa;
	
	//behavior, methods
	public void setName(String name) { // newName is a local variable
		this.name = name; // be aware of the scope of variables
	}
	
	public void setId(String id) { // newName is a local variable
		this.id = id; // be aware of the scope of variables
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGpa() {
		return gpa;
	}
}
