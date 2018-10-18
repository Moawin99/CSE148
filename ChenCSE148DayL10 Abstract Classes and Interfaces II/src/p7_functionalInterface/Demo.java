package p7_functionalInterface;

public class Demo {

	public static void main(String[] args) {
		Calculatable add = (x, y) -> x + y;
		Calculatable subtract = (x, y) -> x - y;
		Calculatable multiply = (x, y) -> x * y;
		Calculatable divide = (x, y) -> x / y;
		
		System.out.println(add.calculate(2, 5));
		System.out.println(subtract.calculate(2, 5));
		System.out.println(multiply.calculate(2, 5));
		System.out.println(divide.calculate(2, 5));
		
		System.out.println(divide.doubleIt(5));
		System.out.println(multiply.squareIt(2));

	}

}
