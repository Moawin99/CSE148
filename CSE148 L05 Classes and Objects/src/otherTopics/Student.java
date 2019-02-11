package otherTopics;

public class Student {
	private String name;
	private String id;
	private static int idCounter;
	
//	public Student() { // default constructor
//		
//	}
	// overloaded methods
	public Student() { // no-arg constructor
		name = "John";
		id = "00000000";
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public static int getIdCounter() {
		return idCounter;
	}
	
	public String toString() {
		return "Name: " + name + "\t" + "ID: " + id;
	}

}
