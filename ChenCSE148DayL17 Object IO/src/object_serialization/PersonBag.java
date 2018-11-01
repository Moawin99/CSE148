package object_serialization;

public class PersonBag {
	private Person[] array;
	private int nElems;

	public PersonBag(int maxSize) {
		array = new Person[maxSize];
		nElems = 0;
	}

	public double findHighestGPA() {
		double largestGPA = ((Student)array[0]).getGpa();
		for (int i = 1; i < nElems; i++) {
			if(array[i] instanceof Student && ((Student)array[i]).getGpa() > largestGPA) {
				largestGPA = ((Student)array[i]).getGpa();
			}
		}
		return largestGPA;
	}

	public Person[] findMaxGPA() {

	}

	public Person deleteStudentById(String id) {
		int i = -1;
		for (i = 0; i < nElems; i++) {
			if (array[i].getId().equals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Person temp = array[i];
			for (int j = i; j < nElems - 1; j++) {
				array[j] = array[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Person findStudentById(String id) {
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
		array[nElems] = person;
		nElems++;
	}

}
