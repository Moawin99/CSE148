import java.io.Serializable;

public class StudentBag implements Serializable{
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public Student find(String id) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}
}
