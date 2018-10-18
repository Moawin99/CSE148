package p6_private_inner_class;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.square(7));
	}

	private static class Calculator implements IntCalculator{

		@Override
		public int square(int number) {
			return number * number;
		}
		
	}
}
