package p8_functional_methods;

public class Demo {

	public static void main(String[] args) {
		IntCalculator add = (x, y) -> x + y;
		IntCalculator subtract = (x, y) -> x - y;
		IntCalculator multiply = (x, y) -> x * y;
		IntCalculator divide = (x, y) -> x / y;
		System.out.println(add.calculate(5, 2));
		System.out.println(subtract.calculate(5, 2));
		System.out.println(multiply.calculate(5, 2));
		System.out.println(divide.calculate(5, 2));
		System.out.println(add.squareIt(5));
	}

}
