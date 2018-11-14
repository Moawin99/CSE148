package p1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box = new HBox(20);
		box.setAlignment(Pos.CENTER);
		TextField nameField = new TextField();
		Button btn = new Button("OK");
		
		btn.setOnAction(e -> {
			nameField.setText("Hello, " + nameField.getText());
		});
		
		box.getChildren().addAll(nameField, btn);
		Scene scene = new Scene(box, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
