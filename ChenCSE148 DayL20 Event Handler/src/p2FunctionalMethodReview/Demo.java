package p2FunctionalMethodReview;

public class Demo {

	public static void main(String[] args) {
		FlyInterface myFly = (str) -> {System.out.println("Fly like a " + str);};
		myFly.fly("bird");
		myFly.fly("penguin");
		
	}

}
