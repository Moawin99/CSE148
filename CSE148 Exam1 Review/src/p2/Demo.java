package p2;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Student(Major.CSE);
		Person p2 = new Student(Major.CST);
		Person f1 = new Faculty(1111);
		Person f2 = new Faculty(2222);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(f1);
		System.out.println(f2);
	}

}
