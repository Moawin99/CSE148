package p1;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyContainer {
	private TextField nameField;
	private TextField idField;
	private VBox box2;
	private Button okBtn;
	private Button cancelBtn;

	public MyContainer() {
		makeBtns();
		makeTextFields();
		HBox box1 = new HBox(40);
		box1.setAlignment(Pos.CENTER);
		box2 = new VBox(30);
		box2.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(okBtn, cancelBtn);
		box2.getChildren().addAll(nameField, idField, box1);
		setUpBtnListeners();

	}
	
	private void makeTextFields() {
		nameField = new TextField();
		idField = new TextField();
		nameField.setMaxSize(200, 25);
		nameField.setPromptText("Name");
		idField.setMaxSize(200, 25);
		idField.setPromptText("ID");
	}
	
	private void makeBtns() {
		okBtn = new Button("OK");
		cancelBtn = new Button("Cancel");
		okBtn.setPrefSize(70, 25);
		cancelBtn.setPrefSize(70, 25);
	}

	public VBox getBox2() {
		return box2;
	}

	private void setUpBtnListeners() {
		okBtn.setOnAction((e) -> { // lambda Expression
			nameField.setText("Hello, " + nameField.getText());
			idField.setText("F" + idField.getText());
		});

		cancelBtn.setOnAction(e -> {
//			nameField.clear();
//			idField.clear();
			Platform.exit();
		});

	}

}
