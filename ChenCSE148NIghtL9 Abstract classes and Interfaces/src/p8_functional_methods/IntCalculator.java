package p8_functional_methods;

public interface IntCalculator {
	// functional method
	int calculate(int number1, int number2);
//	// functional method
//	double power(int n1);
	
	default int squareIt(int number) {
		return number * number;
	}

	default int doubleIt(int number) {
		return number * 2;
	}
}
