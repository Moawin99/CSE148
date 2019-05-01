package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Textbook;
import model.TextbookBag;
import utils.Utils;

public class App extends Application {

	public static void main(String[] args) {
		Utils.restore();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextbookBag textbookBag = new TextbookBag(1000);
		BorderPane root = new BorderPane();
		Button restoreButton = new Button("Restore");
		Button backupButton = new Button("Backup");
		Button addButton = new Button("Add");
		
		
		
		Button removeButton = new Button("Remove");
		VBox centerBox = new VBox(20);
		TextField titleField = new TextField();
		TextField isbnField = new TextField();
		TextField priceField = new TextField();
		centerBox.getChildren().addAll(titleField, isbnField, priceField);
		
		addButton.setOnAction(e -> {
			String title = titleField.getText();
			String isbn = isbnField.getText();
			double price = Double.parseDouble(priceField.getText());
			textbookBag.insert(title, isbn, price);
		});
		
		root.setTop(restoreButton);
		root.setBottom(backupButton);
		root.setRight(addButton);
		root.setLeft(removeButton);
		root.setCenter(centerBox);
		Scene scene = new Scene(root, 700, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("College Management System");
		primaryStage.show();
	}

}
