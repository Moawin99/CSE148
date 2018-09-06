package p1ClassesIntro;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.setName("John");
//		s1.setAge(20);
//		s1.setGpa(4.0);
//		s1.setId("1111");
//		s1.setAll("John", "1111", 21, 3.0);
		System.out.println(s1);
		
		// create another object
		Student s2 = new Student("Jane", "3333", 20, 4.0);
		System.out.println(s2);
//		System.out.println(s1.getName());
//		System.out.println(s1.getId());
//		System.out.println(s1.getAge());
//		System.out.println(s1.getGpa());
		
//		s1.driveToSchool();
//		s1.takeTheBus();
//		
//		Student s2 = new Student();
//		s2.driveToSchool();
//		s2.takeTheBus();
	}

}
