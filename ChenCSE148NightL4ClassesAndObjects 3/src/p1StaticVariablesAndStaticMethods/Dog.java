package p1StaticVariablesAndStaticMethods;

public class Dog {
	// instance variables
	private String name;
	private int age;
	private String breed;
	private double weight;
	
	// static variables, or class variables
	private static int NumberOfLegs = 4;
	
	// final variable
	private final int NUMBER_OF_HEADS = 1;

	
	
	
	public int getNUMBER_OF_HEADS() {
		return NUMBER_OF_HEADS;
	}

	// instance methods
	public Dog(String name, int age, String breed, double weight) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.weight = weight;
	}

	public Dog() { // no-arg constructor
	}
	
	
	// static methods
	public static int getNumberOfLegs() {
		return NumberOfLegs;
	}

	public static void setNumberOfLegs(int numberOfLegs) {
		NumberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", weight=" + weight + "]";
	}
	
	
	
	
	
	

}
