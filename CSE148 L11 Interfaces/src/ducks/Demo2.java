package ducks;

public class Demo2 {

	public static void main(String[] args) {
		Flyable bird1 = () -> {
			System.out.println("Fly like a chicken!");
		};
		
		bird1.fly();
	}

}
