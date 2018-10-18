package p6_defaultMethods;

public interface Calculatable {
	default int add(int n1, int n2) {
		return n1 + n2;
	}
	
	default int subtract (int n1, int n2) {
		return n1 - n2;
	}
	
	default int multiply(int n1, int n2) {
		return n1 * n2;
	}
	
	default int divide(int n1, int n2) {
		return n1 / n2;
	}
}
