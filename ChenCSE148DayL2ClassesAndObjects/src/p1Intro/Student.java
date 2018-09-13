package p1Intro;

public class Student {
	//instance variables, fields, attributes
	// properties, data fields
	private String name;
	private String id;
	private int age;
	private double gpa;
	
	// static variable, class variable
	private static String schoolName = "SCCC";
	
	// final variable
	private final String ZIP_CODE   = "11774";
	
	//behavior, methods
	// instance methods
	// constructor
	public Student() {
		name = "John";
		id = "1111";
		age = 18;
		gpa = 4.0;
	}
	//overloaded constructors
	public Student(String name, String id, int age, double gpa) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gpa = gpa;
	}
	
	
	 public String getZIP() {
		return ZIP_CODE;
	}
	// two static methods
	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
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
	
	public String toString() {
		return "Name = " + name + ", "  + "Id = " + id +", "  
					+ "Age = " + age  +", "  + "GPA = " + gpa;
	}
}
