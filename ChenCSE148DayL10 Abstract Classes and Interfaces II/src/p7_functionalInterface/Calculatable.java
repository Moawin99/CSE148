package p7_functionalInterface;

public interface Calculatable {
	//functional method
	int calculate(int number1, int number2);
	
	default int doubleIt(int n) {
		return n * 2;
	}
	
	default int squareIt(int n) {
		return n * n;
	}

}
