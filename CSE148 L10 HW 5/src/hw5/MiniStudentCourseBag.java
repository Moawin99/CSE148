package hw5;

public class MiniStudentCourseBag {
	private MiniStudentCourseInfo[] miniStudentCourseArray;
	private int nElems;
	
	public MiniStudentCourseBag(int maxSize) {
		miniStudentCourseArray = new MiniStudentCourseInfo[maxSize];
		nElems = 0;
	}
	
	public void insert(MiniStudentCourseInfo courseInfo) {
		miniStudentCourseArray[nElems++] = courseInfo;
	}
	
	public double getGPA() {
		return 0.0;
	}
	
	public MiniStudentCourseInfo[] getCoursesTaken() {
		return null;
	}
	
	
}
