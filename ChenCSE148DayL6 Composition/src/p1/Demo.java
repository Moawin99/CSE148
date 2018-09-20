package p1;

public class Demo {

	public static void main(String[] args) {
//		Course c1 = new Course("CSE148", "OOP");
//		String courseNumber = c1.getCourseNumber();
//		c1.setCourseNumber("CSE110");
//		System.out.println(c1.getCourseNumber());
//		System.out.println(courseNumber);
		
		Textbook textbook1 = new Textbook("Java", "111-222", 50.99, "Chen");
		Instructor instructor1 = new Instructor("Chen", "Professor", 10000);
		Student s1 = new Student("John", "111111", 4.0);
		Student s2 = new Student("Jane", "222222", 3.5);
		Student[] students = {s1, s2};
		Course c1 = new Course("CSE148", "OOP", textbook1, instructor1, students);
//		System.out.println(c1.getInstructor());
		Instructor instructor2 = c1.getInstructor();
//		System.out.println(instructor2);
		instructor2.setName("Smith");
//		System.out.println(instructor2.getName());
//		System.out.println(c1.getInstructor());
		System.out.println(c1);
	}

}
