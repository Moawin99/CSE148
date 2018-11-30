package model;

public class Textbook {
	private String title;
	private String isbn;

	public Textbook(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Title=" + title + ", isbn=" + isbn;
	}

}
