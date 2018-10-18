package p7_default_methods;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(IntCalculator.square(8));
		System.out.println(c1.doubleIt(5));
	}

}
