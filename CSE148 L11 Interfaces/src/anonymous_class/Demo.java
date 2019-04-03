package anonymous_class;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator() {

			@Override
			public double calculate(double n1, double n2) {
				return n1 + n2;
			}

			@Override
			public void describe(double n1, double n2) {
				System.out.println("The two numbers are: " + n1 +" and " + n2);;
			}
			
		};
		System.out.println("The sum is: " + c1.calculate(5, 10));
		
		Calculator c2 = new Calculator() {

			@Override
			public double calculate(double n1, double n2) {
				return n1 * n2;
			}

			@Override
			public void describe(double n1, double n2) {
				// TODO Auto-generated method stub
			}
			
		};
		System.out.println("The product is: " + c2.calculate(5, 10));
	}

}
