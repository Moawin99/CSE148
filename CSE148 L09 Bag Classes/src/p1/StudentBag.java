package p1;

public class StudentBag {
	private Student[] arr;
	private int maxSize;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}
	
	public Student deleteByName(String name) {
		int i = 0;
		for(i =0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				break;
			}
		}
		
		if( i == nElems ) { // not exist
			return null;
		} else { // found
			Student temp = arr[i];
			for(int j = i; j < nElems-1; j++) {
				arr[j] = arr[j+1]; 
			}
			nElems--;
			return temp;
		}
	}

	public Student findByName(String name) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				return arr[i];
			}
		}
		return null;
	}

	public Student findById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}

	public void insert(Student student) {
		arr[nElems++] = student;
	}

	public void showBag() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
