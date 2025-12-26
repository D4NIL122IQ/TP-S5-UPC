package cd2022;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle(" Calculatrice␣Simple");
		Scene sc = new Scene(new MyPane());
		stage.setScene(sc);
		stage.sizeToScene();
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
