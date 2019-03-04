package hw5;

public class PersonBag {
	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void insert(Person person) {
		personArray[nElems++] = person;
	}
	
	public Person findPersonById(String id) {
		return null;
	}
}
