package objects_and_classes;

public class Student {
	private String name;
	private String id;
	private double gpa;
	
	private static int idCounter = 0;

//	public Student(String name, String id, double gpa) {
//		this.name = name;
//		this.id = id;
//		this.gpa = gpa;
//	}

	public Student(String name, double gpa) {
//		idCounter++;
		id = String.valueOf(idCounter++);
		this.name = name;
		this.gpa = gpa;
	}

	public Student(String name) {
		id = String.valueOf(idCounter++);
		this.name = name;
	}

	public Student() { // no-arg
		id = String.valueOf(idCounter++);
	}
	
	public Student(Student student) {
		this.name = student.name;
		this.id = student.id;
		this.gpa = student.gpa;
	}
	
	public Student shallowCopy(Student student) {
		return student;
	}
	
	public Student deepCopy(Student student) {
		return new Student(student);
	}
	
	

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Student.idCounter = idCounter;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", ID=" + id + ", GPA=" + gpa;
	}
	
}
