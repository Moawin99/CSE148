package p1Inheritance;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("John", "111-22-1234");
//		System.out.println(p1.toString());
		PartTimeStudent pts1 = new PartTimeStudent("John", "111-22-3333", 4.0, 8);
//		System.out.println(pts1);
		System.out.println(pts1.getGpa());
		System.out.println(pts1.getSuperGpa());
	}
// Polymorphism: A super class variable type can reference objects of subclasses.
}
