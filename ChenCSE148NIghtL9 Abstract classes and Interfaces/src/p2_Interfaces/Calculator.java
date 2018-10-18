package p2_Interfaces;

public class Calculator implements IntCalculator {

	@Override
	public int square(int number) {
		return number * number;
	}

}
