package p7_default_methods;

public interface IntCalculator {
	
	default int square(int number) {
		return number * number;
	}
	
	int doubleIt(int number);
}
