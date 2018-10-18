package p3_AnonymousClass;

public class Demo {

	public static void main(String[] args) {
		IntCalculator calc1 = new IntCalculator() {

			@Override
			public int square(int number) {
				return number * number;
			}
			
		};
		System.out.println(calc1.square(5));
	}

}
