package hw5;

import utils.IDFormatter;

public abstract class Person {
	private String firstName;
	private String lastName;
	private String id;
	private Address address;
	
	private static int idCounter = 0;;

	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		final int ID_LENGTH = 8;
		this.id = IDFormatter.formatID(ID_LENGTH, String.valueOf(idCounter++));
		this.address = address;
	}


}
