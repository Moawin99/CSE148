package p5_anonymouseClass;

public class Demo {

	public static void main(String[] args) {
		Calculatable c1 = new Calculatable() {

			@Override
			public int square(int number) {
				return number * number;
			}
			
		};
		System.out.println(c1.square(5));
	}

}
