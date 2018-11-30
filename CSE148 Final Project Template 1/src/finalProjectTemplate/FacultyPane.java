package finalProjectTemplate;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FacultyPane {
	private Scene scene;
	private BodyBag bodyBag;
	private MainWindow window;
	private VBox pane;
	
	public FacultyPane(MainWindow window, BodyBag bodyBag) {
		Label nameLbl = new Label("Name");
		Label idLbl = new Label("ID");
		Label salaryLbl = new Label("Salary");
		Button addButton = new Button("Add");
		Button removeButton = new Button("Remove");
		Button findButton = new Button("Find");
		Button updateButton = new Button("Update");
		TextField nameField = new TextField();
		TextField idField = new TextField();
		TextField salaryField = new TextField();
		
		HBox h1 = new HBox(10);
		HBox h2 = new HBox(10);
		HBox h3 = new HBox(40);
		h1.setAlignment(Pos.CENTER);
		h2.setAlignment(Pos.CENTER);
		h3.setAlignment(Pos.CENTER);
		pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		h1.getChildren().addAll(nameLbl, nameField, idLbl, idField);
		h2.getChildren().addAll(salaryLbl, salaryField);
		h3.getChildren().addAll(addButton, removeButton, findButton, updateButton);
		pane.getChildren().addAll(h1, h2, h3);
		scene = new Scene(pane, 400, 200);
		this.window = window;
		this.bodyBag = bodyBag;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public VBox getPane() {
		return pane;
	}

}
