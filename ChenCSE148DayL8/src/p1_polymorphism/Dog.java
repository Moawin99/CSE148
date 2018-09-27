package p1_polymorphism;

public class Dog extends Pet {
	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
//	@Override
//	public void setAge(int amount) {
//		super.setAge(super.getAge() + amount);
//	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return super.toString() + ", breed=" + breed;
	}

}
