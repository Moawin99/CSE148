package finalProjectTemplate;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class MainWindow {
	TabPane tabPane = new TabPane();
	BodyBag bodyBag = new BodyBag(10);
	
	public MainWindow(Stage stage) {
		Tab studentTab = new Tab("Student");
		Tab facultyTab = new Tab("Faculty");
		studentTab.setContent((new StudentPane(this, bodyBag)).getPane());
		facultyTab.setContent((new FacultyPane(this, bodyBag)).getPane());
		tabPane.getTabs().addAll(studentTab, facultyTab);
		stage.setScene(new Scene(tabPane, 500, 300));
		stage.show();
	}

}
