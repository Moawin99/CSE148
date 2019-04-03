package courses;

public class Person {
	private String firstName;
	private String lastName;
	private String id;
	private static int idCounter = 0;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = String.valueOf(idCounter++);
	}
	
	
	
}
