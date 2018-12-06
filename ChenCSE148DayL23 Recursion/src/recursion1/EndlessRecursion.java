package recursion1;

public class EndlessRecursion {
	private static int n = 0;
	public static void main(String[] args) {
		message();
	}

	private static void message() {
//		while (true) {
		if(n < 10) {  // base case
			System.out.println("This is a recursive method! " + n++ );
			message();
		}
//		}
	}
	
	

}
