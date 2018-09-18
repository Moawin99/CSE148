package p1;

public class Student {
	private String name;
	private String id;
	private double gpa;
	
	private static int idNumber = 1;
	
	// overloaded constructors
	public Student(String name, double gpa) {
		this.name = name;
		this.id = String.valueOf(idNumber++);
		this.gpa = gpa;
	}
	
	public Student(Student s) {
		this.name = s.getName();
		this.gpa = s.getGpa();
		this.id = String.valueOf(idNumber++);
	}
	
//	public Student(Student s) {
//		this(s.name, s.id, s.gpa);
//	}

	// no-arg constructor
	public Student() {
	}
	
	public static Student shallowCopy(Student s) {
		return s;
	}
	
	public static Student deepCopy(Student s) {
		Student sCopy = new Student(s.name, s.gpa);
		sCopy.setId(String.valueOf(--idNumber));
		idNumber++;
		return sCopy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	
}
