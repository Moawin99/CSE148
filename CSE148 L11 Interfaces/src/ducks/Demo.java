package ducks;

public class Demo {

	public static void main(String[] args) {
		RedheadDuck rhd1 = new RedheadDuck("Red1", 1);
		rhd1.fly();
		rhd1.swim();
		rhd1.quack();
		
		GreenheadDuck ghd1 = new GreenheadDuck("Green1", 1);
		ghd1.fly();
		ghd1.swim();
		ghd1.quack();
	}

}
