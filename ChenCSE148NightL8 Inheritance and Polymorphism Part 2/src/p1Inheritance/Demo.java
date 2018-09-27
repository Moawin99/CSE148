package p1Inheritance;

public class Demo {

	public static void main(String[] args) {
		Pet p1 = new Pet("Alan", 10);
		Dog d1 = new Dog("Bill", 5, "Mixed");
		Cat c1 = new Cat("Cathy", 8, "Black");
		// polymorphism: a reference variable of a superclass type
		// can be used to reference objects of a subclass type.
		Pet p2 = new Dog("David", 3, "Golden");
		Pet p3 = new Cat("Frank", 5, "White");
		Golden g1 = new Golden("Zack", 3, "Golden", 75);

		Pet[] pets = new Pet[6];
		
		
		pets[0] = p1;
		pets[1] = d1;
		pets[2] = c1;
		pets[3] = p2;
		pets[4] = p3;
		pets[5] = g1;

		for (Pet p : pets) {
			System.out.println(p.getName());
			System.out.println(p.getAge());
			if (p instanceof Golden) {
				System.out.println(((Golden) p).getWeight());
			} else if(p instanceof Cat) {
				System.out.println(((Cat)p).getColor());
			} else if(p instanceof Dog) {
				System.out.println(((Dog)p).getBreed());
			} else{
				System.out.println("It's a pet, so no breed no color no weight!");
			}
		}

		// System.out.println(p3.getName());
		// System.out.println(p3.getAge());
		// System.out.println(((Cat)p3).getColor()); // cast as a Cat
		// showPet(p1);
		// showPet(d1);
		// showPet(c1);
		// showPet(p2);
		// showPet(p3);

	}

	// private static void showPet(Pet p) {
	// System.out.println(p);
	// }

}
