package p7_default_methods;

public class Calculator implements IntCalculator{

	@Override
	public int doubleIt(int number) {
		return number * 2;
	}
	
	@Override
	public int square(int number) {
		return number * number;
	}

}
