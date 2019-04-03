package p3;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Student(Major.CSE);
		Person p2 = new Student(Major.CST);
		Person f1 = new Faculty(1111);
		Person f2 = new Faculty(2222);
		PersonBag theBag = new PersonBag(10);
		theBag.insert(p1);
		theBag.insert(p2);
		theBag.insert(f1);
		theBag.insert(f2);
		theBag.display();
		theBag.deleteById("0001");
		theBag.deleteById("0003");
		System.out.println("After deletions: ");
		theBag.display();
	}

}
