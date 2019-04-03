package courses;

import java.util.Random;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;
	
	private Random rand = new Random();
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	public void insert(Course course) {
		courseArray[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
	}
	
	public Course emitCourse() {
		return courseArray[rand.nextInt(nElems)];
	}

}
