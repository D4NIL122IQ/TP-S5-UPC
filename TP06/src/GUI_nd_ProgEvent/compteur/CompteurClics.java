package GUI_nd_ProgEvent.compteur;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;


public class CompteurClics extends Application{
	public void start(Stage stage) throws Exception {
		stage.setTitle("Compteur de Clics" );
		Pane myPane= new CompteurPane();
		Scene scene= new Scene(myPane);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
		}
		
		public static void main(String[] args) {
		launch(args);}
}
