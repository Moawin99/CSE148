package p1Inheritance;

public class Pet {
	private String name;
	private int age;
	private final String OWNER_ADDRESS = "1 Main Street";

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age;
	}
	

	

}
