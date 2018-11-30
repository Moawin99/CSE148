package finalProjectTemplate;

public class BodyBag {
	
	private Person[] personArray;
	private int nElems = 0;
	
	public BodyBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void add(Person person) {
		personArray[nElems++] = person;
	}
	
	public Person findById(int id) {
		int index = -1;
		for(index = 0; index < nElems; index++) {
			if(personArray[index].getId() == id ) {
				break;
			}
		}
		
		if(index == nElems) {
			return null;
		} else {
			return personArray[index];
		}
	}
	
	public Person removeById(int id) {
		
		int index = -1;
		for(index = 0; index < nElems; index++) {
			if(personArray[index].getId() == id) {
				break;
			}
		}
		
		if (index == nElems) {
			return null;
		} else {
			Person temp = personArray[index];
			for(int i = index + 1; i < nElems; i++) {
				personArray[i - 1] = personArray[i];
			}
			return temp;
		}
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}

}
