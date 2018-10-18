package p6_defaultMethods;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2,  5));
		System.out.println(c1.multiply(2,  5));
		System.out.println(c1.subtract(2,  5));
		System.out.println(c1.divide(2,  5));
	}

}
