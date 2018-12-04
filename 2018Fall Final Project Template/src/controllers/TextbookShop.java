package controllers;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import model.Textbook;
import model.TextbookBag;
import view.TextbookPane;

public class TextbookShop {
	private TextbookPane textbookPane;
	private MenuBarShop menuBarShop;
	private TextbookBag textbookBag;
	private BorderPane root;

	public TextbookShop(TextbookBag textbookBag, MenuBarShop menuBarShop, BorderPane root) {
		textbookPane = new TextbookPane();
		this.menuBarShop = menuBarShop;
		this.textbookBag = textbookBag;
		this.root = root;
		setCallbacks();
	}

	public Pane getTextbookPane() {
		return textbookPane.getTextbookPane();
	}

	private void setCallbacks() {
		menuBarShop.getInsertTextbookMenuItem().setOnAction(e -> {
			root.setCenter(textbookPane.getTextbookPane());
		});
		
		textbookPane.getInsertBtn().setOnAction(e -> {
			String title = textbookPane.getTitle();
			String isbn = textbookPane.getIsbn();
			String author = textbookPane.getAuthor();
			double price = textbookPane.getPrice();
			Textbook textbook = new Textbook(title, isbn, author, price);
			textbookBag.insert(textbook);
			textbookPane.clearAllFields();
			System.out.println("The book is added");
		});
	}

}
