package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John Doe", 3.5);
		System.out.println(s1.getId());
		
		Student s2 = new Student("Jean Doe", 4.0);
		System.out.println(s2.getId());
		
		Student s3 = new Student("John", 3.5);
		System.out.println(s3.getId());
		
		Student s4 = new Student("Jean", 4.0);
		System.out.println(s4.getId());
		
		Student s5 = new Student(s1);
		System.out.println(s5.getId());
		
		Student s6 = Student.shallowCopy(s5);
		System.out.println(s6.getId());
		
		Student s7 = Student.deepCopy(s5);
		System.out.println(s7.getId());
		
//		Student s3 = new Student();
//		System.out.println(s3.getId());
//		
//		Student s1 = new Student("John Doe", "111", 4.0);
//		Student s2 = s1; // shallow copy
//		s2 = new Student(s1); // deep copy
//		Student s3 = Student.shallowCopy(s1);
//		s1.setName("Jean Doe");
//		Student s4 = Student.deepCopy(s2);
//		System.out.println(s2);
//		System.out.println(s3 == s1);
	}

}
