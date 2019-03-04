package hw5;

public class MiniFacultyCourseBag {
	private MiniFacultyCourseInfo[] miniFacultyCourseInfoArray;
	private int nElems;
	
	public MiniFacultyCourseBag(int maxSize) {
		miniFacultyCourseInfoArray = new MiniFacultyCourseInfo[maxSize];
		nElems = 0;
	}

	public void insert(MiniFacultyCourseInfo  miniFacultyCourseInfo) {
		miniFacultyCourseInfoArray[nElems++] = miniFacultyCourseInfo;
	}
	
	public MiniFacultyCourseInfo[] getCoursesTaught() {
		return null;
	}
	
	public MiniFacultyCourseInfo[] getCoursesTeaching() {
		return null;
	}
}
