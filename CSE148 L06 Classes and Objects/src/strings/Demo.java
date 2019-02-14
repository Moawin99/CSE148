package strings;

public class Demo {

	public static void main(String[] args) {
		String name1 = "John";
		String name2 = "John";
		System.out.println(name1 == name2); // name1 and name2 are same object
		
		String name3 = new String("John");
		System.out.println(name1 == name3); // name1 and name3 are two objects
		
		// in String, == compares the contents of two reference variables
		// in String, .equals() compares the contents of two referencd objects
		
		System.out.println(name1.equals(name3)); //true
		System.out.println(name1.equals(name2)); //true
		
		name1 = "Julie";
		name2 = "Zack";		
	}

}
