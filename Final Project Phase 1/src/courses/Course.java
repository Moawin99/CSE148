package courses;

public class Course {
	private String courseNumber;
	private String courseTitle;
	private String courseDescription;
	private double credits;

	public Course(String courseNumber, String courseTitle, String courseDescription, double credits) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", courseDescription="
				+ courseDescription + ", credits=" + credits + "]";
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public double getCredits() {
		return credits;
	}

}
