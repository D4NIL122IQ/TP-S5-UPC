package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class PeremiereGUI extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Premiere GUI");
		BorderPane pane= new BorderPane();
		Label lab1 = new Label("Bonjour");
		Label lab2 = new Label("Premiere GUI JavaFX 17");
		Scene scene = new Scene(pane);
		pane.setCenter(lab1);
		pane.setCenter(lab2);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

