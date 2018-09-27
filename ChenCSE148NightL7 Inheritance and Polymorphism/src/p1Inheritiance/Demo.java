package p1Inheritiance;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("John", "111-22-3333");
//		System.out.println(p1.toString());
//		Student s1 = new Student("John", "111-22-333",3.5);
//		System.out.println(s1.getGpa());
	
		PartTimeStudent pts1 = new PartTimeStudent("John", "111-22-3333", 3.5, 8);
		System.out.println(pts1.getGpa());
	}

}
