package hw2_P9;

public class Demo {

	public static void main(String[] args) {
		String[] courses = {"CSE110", "CSE118", "CSE148"};
		
		String[] classes = new String[5];
		classes[0] = "CSE110";
		classes[1] = "CSE118";
		classes[2] = "CSE148";
//		classes[3] = "CSE110";
//		classes[4] = "CSE118";
//		classes[5] = "CSE148";
		
		for (int i = 0; i < classes.length; i++) {
			System.out.print(classes[i] + ", ");
		}
	}

}
