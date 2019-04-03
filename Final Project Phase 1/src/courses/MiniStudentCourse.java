package courses;

public class MiniStudentCourse {
	private String courseNumber;
	private double credits;
	private LetterGrade letterGrade;
	private Status status;

	public MiniStudentCourse(String courseNumber, double credits, LetterGrade letterGrade, Status status) {
		super();
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.letterGrade = letterGrade;
		this.status = status;
	}
	
	public MiniStudentCourse(CourseBag courseBag, LetterGrade letterGrade, Status status) {
		super();
		Course course = courseBag.emitCourse();
		this.courseNumber = course.getCourseNumber();
		this.credits = course.getCredits();
		this.letterGrade = letterGrade;
		this.status = status;
	}

}
