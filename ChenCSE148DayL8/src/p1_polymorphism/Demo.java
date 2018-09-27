package p1_polymorphism;

public class Demo {

	public static void main(String[] args) {
		Pet p1 = new Pet("Pet One", 5);
//		System.out.println(p1);
//		p1.setName("Pet Two");
//		System.out.println(p1.getName());
		Dog d1 = new Dog("Dog One", 7, "Mixed");
//		((Dog)d1).setAge(1);
//		System.out.println(((Pet)d1).getAge());
		Pet c1 = new Cat("Cat One", 3, "White");
//		System.out.println(((Dog)d1).getBreed());
//		System.out.println(((Cat)c1).getColor());
		Pet[] petArray = new Pet[3];
		petArray[0] = p1;
		petArray[1] = d1;
		petArray[2] = c1;
//		for(Pet p : petArray) {
//			if (p instanceof Dog) {
//				System.out.println(((Dog) p).getBreed());
//			} else if (p instanceof Cat) {
//				System.out.println(((Cat) p).getColor());
//			} else {
//				System.out.println("It's a pet, so no color no breed!");
//			}
//		}
		
		System.out.println(c1 instanceof Pet);
	}

}
