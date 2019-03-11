package ducks;

public class GreenheadDuck extends SuperDuck implements Swimmable, Flyable, Quackable  {

	public GreenheadDuck(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "GreenheadDuck: " + super.toString();
	}

	@Override
	public void swim() {
		System.out.println("Greenhead duck swimming!");
	}

	@Override
	public void quack() {
		System.out.println("Greenhead going quack, quakc, quack!");
	}

	@Override
	public void fly() {
		System.out.println("Greenhead duck flying");
	}

}
