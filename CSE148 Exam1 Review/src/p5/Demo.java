package p5;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(Major.CSE);
		Student s2 = new Student(Major.CST);
		Faculty f1 = new Faculty(1111);
		Faculty f2 = new Faculty(2222);
//		PersonBag theBag = new PersonBag(10);
//		theBag.insert(p1);
//		theBag.insert(p2);
//		theBag.insert(f1);
//		theBag.insert(f2);
//		theBag.display();
//		theBag.deleteById("0001");
//		theBag.deleteById("0003");
//		System.out.println("After deletions: ");
//		theBag.display();
		
//		System.out.println(((Student)p1).bill());
//		System.out.println(((Faculty)f1).bill());
		
		BillableBag theBag = new BillableBag(10);
		theBag.insert(f1);
		theBag.insert(f2);
		theBag.insert(s1);
		theBag.insert(s2);
		System.out.println(theBag.totalBillableAmount());
	}

}
