package ducks;

public class RubberDuckie extends SuperDuck implements Swimmable, Quackable { 

	public RubberDuckie(String name, int age) {
		super(name, age);
	}

	@Override
	public void swim() {
		System.out.println("RubberDuckie swimming..");
	}

	@Override
	public void quack() {
		System.out.println("RubberDuckie quacks quacks quacks!");
	}

//	@Override
//	public void fly() {
//		System.out.println("Don't use this method! It's silly! They don't fly!");
//	}

	
}
