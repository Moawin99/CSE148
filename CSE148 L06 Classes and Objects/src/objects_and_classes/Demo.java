package objects_and_classes;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 1.0);
		System.out.println(s1);
		
		Student s2 = new Student("Adam", 1.0);
		System.out.println(s2);
		
		Student s3 = new Student("Adam");
		System.out.println(s3);
		
		Student s4 = new Student();
		System.out.println(s4);
		
		Student s5 = new Student(s1); // deep copy
		System.out.println(s5);
		
		System.out.println(s1 == s5);
		
		Student s6 = s1; // shallow copy
		System.out.println(s1 == s6);
		
		Student s7 = s1.shallowCopy(s1);
		System.out.println(s1 == s7); // true
		System.out.println(s1.equals(s7)); // true
		
		Student s8 = s1.deepCopy(s1);
		System.out.println(s1 == s8); // false
		System.out.println(s1.equals(s8)); // false
		
		//In general, when comparing two reference variables, == is the same as .equals
		// They both compare the content of the variables not the content of the objects
		
		s1.setIdCounter(10);
		System.out.println(s1.getIdCounter());
		System.out.println(s4.getIdCounter());
	}

}
