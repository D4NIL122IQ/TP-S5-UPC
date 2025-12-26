package cf2024;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("GUI titre");
		Pane pane= new MyPane();
		Scene scene= new Scene(pane);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
		
	}

	public static void main(String args[]) {
		launch(args);
	}
}
