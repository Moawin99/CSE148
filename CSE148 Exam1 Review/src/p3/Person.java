package p3;

import utils.IDConverter;
import utils.NamePicker;

public abstract class Person {
	private String firstName;
	private String lastName;
	private String id;

	private static int idCounter = 1;
	private static final int ID_LENGTH = 4;

	public Person() {
		this.firstName = NamePicker.pickFirstName();
		this.lastName = NamePicker.pickLastName();
		this.id = IDConverter.convertId(ID_LENGTH, String.valueOf(idCounter++));
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = IDConverter.convertId(ID_LENGTH, String.valueOf(idCounter++));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Person.idCounter = idCounter;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", id=" + id;
	}
	
	

}
