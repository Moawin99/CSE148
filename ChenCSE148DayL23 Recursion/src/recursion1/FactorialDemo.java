package recursion1;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(factorial(17));
		System.out.println(Long.MAX_VALUE);
	}

	private static long factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
