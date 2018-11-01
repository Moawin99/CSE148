package object_Serialization;

public class PersonBag {
	private Person[] array;
	private int nElems;

	public PersonBag(int maxSize) {
		array = new Person[maxSize];
		nElems = 0;
	}

	public Person deletePersonById(String id) {
		int i = -1;
		for (i = 0; i < nElems; i++) {
			if (array[i].getId().equals(id)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Person tmp = array[i];
			for (int j = i; j < nElems - 1; j++) {
				array[j] = array[j + 1];
			}
			nElems--;
			return tmp;

		}
	}

	public Person findPersonById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (array[i].getId().equals(id)) {
				return array[i];
			}
		}

		return null;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public void insert(Person person) {
		array[nElems++] = person;
	}

}
