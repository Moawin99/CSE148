package recursion1;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 7, 9, 13, 15, 20, 25, 32, 61};
		System.out.println(binarySearch(numbers, 0, 10, 15));
	}
	
	private static int binarySearch(int[] array, int first, int last, int value) {
		int middle;
		if(first > last) {
			return -1;
		} 
		middle = (first+ last) / 2;
		if(array[middle] == value) {
			return middle;
		} else {
			if (array[middle] < value) {
				return binarySearch(array, middle+1, last, value);
			} else {
				return binarySearch(array, first, middle-1, value);
			}
		}
	}

}
