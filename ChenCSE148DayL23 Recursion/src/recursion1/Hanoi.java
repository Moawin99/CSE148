package recursion1;

public class Hanoi {

	private static int numDiscs = 5;
	private static int count = 0;
	
	public static void main(String[] args) {
		moveDiscs(numDiscs, 1, 3, 2);
	}

	private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num > 0) {
			moveDiscs(num-1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc form peg " + fromPeg + " to peg " + toPeg + " -> " + ++count);
			moveDiscs(num-1, tempPeg, toPeg, fromPeg);
		}
	}
}
