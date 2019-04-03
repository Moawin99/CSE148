package functional_interface;

public class Demo {

	public static void main(String[] args) {
		Calculator multiply = (x1, x2) -> { // lambda expression
			return x1 * x2;
		};
		
		Calculator add = (x1, x2) -> { // lambda expression
			return x1 + x2;
		};
		
		System.out.println(multiply.calculate(5, 10));
		System.out.println(add.calculate(5, 10));

	}

}
