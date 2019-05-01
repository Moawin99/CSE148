package model;

public class TextbookBag {
	private Textbook[] arr;
	private int nElems;

	public TextbookBag(int maxSize) {
		arr = new Textbook[maxSize];
		nElems = 0;
	}

	public void insert(String title, String isbn, double price) {
		Textbook newBook = new Textbook(title, isbn, price);
		arr[nElems++] = newBook;
	}

}
