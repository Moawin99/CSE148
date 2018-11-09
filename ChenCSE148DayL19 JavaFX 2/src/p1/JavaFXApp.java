package p1;

import java.util.Arrays;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApp extends Application {

	private String[] names = new String[100];
	private int nElems = 0;

	public static void main(String[] args) {
		launch(args);
	}

	// @Override
	// public void init() {
	// System.out.println("running init");
	// }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label nameLbl = new Label("Name");
		TextField nameField = new TextField();
		HBox hBox1 = new HBox(20);
		hBox1.setAlignment(Pos.CENTER);
		hBox1.getChildren().addAll(nameLbl, nameField);

		Button okBtn = new Button("OK");
		okBtn.setOnAction(event -> {
			names[nElems++] = nameField.getText();
			nameField.clear();
			for (int i = 0; i < nElems; i++) {
				System.out.println(names[i]);
			}
		});

		VBox root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hBox1, okBtn);

		Scene scene = new Scene(root, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("The end!");
	}

}
