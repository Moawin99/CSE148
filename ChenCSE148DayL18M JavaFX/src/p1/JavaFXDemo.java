package p1;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		HBox hbox1 = buildHBox("Name", "Name");
		
		Label idLbl = new Label("ID");
		idLbl.setAlignment(Pos.CENTER_LEFT);
		idLbl.setPrefSize(70, 30);
		TextField idField = new TextField();
		
		idField.setPromptText("id");
		Button okBtn = new Button("OK");
		okBtn.setPrefSize(100, 30);
		
		
		HBox lblAndTextField2 = new HBox(10);
		lblAndTextField2.setAlignment(Pos.CENTER);
		lblAndTextField2.getChildren().addAll(idLbl, idField);
		VBox box = new VBox(30);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(lblAndTextField1, lblAndTextField2, okBtn);
		Scene scene = new Scene(box, 400, 300);
		stage.setScene(scene);
		stage.show();
	}
	
	private HBox buildHBox(String lblString, String txtfldText) {
		Label lbl = new Label(lblString);
		lbl.setAlignment(Pos.CENTER_LEFT);
		lbl.setPrefSize(70, 30);
		TextField textfield = new TextField();
		textfield.setPromptText(txtfldText);
		HBox box = new HBox(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(lbl, textfield);
		return box;
	}

}
