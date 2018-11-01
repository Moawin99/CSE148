package object_serialization;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private String name;
	private String gender;
	private String id;

	private static int idNumber = 0;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.id = String.valueOf(idNumber++);
	}

	public Person() {
		name = "";
		gender = "";
		this.id = String.valueOf(idNumber++);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Gender=" + gender + ", ID=" + id;
	}

}
