package objects_and_classes;

public class Demo1 {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 4.0);
		Student s2 = new Student("Bill", 3.5);
		Student s3 = new Student("Cathy");
		Student s4 = new Student();
		Student s5 = new Student("Julie");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		Student s6 = new Student(s1);
		System.out.println(s6);
		
	}

}
