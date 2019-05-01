package p1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new MyContainer().getBox2();
		Scene scene = new Scene(root, 50, 40);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My Window");
		
//		Stage secondaryStage = new Stage();
//		HBox myHBox = new HBox(20);
//		Button btn1 = new Button("BTN1");
//		Button btn2 = new Button("BTN2");
//		myHBox.getChildren().addAll(btn1, btn2);
//		Scene secondaryScene = new Scene(myHBox, 400, 100);
//		secondaryStage.setScene(secondaryScene);
//		secondaryStage.showAndWait();
		primaryStage.show();
	}

}
