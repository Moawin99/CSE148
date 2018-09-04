package p1ClassesIntro;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 19;
		s1.gpa = 4.0;
		s1.name = "John";
		s1.id = "1234567";
		s1.driveToSchool();
		s1.takeTheBus();
		
		Student s2 = new Student();
		s2.age = 20;
		s2.gpa = 2.0;
		s2.name = "Jane";
		s2.id = "7654321";
		s2.driveToSchool();
		s2.takeTheBus();
	}

}
