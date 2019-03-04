package hw5;

public class Faculty extends Person {
	private Majors department;
	private String office;
	private MiniFacultyCourseBag miniFacultyCourseBag;

	public Faculty(String firstName, String lastName, Address address, Majors department, String office,
			MiniFacultyCourseBag miniFacultyCourseBag) {
		super(firstName, lastName, address);
		this.department = department;
		this.office = office;
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}

}
