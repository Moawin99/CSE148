package object_Serialization;

import java.io.Serializable;

public abstract class Person implements Serializable{
	private String name;
	private String id;

	private static int idNumber = 0;

	public Person(String name) {
		this.name = name;
		id = String.valueOf(idNumber++);
	}

	public Person() {
		name = "";
		id = String.valueOf(idNumber++);
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

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", ID=" + id;
	}

}
