package p1Intro;

public class Demo {

	public static void main(String[] args) {
		Student s1; // a class is also a datatype
		Student s2;
		
		s1 = new Student(); //no-arg constructor
		s2 = new Student("Jane", "2222", 21, 3.5);
		System.out.println(s1.getSchoolName());
		System.out.println(s2.getSchoolName());
		s1.setSchoolName("NCCC");
		System.out.println(Student.getSchoolName());
		System.out.println(s2.getSchoolName());
		
//		s1.setName("Julio");
//		s2 = s1;
//		s2.setName("Joe");
//		s1.setName("Billy");
//		System.out.println("The information of the object is:\n " + s1);
	}

}
