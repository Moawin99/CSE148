package p1StaticVariablesAndStaticMethods;

public class Demo {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog("Buddy", 5, "Golden", 75.5);
		d1.setNumberOfLegs(3);
		System.out.println(Dog.getNumberOfLegs());
		System.out.println(d1.getName());
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}

}
