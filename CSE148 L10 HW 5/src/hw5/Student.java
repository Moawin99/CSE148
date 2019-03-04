package hw5;

public class Student extends Person {

	private Majors major;
	private double gpa;
	private MiniStudentCourseBag miniStudentCourseBag;

	public Student(String firstName, String lastName, Address address, Majors major, double gpa,
			MiniStudentCourseBag miniStudentCourseBag) {
		super(firstName, lastName, address);
		this.major = major;
		this.gpa = gpa;
		this.miniStudentCourseBag = miniStudentCourseBag;
	}

}
