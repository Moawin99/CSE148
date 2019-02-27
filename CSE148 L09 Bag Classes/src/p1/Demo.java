package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", "111");
		Student s2 = new Student("Bill", "222");
		Student s3 = new Student("Cat", "333");
		Student s4 = new Student("Dave", "444");
		Student s5 = new Student("Ellen", "555");
		Student s6 = new Student("Frankie", "666");
		StudentBag theBag = new StudentBag(10);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.insert(s5);
		theBag.insert(s6);
		
		theBag.deleteByName("Dave");
		System.out.println(theBag.findByName("Dave"));
		
//		System.out.println(theBag.findByName("Dave"));
//		System.out.println(theBag.findById("888"));
		theBag.showBag();
		
	}

}
