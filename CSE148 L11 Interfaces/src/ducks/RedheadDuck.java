package ducks;

public class RedheadDuck extends SuperDuck implements Swimmable, Flyable, Quackable {

	public RedheadDuck(String name, int age) {
		super(name, age);

	}

	@Override
	public String toString() {
		return "RedheadDuck: " + super.toString();
	}

	@Override
	public void swim() {
		System.out.println("Redhead duck swimming!");
	}

	@Override
	public void quack() {
		System.out.println("Redhead going quack, quack, quack!");
	}

	@Override
	public void fly() {
		System.out.println("Redhead duck flying");
	}

}
