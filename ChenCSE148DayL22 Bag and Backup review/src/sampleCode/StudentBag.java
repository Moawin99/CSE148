package sampleCode;

import java.io.Serializable;

public class StudentBag implements Serializable{
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}

	public void insert(String name) {
		Student s = new Student(name);
		try {
			arr[nElems++] = s;
		} catch (ArrayIndexOutOfBoundsException e) {
			Student[] arrLarger = new Student[2 * arr.length];
			for(int i = 0; i < nElems; i++) {
				arrLarger[i] = arr[i];
			}
			arr = arrLarger;
			arr[nElems++] = s;
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public Student[] getArr() {
		return arr;
	}

	public int getnElems() {
		return nElems;
	}

}
